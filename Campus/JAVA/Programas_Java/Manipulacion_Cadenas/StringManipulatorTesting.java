package Manipulacion_Cadenas; //Preguntar por el package 

public class StringManipulatorTesting {
    public static void main(String[] args){
        StringManipulator manipulator = new StringManipulator();

        //Primer método
        String cadenasConcatenadas = manipulator.trimAndConcat("   Hola     ","     Mundo   ");

        System.out.println(cadenasConcatenadas); //Imprime HolaMundo

        //Segundo método
        int indice = manipulator.getIndexOrNull("averrrrr", 'r'); 

        System.out.println(indice); //Imprime 3 porque detecta el primer elemento por defecto y si no lo encuentra devuelve -1 por defecto

        //Tercer método
        int indiceB = manipulator.getIndexOrNull("Hola","la"); //Se aprecia que el metodo tiene el mismo nombre que el segundo pero como varian los parámetros lo identifica por eso
        System.out.println(indiceB); //Imprime 2

        String hola = "Hola";
        String mundo = "Mundo";
        int indiceC = manipulator.getIndexOrNull(hola,mundo);
        System.out.println(indiceC); //Imprime -1 por defecto si no lo encuentra

        //Cuarto método
        String cadenaAlterada = manipulator.concatSubstring("Hola",1,3,"Mundo");
        System.out.println(cadenaAlterada); //Imprime concatedaas las dos cadenas pero la primera esta limitada entre 1 y 3
    }
}
