package Ra6ArraysListas.src.provenvet.model;
import java.util.HashMap;
import Ra6ArraysListas.src.provenvet.exceptions.DadesInvalidesException;
import Ra6ArraysListas.src.provenvet.exceptions.MascotaJaRegistradaException;
import Ra6ArraysListas.src.provenvet.exceptions.MascotaNoTrobadaException;

import java.util.ArrayList;

// Arxiu: GestorClinica.java
public class GestorClinica {
    // El HashMap guarda el Xip com a clau i l'objecte Mascota com a valor
    private HashMap<String, Mascota> inventari;

    public GestorClinica() {
        // TODO: Inicialitzar el HashMap
        inventari = new HashMap<>();
    }

    // TODO: Implementar el mètode per afegir una mascota
    // Si el xip ja existeix al HashMap, ha de llançar MascotaJaRegistradaException
    public void registrarMascota(Mascota m) throws MascotaJaRegistradaException {

        if (!inventari.containsKey(m.getXip())) {
            inventari.put(m.getXip(), m);
        }else{
            throw new MascotaJaRegistradaException(m.getNom() +"Se encuentra registrada");
        }
    }

    // TODO: Implementar el mètode per buscar i retornar una mascota pel seu xip
    // Si no existeix, ha de llançar MascotaNoTrobadaException
    public Mascota buscarMascota(String xip) throws MascotaNoTrobadaException {
        
        for (Mascota mascota : inventari.values()) {
            if (mascota.getXip().equalsIgnoreCase(xip)) {
                return mascota;
            }
        }
        throw new MascotaNoTrobadaException(xip);
    }

    // TODO: Implementar el mètode per afegir una visita a una mascota concreta
    // Ha de validar que el preu no sigui negatiu (DadesInvalidesException)
    // Ha de buscar la mascota i afegir-li la visita (MascotaNoTrobadaException)
    public void registrarVisita(String xip, Visita v) throws DadesInvalidesException, MascotaNoTrobadaException {
        
        if (v.getPreu() < 0) {
            throw new DadesInvalidesException(v.getData()+" Precio es negativo");
        }

        Mascota mascot = buscarMascota(xip);
        if (mascot != null) {
            mascot.afegirVisita(v);
        }else{
            throw new MascotaNoTrobadaException("Nosta el masocoto ese ");
        }

    }

    // TODO: Implementar el mètode que retorni totes les mascotes registrades
    public ArrayList<Mascota> obtenirTotesLesMascotes() {
        ArrayList<Mascota> listarMacots = new ArrayList<>();
        listarMacots.addAll(inventari.values());
        return listarMacots;
    }
}
