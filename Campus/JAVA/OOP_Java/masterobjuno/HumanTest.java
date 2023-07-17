package OOP_Java.masterobjuno;

import OOP_Java.masterobjdos.Ninja;
import OOP_Java.masterobjdos.Samurai;
import OOP_Java.masterobjdos.Wizard;//Clase para wizard

public class HumanTest {
    public static void main(String[] aStrings){
        
        //Master objetos 1--------
        Human personajeA = new Human();
        Human personajeB = new Human();
        
        personajeB.mostrarHealth();
        personajeA.attack(personajeB);
        personajeB.mostrarHealth();
        //-------------------------

        
        
        //Master objetos 2---------
        
        Wizard severusSnape = new Wizard(); //Creo un Wizard
        severusSnape.verStats();

        //Metodo para curar un Humano
        severusSnape.heal(personajeA);
        personajeA.mostrarHealth();

        //Metodo fire ball
        severusSnape.fireBall(personajeA);
        personajeA.mostrarHealth();

        Ninja scorpion = new Ninja(); //Creo un ninja
        scorpion.verStats();

        //Metodo steal para robar vida y cargarse la del ninja
        scorpion.steal(personajeA);
        scorpion.mostrarHealth();
        personajeA.mostrarHealth();

        //Metodo runaway
        scorpion.runAway();
        scorpion.mostrarHealth();

        Samurai batusai = new Samurai(); //Creo un samurai
        batusai.verStats();

        //Metodo deathBlow
        batusai.deathBlow(personajeA);
        batusai.mostrarHealth();
        personajeA.mostrarHealth();

        //Metodo meditate
        batusai.meditate();
        batusai.mostrarHealth();
        //-------------------------
    }
}
