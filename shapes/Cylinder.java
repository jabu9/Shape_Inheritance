/*
 * 
 * Jordan Abuhantash
 * Project 01
 * CMSC 335
 * Cylinder.java
 * 
 */


package shapes;

import utils.ThreeDimensionalShape;

public class Cylinder implements ThreeDimensionalShape {

    int radius, height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * (radius * radius * height);
    }

    @Override
    public int numberOfDimensions() {
        return 3;
    }
    
    // Added toString to display volume
	@Override
	public String toString() {
		return "The volume of the Cylinder is " + Math.round(getVolume() * 100)/100.0;
	}
    
}

