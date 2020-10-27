package edu.unca.csci201;

public interface Answer {

	/**
	 * Returns a String that represents this Answer,
	 * formatted for the user
	 */
	public String toString();
	
	/**
	 * Returns true if the other may be considered the same answer 
	 * as this one.
	 */
	public boolean isSameAs(Answer other);
	
}
