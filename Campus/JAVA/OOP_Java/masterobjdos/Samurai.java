package OOP_Java.masterobjdos;

import OOP_Java.masterobjuno.Human;
public class Samurai extends Human{
    
    public Samurai(){
        health = 200;
    }

    public void deathBlow(Human target){
        target.health = 0;

        health /= 2;
    }

    public void meditate(){
        health += health/2;
    }
}
