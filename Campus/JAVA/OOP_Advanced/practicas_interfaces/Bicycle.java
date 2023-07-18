package OOP_Advanced.practicas_interfaces;

class Bicycle implements OperateBicycle { //Usa implements en vez de extends        
    private int speed;
    public Bicycle() {
        speed = 0;
    }
    //Un método static que llama al método static de la interfaz
    public static void staticMethod() {
        OperateBicycle.staticMethod();
    }
    // implementando speedUp
    public void speedUp(int increment) {
        speed += increment;
    }
    // implementando applyBrakes
    public void applyBrakes(int decrement) {
        speed -= decrement;
    }
    public int getSpeed() {
        return speed;
    }
}


