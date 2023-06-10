/*
 * 
 * Jordan Abuhantash
 * Project 01
 * CMSC 335
 * Rectangle.java
 * 
 */


package shapes;

import utils.TwoDimensionalShape;

public class Rectangle implements TwoDimensionalShape{

    int width, length;

    // Calculates and returns the area of the Rectangle.
    @Override
    public double getArea() {
        return length * width;
    }

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public int numberOfDimensions() {
        return 2;
    }
    
    // Added toString to display area
	@Override
	public String toString() {
		return "The area of the Rectangle is " + Math.round(getArea() * 100)/100.0;
	}
    
}