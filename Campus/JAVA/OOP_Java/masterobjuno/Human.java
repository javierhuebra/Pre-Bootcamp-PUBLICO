package OOP_Java.masterobjuno;

public class Human {
    private int strength, stealth, intelligence, health;

    //Metodo para instanciar por default
    public Human(){
        strength = 3;
        stealth = 3;
        intelligence = 3;
        health = 100;
    }

    //Metodo para instanciar con valores
    public Human(int strength, int stealth, int intelligence,int health){
        this.strength = strength;
        this.stealth = stealth;
        this.intelligence = intelligence;
        this.health = health;
    }

    public void attack(Human atacado){
        atacado.health -= strength;
        System.out.println("El personaje ha inflingido "+ strength + " puntos de daño");
    }

    public void mostrarHealth(){
        System.out.println("La vida del Humano es: " + health);
    }
    
}
