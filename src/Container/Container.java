package Container;

import java.util.ArrayList;
import java.util.List;

import Modelos.Pokemon;

public class Container {

	static ArrayList<Pokemon> Pokemons=new ArrayList<Pokemon>();
	static ArrayList<Pokemon> PokemonsAux = new ArrayList<Pokemon>();
	
	public static List<Pokemon> getPokemons() {
		return Pokemons;
	}
	
	public static List<Pokemon> getPokemonsAux() {
		return PokemonsAux;
	}
}
