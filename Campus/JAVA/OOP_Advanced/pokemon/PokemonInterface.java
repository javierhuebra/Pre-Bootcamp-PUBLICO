package OOP_Advanced.pokemon;

public interface PokemonInterface {
    
    Pokemon createPokemon(String name, int health, String type);

    String pokemonInfo(Pokemon pokemon); //Funciona igual con public o sin public(?) consultar creo que viene por default

    void listPokemon();
}
        
