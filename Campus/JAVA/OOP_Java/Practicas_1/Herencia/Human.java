package OOP_Java.Practicas_1.Herencia;

public class Human extends Mammal{
    
    
    public void goToWork(){
        System.out.println("Voy a trabajar, algo que solo humanos hacen!");
    }

    //Puedo modificar el metodo de mammal agregandole una instrucción antes, asi el humano primero tose y voltea para luego aplicar startSleeping de Mammal
    public void startSleeping(){
        System.out.println("Toser y voltear");
        super.startSleeping();
    }
}
