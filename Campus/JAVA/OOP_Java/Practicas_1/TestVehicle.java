package OOP_Java.Practicas_1;

public class TestVehicle {
    
    public static void main(String[] args){
        Vehicle autoRojo = new Vehicle("rojo");//Detecta que es el metodo con parametro de color
        Vehicle autoGris = new Vehicle();//Detecta que es el metodo sin parametros, no tiene nada si le pongo get tira null

        String color = autoRojo.getColor();
        
        
        System.out.println(autoGris.getColor());//Imprime null porque no le puse nada adentro porque el constructor no tiene parametros

        autoGris.setColor("gris");
        System.out.println(autoGris.getColor());//Ahora si tiene color el auto gris
        System.out.println("El color del auto es: " + color);

        autoGris.objectMethods(autoGris);
    }
}
