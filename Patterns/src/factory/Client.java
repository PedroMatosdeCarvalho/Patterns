/**
 * 
 */
package factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Pedro MC
 *
 */
public class Client {
	
	public static void main(String args[]){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		String gameName = null;
		
		System.out.println("|------------------------------------------|");
		System.out.println("|---------------WELCOME TO-----------------|");
		System.out.println("|------------------------------------------|");
		System.out.println("|------------CHAMPION SELECT---------------|");
		System.out.println("|------------------------------------------|");
		System.out.println();
		System.out.println();
		System.out.println("Select wich Game you wan to create a Champion for:");
		System.out.println("          POKEMON----OR----LoL");
	
		try {
			for(gameName = br.readLine(); !gameName.equals("LoL") && !gameName.equals("POKEMON"); gameName = br.readLine())
				System.out.println("Wrong Game, please try again!");
				
	    } catch (IOException ioe) {
	       System.out.println("IO error trying to read your game!");
	       System.exit(1);
	    }
		
	      
		ChampionFactory cf= FactoryConfiguration.getFactory(gameName);
		Champion a = cf.createChampion();
		
		a.roar();
	}

}
