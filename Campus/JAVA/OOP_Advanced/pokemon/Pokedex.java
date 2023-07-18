package OOP_Advanced.pokemon;

import java.util.ArrayList;

public class Pokedex extends AbstractPokemon { //Consultar si poner abstract adelante o no (me tira error si no lo pongo)
    private ArrayList<Pokemon> myPokemons = new ArrayList<Pokemon>();

    public Pokedex(){
        
    }

    public void addPokemon(String name, int health, String type){
        Pokemon pokeParaAgregar = new Pokemon(name, health, type);

        myPokemons.add(pokeParaAgregar);
    }

    public void listPokemon(){
        int index = 0;
        for(Pokemon pokemon : myPokemons){
            String nombre = pokemon.getName();

            System.out.printf("%d - %s", index, nombre);
            System.out.println();
            index++;
        }
    }

    Pokemon elegirPokemon(int indice){
        Pokemon pokeElegido = myPokemons.get(indice);
        System.out.println("Has escogido a "+ pokeElegido.getName());
        return pokeElegido;
    }

    
}
