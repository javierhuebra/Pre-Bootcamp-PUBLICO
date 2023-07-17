package OOP_Java.Practicas_1.Herencia;

public class HumanTest {
    public static void main(String[] args) {
        Human h = new Human(); //Los objetos son distintos pero heredan la misma clase y tienen el metodo ir a trabajar que no tienen los mamiferos
        Human otro = new Human();

        h.regulateTemperature();
        h.startSleeping();
        h.goToWork();
        
        boolean sleeping = h.isSleeping();
        boolean sleepingOtro = otro.isSleeping();
        
        //Para ver el estado del humano uno
        if (sleeping){
            System.out.println("El humano h esta durmiendo!");
        }

        //Para ver el estado del otro humano
        if(sleepingOtro){
            System.out.println("El otro humano esta durmiendo!");
        }else{
            System.out.println("El otro humano esta despierto!");
        }
    }
}


