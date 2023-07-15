package Exceptions;

import java.util.ArrayList;

public class ExceptionsTest {

    public static void main(String[] args) {
        ArrayList<Object> arrObjList = new ArrayList<Object>();

        arrObjList.add("Cadena 1");
        arrObjList.add(1);
        arrObjList.add("Cadena 2");
        arrObjList.add(2);
        arrObjList.add("Cadena 3");
        arrObjList.add(3);
        arrObjList.add("Cadena 4");
        arrObjList.add(4);

        int[] arregloInt = new int[8];
        try{
            for(int i=0; i<arrObjList.size(); i++){
                arregloInt[i] = (int) arrObjList.get(i);
            }
            
            System.out.println("Conversión realizada satisfactoriamente");
        }catch(ClassCastException e){
            System.out.println("Error de conversión: " + e.getMessage());
        }
        
    }
}
