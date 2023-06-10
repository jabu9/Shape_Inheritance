/*
 * 
 * Jordan Abuhantash
 * Project 01
 * CMSC 335
 * Cone.java
 * 
 */


package shapes;

import utils.ThreeDimensionalShape;

public class Cone implements ThreeDimensionalShape{

    int radius, height;

    public Cone(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return (1.0/3) * Math.PI * radius * radius * height;
    }

    @Override
    public int numberOfDimensions() {
        return 3;
    }
    
    // Added toString to display volume
	@Override
	public String toString() {
		return "The volume of the Cone is " + Math.round(getVolume() * 100)/100.0;
	}
    
}