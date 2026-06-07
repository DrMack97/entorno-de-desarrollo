
package Ra6ArraysListas;

import java.util.HashMap;
import java.util.Scanner;


public class ListReproducer {

    private HashMap<String, MusicList> map = new HashMap<>();
    private MusicList currentList;
    private Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        ListReproducer reproducer = new ListReproducer();
        reproducer.run();
    }
    
    public void run() {
        initIrish();
        initMetall();
        initSka();
            
                
        int option = -1;
        while (option != 0) {
            System.out.println("\nMenu:");
            System.out.println("0: Exit");
            System.out.println("1: Choose Style");
            System.out.println("2: Show List");
            System.out.println("3: Reproduce Song");
            System.out.println("4: Reset List");
            System.out.print("Select an option: ");
            try {
                option = Integer.parseInt(scanner.nextLine());
                switch (option) {
                    case 0:
                        System.out.println("Exiting...");
                        break;
                    case 1:
                        chooseList();
                        break;
                    case 2:
                        showCurrentListSongs();
                        break;
                    case 3:
                        reproduceSong();
                        break;
                    case 4:
                        resetList();
                        break;
                    default:
                        System.out.println("Invalid option. Try again.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void chooseList() throws Exception {
        
        try {
            System.out.println(" choose your Style: ");

            String Style = scanner.nextLine().trim();

            if (map.containsKey(Style)) {
                currentList = map.get(Style);

                System.out.println("you choose "+ currentList.getName());

                if (currentList.getSongs().isEmpty()) {
                    System.out.println("nothing to see here");
                }else{
                    for (Song song : currentList.getSongs()) {
                    System.out.println(song.getName());
                }
                }
                
            }
            
            
        } catch (Exception e) {
            System.out.println("List doesn’t exist");
        }
        
    }

    public void showCurrentListSongs() {
        int contador = 0;

        if (currentList == null) {
            System.out.println("no hay una lista selecionada");
            return;
        }
        System.out.println("Canciones: ");

        for (Song song : currentList.getSongs()) {
            contador++;
            System.out.println(contador +"- "+song.getName());
        }
    }

    public void reproduceSong() {
        
        try {

        System.out.println("Elige una cancion mi pana pana ");
        String song = scanner.nextLine().trim();

        Song currentSong = currentList.reproduceSong(song);

        if (currentSong != null) {
            System.out.println("Reproducing song - "+ currentSong.getName());

        }else{
            System.out.println("Cancion no encontrada ");
        }
        
        } catch (Exception e) {
            System.out.println("no existe "+e.getMessage());
        }
    }

    public void resetList() {
        currentList.restartMusicList();
    }
    
    public void initSka(){
        MusicList list = new MusicList("Ska", "skaList");
        list.addSong("JamaicaSka");
        list.addSong("Monkey Man");
        list.addSong("Simmer Down");

        map.put(list.getStyle(), list);
    }
    
    public void initMetall(){
        MusicList list = new MusicList("Metall", "metallList");
        list.addSong("Circle With Me");
        list.addSong("Doomed");
        list.addSong("Animals");

        map.put(list.getStyle(), list);
    }
    
    public void initIrish(){
        MusicList list = new MusicList("Irish", "irishList");
        list.addSong("Out on the ocean");
        list.addSong("Banshee");
        list.addSong("Road to Errogie");

        map.put(list.getStyle(), list);
    }
    
}
