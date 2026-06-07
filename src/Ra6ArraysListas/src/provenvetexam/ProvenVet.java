package Ra6ArraysListas.src.provenvetexam;
import java.util.Scanner;
import java.util.ArrayList;
import Ra6ArraysListas.src.provenvet.exceptions.DadesInvalidesException;
import Ra6ArraysListas.src.provenvet.exceptions.MascotaJaRegistradaException;
import Ra6ArraysListas.src.provenvet.exceptions.MascotaNoTrobadaException;
import Ra6ArraysListas.src.provenvet.model.GestorClinica;
import Ra6ArraysListas.src.provenvet.model.Mascota;
import Ra6ArraysListas.src.provenvet.model.Visita;

// Arxiu: VistaConsola.java
public class ProvenVet {
    private Scanner scanner;
    private GestorClinica gestor;

    public ProvenVet() {
        this.scanner = new Scanner(System.in);
        this.gestor = new GestorClinica();
    }

    public void iniciar() {
        boolean sortir = false;
        while (!sortir) {
            System.out.println("\n--- CLÍNICA VETERINÀRIA ---");
            System.out.println("1. Registrar nova mascota");
            System.out.println("2. Afegir visita a una mascota");
            System.out.println("3. Llistar totes les mascotes");
            System.out.println("4. Mostrar historial d'una mascota");
            System.out.println("5. Sortir");
            System.out.print("Tria una opció: ");

            int opcio = scanner.nextInt();
            scanner.nextLine(); // Netejar el buffer

            switch (opcio) {
                case 1:
                    demanarDadesMascota();
                    break;
                case 2:
                    demanarDadesVisita();
                    break;
                case 3:
                    llistarMascotes();
                    break;
                case 4:
                    mostrarHistorial();
                    break;
                case 5:
                    sortir = true;
                    System.out.println("Fins aviat!");
                    break;
                default:
                    System.out.println("Opció no vàlida.");
            }

        }
    }

    // TODO: Demanar dades a l'usuari, crear l'objecte Mascota i passar-lo al gestor
    private void demanarDadesMascota() {
        
        try {
            System.out.print("Introdueix el xip: ");
            String xip = scanner.nextLine();
            System.out.print("Introdueix el nom: ");
            String nom = scanner.nextLine();
            System.out.print("Introdueix l'espècie: ");
            String especie = scanner.nextLine();

            Mascota newMascota = new Mascota(xip, nom, especie);

            gestor.registrarMascota(newMascota);

        } catch (MascotaJaRegistradaException e) {
            System.out.println(e.getMessage());
        }
    }

    // TODO: Demanar xip, dades de la visita, i passar-ho al gestor
    private void demanarDadesVisita() {

        try {

            System.out.print("Introdueix el xip de la mascota: ");
            String xip = scanner.nextLine();
            System.out.print("Introdueix la data (DD/MM/AAAA): ");
            String data = scanner.nextLine();
            System.out.print("Introdueix el motiu de la visita: ");
            String motiu = scanner.nextLine();
            System.out.print("Introdueix el preu de la visita: ");
            double preu = scanner.nextDouble();
            scanner.nextLine(); // Netejar buffer

            Visita newVisita = new Visita(data, motiu, preu);

            gestor.registrarVisita(xip, newVisita);
        } catch (DadesInvalidesException | MascotaNoTrobadaException e) {
            System.out.println(e.getMessage());
        }
    }

    // TODO: Obtenir la llista de mascotes del gestor i imprimir-la per pantalla
    private void llistarMascotes() {
        ArrayList<Mascota> listaMacots = gestor.obtenirTotesLesMascotes();

        for (Mascota mascota : listaMacots) {
            System.out.println(mascota.toString());
        }

    }

    // TODO: Demanar el xip, buscar la mascota al gestor i imprimir el seu historial
    // (ArrayList)
    private void mostrarHistorial() {
        try {
            
            Mascota buscarMascot = null;
            ArrayList<Visita> historial = new ArrayList<>();
                
            System.out.println("Cual es el xip de tu mascota?");
            String xip = scanner.nextLine();
                
            buscarMascot = gestor.buscarMascota(xip);
            historial = buscarMascot.getHistorialVisites();
                
            for (Visita visita : historial) {
                System.out.println(visita.toString());
            }
        } catch (MascotaNoTrobadaException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args)  {
        ProvenVet app = new ProvenVet();
        app.iniciar();
    }
}