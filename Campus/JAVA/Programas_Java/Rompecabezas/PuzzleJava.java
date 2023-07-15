package Rompecabezas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;//No se usa
import java.util.Arrays;

public class PuzzleJava {

    // 1) Primera consigna
    public static ArrayList<Integer> primerMetodo() {
        int[] arr = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };
        int sum = 0;
        ArrayList<Integer> mayores = new ArrayList<Integer>();

        for (int elemento : arr) {
            sum = +elemento;
            if (elemento > 10)
                mayores.add(elemento);
        }
        System.out.println("La suma del arreglo es: " + sum);

        return mayores;
    }

    // 2) Segunda consigna
    public static ArrayList<String> mezclarPersonas() {
        String[] arr = { "Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa" };
        ArrayList<String> mayores = new ArrayList<String>();

        Collections.shuffle(Arrays.asList(arr));// Clase collections tiene metodo para mezclar

        for (String nombre : arr) {
            System.out.println(nombre);
            if (nombre.length() > 5) {
                mayores.add(nombre);
            }
        }

        return mayores;
    }

    // 3) Tercera consigna
    public static void alfabeto() {
        Character[] alfabeto = new Character[26];
        char letra = 'A';

        for (int i = 0; i < 26; i++) {
            alfabeto[i] = letra;
            letra++;
            /* System.out.println(alfabeto[i]); */
        }

        List<Character> listaAlfabeto = Arrays.asList(alfabeto); // Convierte el arreglo en una lista
        Collections.shuffle(listaAlfabeto); // Mezcla la lista

        for (char letrita : listaAlfabeto) {
            System.out.println(letrita);
        }

        int totalElementos = listaAlfabeto.size();
        Character ultimaLetra = listaAlfabeto.get(totalElementos - 1);
        Character primerLetra = listaAlfabeto.get(0);

        System.out.println("Ultima letra: ");
        System.out.println(ultimaLetra);
        System.out.println("Primera letra: ");
        System.out.println(primerLetra);

    }

    // 4) Generar numeros aleatorios
    public static int[] aleatoriosNum() {
        Random r = new Random();
        int[] arr = new int[10];

        int min = 55;
        int max = 100;
        int i = 0;

        for (i = 0; i < 10; i++) {
            arr[i] = r.nextInt(max - min + 1) + min;
        }

        return arr;

    }

    // 5) Generar numeros aleatorios ordenados
    public static List<Integer> aleatoriosNumSort() {
        Random r = new Random();
        Integer[] arr = new Integer[10];

        int min = 55;
        int max = 100;
        int i = 0;

        for (i = 0; i < 10; i++) {
            arr[i] = r.nextInt(max - min + 1) + min;
        }

        List<Integer> arrList = Arrays.asList(arr); // Convierte el arreglo en una lista
        Collections.sort(arrList); // Mezcla la lista
        return arrList;

    }

    public static void crearCadena() {
        char letra = 'A';
        Random r = new Random();
        int min = 0;
        int max = 26;
        String cadena="";
        

        for (int i = 0; i < 5; i++) {
            int indice = r.nextInt(max - min) + min;
            char letraAleatoria = (char) (letra + indice);
            cadena = cadena.concat(Character.toString(letraAleatoria));
        }
    
        System.out.println(cadena);

    }

    public static void main(String[] args) {

        // Primera consigna
        ArrayList<Integer> arreglo = new ArrayList<Integer>();
        arreglo = primerMetodo();
        System.out.println(arreglo);
        System.out.println("-------------------------------------");
        // -------------------------------

        // Segunda consigna
        ArrayList<String> arreglo2 = new ArrayList<String>();
        arreglo2 = mezclarPersonas();
        System.out.println(arreglo2);
        System.out.println("-------------------------------------");
        // -------------------------------

        // Tercera consigna
        alfabeto();
        System.out.println("-------------------------------------");
        // -------------------------------

        // Cuarta consigna
        int[] arreglo4;
        arreglo4 = aleatoriosNum();
        for (int valor : arreglo4) {
            System.out.println(valor);
        }
        System.out.println("-------------------------------------");
        // -------------------------------

        // Quinta consigna
        List<Integer> arrList5;
        arrList5 = aleatoriosNumSort();
        System.out.println(arrList5);
        System.out.println("-------------------------------------");
        // -------------------------------

        // Sexta consigna
        crearCadena();
        // -------------------------------
    }
}
