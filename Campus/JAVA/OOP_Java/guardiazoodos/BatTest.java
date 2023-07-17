package OOP_Java.guardiazoodos;


public class BatTest {
    public static void main(String[] args){
        
        Bat batMan = new Bat();
        batMan.displayEnergy(); //Parte con 300 de energía

        batMan.attackTown();
        batMan.attackTown();
        batMan.attackTown();
        batMan.displayEnergy();

        batMan.eatHumans();
        batMan.eatHumans();
        batMan.displayEnergy();

        batMan.fly();
        batMan.fly();
        batMan.displayEnergy();
    }
}
