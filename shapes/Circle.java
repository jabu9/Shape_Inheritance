/*
 * 
 * Jordan Abuhantash
 * Project 01
 * CMSC 335
 * Circle.java
 * 
 */

package shapes;

import utils.TwoDimensionalShape;

public class Circle implements TwoDimensionalShape {
	int radius;

    // Calculates and returns the area of the circle.
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * (radius * radius);
	}

	@Override
	public int numberOfDimensions() {
		return 2;
	}
	
    // Added toString to display area
	@Override
	public String toString() {
		return "The area of the Circle is " + Math.round(getArea() * 100)/100.0;
		
	}
	

}
