package OOP_Java.guardiazoologico;

public class Gorilla extends Mamifero {
    
    public void throwSomething(){
        System.out.println("¡Gorilla lanza algo al público!");
        energyLevel -= 5;
    }

    public void eatBananas(){
        System.out.println("¡Yummmi! ¡Rica la bananita!");
        energyLevel += 10;
    }

    public void climb(){
        System.out.println("¡Iupi, estoy en la cima de un arbol!");
        energyLevel -= 10;
    }

    
}
