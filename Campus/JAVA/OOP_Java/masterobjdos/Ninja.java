package OOP_Java.masterobjdos;

import OOP_Java.masterobjuno.Human;

public class Ninja extends Human {
    public Ninja(){
        stealth = 10;
    }

    public void steal(Human target){
        target.health -= this.stealth;

        this.health += this.stealth; //Se puede prescindir del this creo
    }

    public void runAway(){
        health -= 10; //Funciona sin this a pesar de tener las variables publicas, buen dato, toma las de esta clase
    }
}
