package OOP_Java.masterobjuno;

public class HumanTest {
    public static void main(String[] aStrings){

        Human personajeA = new Human();
        Human personajeB = new Human();
        
        personajeB.mostrarHealth();
        personajeA.attack(personajeB);
        personajeB.mostrarHealth();
    }
}
