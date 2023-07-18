package OOP_Advanced.pokemon;

public class Pokemon {
    private String name;
    private int health;
    private String type;

    protected static int count; //Pongo protected porque no se me subraya como si no lo estuviera usando

    //Constructor
    public Pokemon(String name, int health,String type){
        this.name = name;
        this.health = health;
        this.type = type;

        count++;
    }

    public void attackPokemon(Pokemon target){
        System.out.printf("%s ha golpeado a %s y le ha restado 10 puntos de vida",this.name, target.getName());
        System.out.println();
        target.health -= 10;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }
    
    public void setHealth(int health){
        this.health = health;
    }

    public void setType(String type){
        this.type = type;
    }

    //Getters
    public String getName(){
        return name;
    }

    public int getHealth(){
        System.out.println("La vida de "+this.name+ " es "+health);
        return health;
    }

    public String getType(){
        return type;
    }
}
