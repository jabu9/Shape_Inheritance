/*
 * 
 * Jordan Abuhantash
 * Project 01
 * CMSC 335
 * Square.java
 * 
 */


package shapes;

import utils.TwoDimensionalShape;

public class Square implements TwoDimensionalShape {
    int side;

    // Calculates and returns the area of the square.
    @Override
    public double getArea() {
        return side * side;
    }

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int numberOfDimensions() {
        return 2;
    }
    
    // Added toString to display area
	@Override
	public String toString() {
		return "The area of the Square is " + Math.round(getArea() * 100)/100.0;
	}
}
