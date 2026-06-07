/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ra6ArraysListas.src.provenvet.model;

/**
 *
 * @author eblazquez
 */
import java.util.ArrayList;

// Arxiu: Mascota.java
public class Mascota {
    private String xip;
    private String nom;
    private String especie;
    private ArrayList<Visita> historialVisites;

    // TODO: Implementar el constructor. Atenció: ha d'inicialitzar l'ArrayList buit!
    

    public Mascota(String xip, String nom, String especie) {
        this.xip = xip;
        this.nom = nom;
        this.especie = especie;
        this.historialVisites = new ArrayList<>();
    }
    
    public String getXip() { return xip; }

    public void setXip(String xip) { this.xip = xip; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }

    public ArrayList<Visita> getHistorialVisites() { return historialVisites; }
    
    // TODO: Implementar el mètode per afegir una visita a l'historial
    public void afegirVisita(Visita v) {
        historialVisites.add(v);
    }

    // TODO: Sobreescriure el mètode toString() per mostrar les dades de la mascota

    @Override
    public String toString() {

        StringBuilder registro = new StringBuilder();

        registro.append("Xip: ").append(xip);
        registro.append(" nom: ").append(nom);
        registro.append(" especie: ").append(especie);
        registro.append(" historialVisites: ").append(historialVisites.size());
        
        

        return registro.toString();
    }

    
    
}