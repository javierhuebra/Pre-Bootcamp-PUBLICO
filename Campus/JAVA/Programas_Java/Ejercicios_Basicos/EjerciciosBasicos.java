package Ejercicios_Basicos;

import java.util.ArrayList;

public class EjerciciosBasicos {
    public static void main(String[] args) {
        BasicJava variable = new BasicJava();
        int[] arreglo = { 1, 2, 4, 5, 8, 9, 8 };
        int[] arregloConNeg = { 1, -5, 8, -8, -9, 7, 10 };
        int[] arregloReemplazar = {1,2,3,4};
        ArrayList<Integer> nrosImpares = new ArrayList<Integer>();

        // Imprimir 255 numeros
        variable.imprimirNumeros();
        System.out.println("--------------------");

        // Imprimir suma de 255 valores
        variable.imprimirSuma();
        System.out.println("--------------------");

        // Recorrer un arreglo
        variable.recorrerArreglo(arreglo);
        System.out.println("--------------------");

        // Encontrar el máximo
        variable.maxArreglo(arreglo);
        System.out.println("--------------------");

        // Pomedio del arreglo
        variable.promedioArreglo(arreglo);
        System.out.println("--------------------");

        // Numeros impares 1 a 255 guardados en un arreglo
        nrosImpares = variable.arrNumerosImpares();
        System.out.println("Numeros impares: " + nrosImpares);
        System.out.println("--------------------");

        // Cuenta valores del arreglo mayores que Y
        int cuentaMayores = variable.arrNumerosMayores(arreglo, 1);
        System.out.println("Valores mayores que Y: " + cuentaMayores);
        System.out.println("--------------------");

        // Multiplica los valores de un arreglo por si mismo
        variable.multiplicarValores(arreglo);
        for (int valor : arreglo) {
            System.out.println(valor);
        }
        System.out.println("--------------------");

        // Reemplazar valores negativos en un arreglo
        variable.reemplazarNumerosMenores(arregloConNeg);
        for (int valor : arregloConNeg) {
            System.out.println(valor);
        }
        System.out.println("--------------------");

        // Minimo, máximo y promedio
        double[] arr = variable.minimoMaximoPromedio(arreglo);
        for (double valor : arr) {
            System.out.println(valor);
        }
        System.out.println("--------------------");

        // Reemplazar valores
        variable.reemplazarValores(arregloReemplazar);
        for (int valor : arregloReemplazar) {
            System.out.println(valor);
        }
    }
}
