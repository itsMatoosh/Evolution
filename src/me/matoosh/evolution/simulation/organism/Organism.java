package me.matoosh.evolution.simulation.organism;

import java.util.ArrayList;

import me.matoosh.evolution.simulation.organism.trait.Trait;

/**
 * Represents a single organism within a generation.
 * @author Mateusz Rebacz
 *
 */
public class Organism {
	/**
	 * The characteristics of this organism.
	 * Used to construct the organism.
	 */
	public ArrayList<Trait> traitChain = new ArrayList<Trait>();
	
	/**
	 * Creates a new organism with random characteristics.
	 */
	public Organism() {
		//Adding a single randomized trait.
		traitChain.add(new Trait());
	}
	/**
	 * Creates a new organism with predefined characteristics.
	 * @param characteristics
	 */
	public Organism(ArrayList<Trait> characteristics) {
		traitChain = characteristics;
	}
	/**
	 * Creates a new organism, based on the characteristics of his parents.
	 * @param parents
	 */
	public Organism(Organism[] parents) {
		
	}
	
	/**
	 * Gets the name of the species, based on the organism's characteristics.
	 * @return
	 */
	public String getSpecies() {
		//TODO: Generate species name from the characteristics.
		return "";
	}
}
