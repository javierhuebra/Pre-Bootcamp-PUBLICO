package Manipulacion_Cadenas;

public class StringManipulator {

    //Metodo de la clase para sacar espacios y concatenar dos cadenas
    public String trimAndConcat(String stringA, String stringB){
        stringA = stringA.trim();
        stringB = stringB.trim();

        return stringA.concat(stringB);
    }

    //Metodo para saber el indice de un caracter en una cadena
    public int getIndexOrNull(String cadena, char caracter){
        int index = cadena.indexOf(caracter);

        return index;
    }

    //Metodo para obtener el indice donde empieza la subcadena
    public int getIndexOrNull(String cadenaA, String cadenaB){
        int index = cadenaA.indexOf(cadenaB);

        return index;
    }

    //Método para obtener una subcadena utilizando un índice de inicio y un índice de finalización y concatenarlo
    String concatSubstring(String cadenaA, int inicio, int finalizacion, String cadenaB){
        cadenaA = cadenaA.substring(inicio,finalizacion);

        return cadenaA + cadenaB;
    }


}
