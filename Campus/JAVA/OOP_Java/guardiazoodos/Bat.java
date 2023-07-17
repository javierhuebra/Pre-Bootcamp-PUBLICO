package OOP_Java.guardiazoodos;

import OOP_Java.guardiazoologico.Mamifero; //Se importa la clase pq estan en carpetas diferentes(?)

public class Bat extends Mamifero{
    
    public Bat(){
        energyLevel = 300; //Consultar si esta bien esto(?)
    }

    public void fly(){
        System.out.println("Shashshsh... volando... shshshh...");
        energyLevel -= 50;
    }

    public void eatHumans(){
        System.out.println("Bueno, no importa...");
        energyLevel += 25;
    }

    public void attackTown(){
        System.out.println("AAAAA SE KEMA TODOOOO, AAA");
        energyLevel -= 100;
    }
}
