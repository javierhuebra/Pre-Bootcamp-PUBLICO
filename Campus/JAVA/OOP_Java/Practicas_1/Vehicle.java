package OOP_Java.Practicas_1;

public class Vehicle {

    private String color;
    private int numberOfWheels;

    public Vehicle(){ // Constructor vacio

    }
    
    public Vehicle(String color){
        this.color = color; //Se usa this porque tienen el mismo nombre el parametro y la variable del objeto
                            // El constructor es para definirle cualidades cuando se instancia el objeto
    }

    public Vehicle(String color, int numberOfWheels){ //Esto es sobrecargar el metodo constructor, se puede hacer con cualquier metodo, detecta los parametros y asocia solo.
        this.color = color;
        this.numberOfWheels = numberOfWheels;
    }


    // setter
    public void setNumberOfWheels(int numero) {
        numberOfWheels = numero;
    }

    // getter
    public int getNumberOfWheels(){
        return numberOfWheels;
    }

    // setter
    public void setColor(String color){
        this.color = color;
    }
    // getter
    public String getColor(){
        return color;
    }

    //Metodos de la superclase Object para this
    public void objectMethods(Vehicle anotherObject) {
        System.out.println("getClass: " + this.getClass().getSimpleName());
        System.out.println("toString: " + this.toString());
        System.out.println("Equals: " + this.equals(anotherObject));
    }
    
}
