/*
 * 
 * Jordan Abuhantash
 * Project 01
 * CMSC 335
 * Triangle.java
 * 
 */

package shapes;

import utils.TwoDimensionalShape;

public class Triangle implements TwoDimensionalShape {
    int height, base;

    // Calculates and returns the area of the triangle.
    @Override
    public double getArea() {
        return (base * height)/2;
    }

    // Constructor to initialize the height and base of the triangle.
    public Triangle(int height, int base) {
        this.base = base;
        this.height = height;
    }

    // Returns the number of dimensions of the triangle.
    @Override
    public int numberOfDimensions() {
        return 2;
    }
    
    // Added toString to display area
	@Override
	public String toString() {
		return "The area of the Triangle is " + Math.round(getArea() * 100)/100.0;
	}
    
}

