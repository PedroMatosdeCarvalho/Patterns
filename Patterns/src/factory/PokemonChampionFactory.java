/**
 * 
 */
package factory;

/**
 * @author Pedro MC
 *
 */
public class PokemonChampionFactory extends ChampionFactory {

	@Override
	public Champion createChampion()  {
        return new PokemonChampion();
    }
	
}
