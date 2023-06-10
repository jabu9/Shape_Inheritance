/*
 * 
 * Jordan Abuhantash
 * Project 01
 * CMSC 335
 * MenuEntry.java
 * 
 */

package utils;

import java.util.function.Function;

public abstract class MenuEntry<Anything> {
	private final String label;

	// Initialize the label
	public MenuEntry(String label) {
		this.label = label;
	}

	// Returns the label
	public String toString() {
		return label;
	}

	// Retrieves the value associated with the menu entry.
	abstract public Anything get();

	// Generates question asking for the value of a specific attribute.
	public String getQuestion(String attributeName) {
		return "What is the " + attributeName;
	}

	abstract public String getStringAttribute(String attributeName);

	public Integer getPositiveIntegerAttribute(String attributeName) {
		return getIntegerAttribute(attributeName, (value) -> (value > 0));
	}


	public Integer getIntegerAttribute(String attributeName, Function<Integer, Boolean> filter) {
		// Returns the integer value if it meets the filter condition.
		final Integer value = Integer.valueOf(getStringAttribute(attributeName)); 
		// Checks if the value satisfies the provided filter condition.
		if (filter == null || (value != null && filter.apply(value))) {
			return value;
		}
		return null;
	}
	
}


