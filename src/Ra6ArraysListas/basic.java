package Ra6ArraysListas;

import java.util.HashMap;
import java.util.Map;

public class basic {

    public static void main(String[] args){

        String name = "juanita";

        HashMap<String, Double> mapapa = mapa();

        try {
            buscarNombre(mapapa, name);
        } catch (EstudianteNoEncontradoException e) {
            System.out.println(e.getMessage()+ "no encontrado");
        }

        //AGG elementos

        mapapa.put("Euracio", 6.5);
        mapapa.put("Tobias", 5.0);
        mapapa.put("tony",8.5);

        // mostrar a TODOS los elementos 

        for (Map.Entry<String, Double> entry : mapapa.entrySet()) {
            System.out.println(entry.getKey() +": "+ entry.getValue());
        }

        // Buscar UN SOLO elemento
        
        for (String listaEstudiantesName : mapapa.keySet()) {
            if (listaEstudiantesName.equalsIgnoreCase("algo")) {
                System.out.println("buscado = " + listaEstudiantesName);
            }else{
                System.out.println("no encontrado ");
                return;
            }
        }
    
    }

    public static HashMap<String,Double> mapa(){

        HashMap<String, Double> map = new HashMap<>();

        map.put("maria", 9.5);
        map.put("sofia", 10.0);
        map.put("juanita", 0.0);

        return map;

    }

    public static void buscarNombre(HashMap<String, Double> lista,String name)throws EstudianteNoEncontradoException{
        
        double nota = 0;

        //nombre yy nota

        for (String namesList : lista.keySet()) {
            if (namesList.equals(name) && lista.containsKey(name)) {
                name = namesList;
                nota = lista.get(name);
            }
        }

        System.out.printf("estudiante: %s nota: %.0f", name , nota);
    }
}
