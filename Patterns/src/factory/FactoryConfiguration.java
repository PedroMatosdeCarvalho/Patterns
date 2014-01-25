/**
 * 
 */
package factory;

/**
 * @author Pedro MC
 *
 */
public class FactoryConfiguration {
	
	private static ChampionFactory cf=null;
		
	static ChampionFactory getFactory(String choice){
		switch(choice.toLowerCase()){
			case "lol":
				cf = new LoLChampionFactory();
				break;
			case "pokemon":
				cf = new PokemonChampionFactory();
				break;
			default: break;
		}
		return cf;
	}

}
