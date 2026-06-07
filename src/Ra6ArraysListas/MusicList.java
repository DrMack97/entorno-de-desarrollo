package Ra6ArraysListas;
import java.util.*;

public class MusicList {

    private String style;
    private String name;
    private Set<Song> songs;
    private List<Song> reproducedSongs;

    public MusicList(String style, String name) {
        this.style = style;
        this.name = name;
        this.songs = new HashSet<>();
        this.reproducedSongs = new ArrayList<>();
    }

    public Song reproduceSong(String name) throws Exception {
        Song cancio = null;

        //no se itera LA LISTA en Medio de un Bucle

            for (Song song : songs) {
                if (song.getName().equalsIgnoreCase(name)) {
                    cancio = song; // otras cosas si 
                    break;
                }
            }
            if (cancio != null) {
                songs.remove(cancio);
                reproducedSongs.add(cancio);

            }
            
            
        return cancio;

    }

    public void restartMusicList() {

        songs.addAll(reproducedSongs);
        reproducedSongs.clear();

        if (reproducedSongs.isEmpty()) {
            System.out.println("reproducedSongs vaciada correctamente!");
        }

    }

    public boolean deleteSongFromList(String name) {
        Song toDelete = null;

        //Buscar en songsList
        for (Song song : songs) {
            if(song.getName().equalsIgnoreCase(name)){
                toDelete = song;
                break;
            }
        }

        //itera las listas SIMPRE FUERA DE LOS BUCLES

        if (toDelete != null) {
            songs.remove(toDelete);
            System.out.println("Eliminada correctamente!");
            return true;
        }
        return false;
    }

    public boolean addSong(String songName) {
        boolean exist = false;
        Song newSong = new Song(songName);

        for (Song song : songs) {
            if (newSong.getName().equalsIgnoreCase(song.getName())) {
                System.out.println("Ya existe");
                
                return exist;
            }
        }        
        if (!exist) {
            songs.add(newSong);
            System.out.println("Se ha guardado correctamente!");

            exist = true;
        }

        return exist;
        
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Song> getSongs() {
        return songs;
    }

    public void setSongs(Set<Song> songs) {
        this.songs = songs;
    }

    public List<Song> getReproducedSongs() {
        return reproducedSongs;
    }

    public void setReproducedSongs(List<Song> reproducedSongs) {
        this.reproducedSongs = reproducedSongs;
    }

}
