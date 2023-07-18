package OOP_Advanced.pokemon;

public class PokemonTest {
    public static void main(String[] args){
        Pokedex miPokedex = new Pokedex();

        miPokedex.addPokemon("Charmander", 100, "fuego");
        miPokedex.addPokemon("Squartle", 100, "agua");
        miPokedex.addPokemon("Bulvasaur", 100, "planta");

        Pokemon charmander = miPokedex.elegirPokemon(0);
        Pokemon squartle = miPokedex.elegirPokemon(1);

        charmander.attackPokemon(squartle);

        squartle.getHealth();

        miPokedex.listPokemon();
    }
}
