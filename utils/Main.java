/*
 * 
 * Jordan Abuhantash
 * Project 01
 * CMSC 335
 * Main.java
 * 
 */

package utils;

import java.util.ArrayList;
import java.util.Scanner;
import shapes.Circle;
import shapes.Rectangle;
import shapes.Square;
import shapes.Triangle;
import shapes.Sphere;
import shapes.Cube;
import shapes.Cone;
import shapes.Cylinder;
import shapes.Torus;  

public class Main {

	// Extends the abstract MenuEntry class.
	private abstract static class MenuEntryConsole extends MenuEntry<Shape> {
		private final Scanner scanner;

		public MenuEntryConsole(String string, Scanner scanner) {
			super(string);
			this.scanner = scanner;
		}

		public String getStringAttribute(String attributeName) {
			System.out.println(getQuestion(attributeName));
			return scanner.nextLine();
		}

	}

	public static void main(String[] ignored) {
		final Scanner inputScanner = new Scanner(System.in);
		
		// Circle
		final MenuEntryConsole circleEntry = new MenuEntryConsole("Circle", inputScanner) {
			@Override
			public Shape get() {
				return new Circle(getPositiveIntegerAttribute("radius"));
				
                }
		};
		
		// Rectangle
		final MenuEntryConsole rectangleEntry = new MenuEntryConsole("Rectangle", inputScanner) {

			@Override
			public Shape get() {
				return new Rectangle(getPositiveIntegerAttribute("length"), getPositiveIntegerAttribute("width"));
			}

		};
		
		// Square
		final MenuEntryConsole squareEntry = new MenuEntryConsole("Square", inputScanner) {

			@Override
			public Shape get() {
				return new Square(getPositiveIntegerAttribute("side"));
			}

		};
		
		// Triangle
		final MenuEntryConsole traingleEntry = new MenuEntryConsole("Traingle", inputScanner) {

			@Override
			public Shape get() {
				return new Triangle(getPositiveIntegerAttribute("height"), getPositiveIntegerAttribute("base"));
			}

		};
		
		// Sphere
		final MenuEntryConsole sphereEntry = new MenuEntryConsole("Sphere", inputScanner) {

			@Override
			public Shape get() {
				return new Sphere(getPositiveIntegerAttribute("radius"));
			}

		};
		
		// Cube
		final MenuEntryConsole cubeEntry = new MenuEntryConsole("Cube", inputScanner) {

			@Override
			public Shape get() {
				return new Cube(getPositiveIntegerAttribute("area"));
			}

		};
		
		// Cone
		final MenuEntryConsole coneEntry = new MenuEntryConsole("Cone", inputScanner) {

			@Override
			public Shape get() {
				return new Cone(getPositiveIntegerAttribute("radius"), getPositiveIntegerAttribute("height"));
			}

		};
		
		// Cylinder
		final MenuEntryConsole cylinderEntry = new MenuEntryConsole("Cylinder", inputScanner) {

			@Override
			public Shape get() {
				return new Cylinder(getPositiveIntegerAttribute("radius"), getPositiveIntegerAttribute("height"));
			}

		};
		
		// Torus
		final MenuEntryConsole torusEntry = new MenuEntryConsole("Torus", inputScanner) {

			@Override
			public Shape get() {
				return new Torus(getPositiveIntegerAttribute("major radius"), getPositiveIntegerAttribute("minor radius"));
			}

		};
		
		// Updated shapeEntrys
		final MenuEntry<Shape>[] entries = new MenuEntryConsole[] { circleEntry, rectangleEntry, squareEntry, traingleEntry, 
				sphereEntry, cubeEntry, coneEntry, cylinderEntry, torusEntry};
		final ArrayList<Shape> main = new ArrayList<>();
		try {
			while (true) {
				int menuSelection = -1;
				System.out.println("********* Welcome to the Java OO Shapes Program **********\n");
				System.out.println("Select from the menu below:\n");
				for (int entryIndex = 0; entryIndex < entries.length; ++entryIndex) {
					// entries are counted from 1 for the user, but from 0 in the Java array
					System.out.println((entryIndex + 1) + ". Construct a " + entries[entryIndex].toString());
				}
				System.out.println((entries.length + 1) + ". Exit the program ");
				try {
					menuSelection = Integer.parseInt(inputScanner.nextLine());
				} catch (NumberFormatException numberFormatException) {
					menuSelection = -1;
				}
				if (menuSelection >= 1 && menuSelection <= entries.length) {
					// an actual valid shape selection has been made
					final String label = entries[menuSelection - 1].toString();
					System.out.println("You have selected a " + label);
					try {
						final Shape shape = entries[menuSelection - 1].get();
						System.out.println(shape);// SAME AS: System.out.println(shape.toString());
						main.add(shape);
					} catch (Exception badInput) {
						System.out.println("Invalid input for " + label);
					}
				} else if (menuSelection != entries.length + 1) {
					// no valid input
					System.out.println("Bad input");
				} else {
					// the last option was selected, this is the end of the interaction loop
					break;
				}
				String continueInput = "";
				while (true) {
					System.out.println("Would you like to continue? (Y or N)");
					continueInput = inputScanner.nextLine().toUpperCase();
					if ("Y".equals(continueInput) || "N".equals(continueInput)) {
						break;
					}
					System.out.println("Sorry I do not understand. Enter Y or N");
				}//while inner
				if ("N".equals(continueInput)) {
					// end of the interaction loop not triggered by the main menu
					break;
				}
			}//while outer
		} finally {
			inputScanner.close();
		}
		
	    // Date  
	    java.util.Date date = new java.util.Date();    
	    
		System.out.println("Thanks for using the program. Today is " + date);

	}

}
