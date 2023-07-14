package Ejercicios_Basicos;

import java.util.ArrayList;

public class BasicJava {
    // Imprimir 255 numeros
    public void imprimirNumeros() {
        // No hago nada con el arreglo podria retornarlo
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int i;

        for (i = 1; i < 256; i++) {
            numeros.add(i);
            System.out.println(i);
        }
    }

    // Imprimir suma de 255 valores
    public void imprimirSuma() {

        int i;
        int suma = 0;
        for (i = 0; i < 255; i++) {
            suma += i;

            System.out.println(String.format("Nuevo numero: %d Suma: %d", i, suma));

        }
    }

    // Recorrer un arreglo
    public void recorrerArreglo(int[] arr) {
        for (int numero : arr) {
            System.out.println("Elemento: " + numero);
        }

    }

    // Encontrar el maximo
    public void maxArreglo(int[] arr) {
        int max = -Integer.MIN_VALUE;

        for (int numero : arr) {
            if (numero > max) {
                max = numero;
            }
        }
        System.out.println("Maximo: " + max);
    }

    // Promedio de un arreglo
    public void promedioArreglo(int[] arr) {
        double promedio = 0.0;
        for (int numero : arr) {
            promedio += numero;
        }
        promedio = promedio / arr.length;
        System.out.println("El promedio del arr es: " + promedio);
    }

    // Retorna arreglo dinamico de numeros impares
    public ArrayList<Integer> arrNumerosImpares() {
        int i;
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for (i = 1; i < 256; i++) {
            if (i % 2 == 1) {
                arrList.add(i);
            }

        }

        return arrList;
    }

    // Retorna cuantos numeros mayores a Y hay en el arreglo
    public int arrNumerosMayores(int[] arreglo, int y) {

        int cuenta = 0;

        for (int valor : arreglo) {
            if (valor > y) {
                cuenta++;
            }
        }

        return cuenta;
    }

    //Valores al cuadrado
     public void multiplicarValores(int[] arreglo) {
        int indice = 0;
        
        for (int valor : arreglo) {
            
            arreglo[indice] = valor*valor;
            
            indice++;
        
        }
    }



    // Valores al cuadrado
    public void reemplazarNumerosMenores(int[] arreglo) {
        int indice = 0;
        
        for (int valor : arreglo) {
            if (valor < 0) {
                arreglo[indice] = 0;
            }
            indice++;
        }

    }

    //Minimo, máximo y promedio
     public double[] minimoMaximoPromedio(int[] arreglo) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double promedio = 0;

        double[] solucionArr = new double[3];

        for (int valor : arreglo) {
            if (valor < min) {
                min = valor;
            }
            if (valor > max) {
                max = valor;
            }
            promedio += valor;
        }

        solucionArr[0] = max;
        solucionArr[1] = min;
        solucionArr[2] = promedio/arreglo.length;
        //Tambien se puede hacer declarando el arreglo 
        //double[] solucionArr = {max, min, promedio};
        return solucionArr;
    }

    //Cambiando los valores de un arreglo
    public void reemplazarValores(int[] arreglo) {
        
        for(int i = 0; i<arreglo.length; i++){
            if(i+1 < arreglo.length){
                arreglo[i] = arreglo[i+1];
            }else{
                arreglo[i] = 0;
            }
            
        }

    }
}
