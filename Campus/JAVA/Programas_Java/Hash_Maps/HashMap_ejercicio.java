import java.util.HashMap;
import java.util.Set;

public class HashMap_ejercicio {
    public static void main(String[] args){
        HashMap<String, String> cancionesMap = new HashMap<String, String>();
        cancionesMap.put("Six nex to me", "La la lalalal");
        cancionesMap.put("Helena beat", "eooo eoooo");
        cancionesMap.put("Houdini", "uuuuuhh uhhhhhhh");
        cancionesMap.put("Call it what you want", "salalalaa slalaa");
    
        //Extraer una cancion por su titulo
        String letra = cancionesMap.get("Six nex to me");
        System.out.println("La letra extraida por titulo es: " + letra); 

        //Guardar todas las keys en un arreglo de strings
        Set<String> keys = cancionesMap.keySet();

        //Imprimer todos los valores que tiene el HashMap con un for mejorado
        for(String key : keys){
            System.out.println(key +" --> "+cancionesMap.get(key));
            
        }

    }

    
}
