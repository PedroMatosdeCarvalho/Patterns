/**
 * 
 */
package factory;

/**
 * @author Pedro MC
 *
 */
public class LoLChampionFactory extends ChampionFactory {
	
	@Override
	public Champion createChampion()  {
        return new LoLChampion();
    }

}
