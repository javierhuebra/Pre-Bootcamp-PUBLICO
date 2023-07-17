package OOP_Java.masterobjdos;

import OOP_Java.masterobjuno.Human;

public class Wizard extends Human{
    
    public Wizard(){
        health = 50; //Consultar si esta bien esto porque las variables estan public
        intelligence = 8;
    }

    public void heal(Human target){
        target.health += intelligence;
    }

    public void fireBall(Human target){
        target.health -= intelligence * 3;
    }

    

}
