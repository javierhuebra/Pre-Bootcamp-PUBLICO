package OOP_Advanced.pokemon;

public abstract class AbstractPokemon implements PokemonInterface {

    public Pokemon createPokemon(String name, int health, String type){
        Pokemon createdPokemon = new Pokemon(name, health, type);
        return createdPokemon;
    }

    public String pokemonInfo(Pokemon pokemon){
        StringBuilder string = new StringBuilder();

        string.append(pokemon.getName());//Concateno los valores en la variable string
        string.append(pokemon.getHealth());
        string.append(pokemon.getType());

        return string.toString();
    }
 
}
