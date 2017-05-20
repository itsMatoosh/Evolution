/**
 * 
 */
package me.matoosh.evolution.simulation.organism.trait;

import java.util.ArrayList;
import java.util.Random;

/**
 * Describes the way a part of the organism should be built.
 * @author Mateusz Rebacz
 *
 */
public class Trait {
	/**
	 * The structure of this trait, numbers > 0 represent segment types. 0 indicates a new row.
	 */
	public ArrayList<Integer> structure = new ArrayList<Integer>();
	
	/**
	 * Randomizes this trait, keeps the length of the structure.
	 */
	public void randomize() {
		Random r = new Random(); 
		for(int i = 0; i< structure.size(); i++) {
			structure.set(i, r.nextInt(4));
		}
	}
}
