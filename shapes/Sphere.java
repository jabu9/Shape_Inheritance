/*
 * 
 * Jordan Abuhantash
 * Project 01
 * CMSC 335
 * Sphere.java
 * 
 */


package shapes;

import utils.ThreeDimensionalShape;

public class Sphere implements ThreeDimensionalShape {

    int radius;

    public Sphere(int radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4.0/3.0) * (Math.PI * (radius * radius * radius));
    }

    @Override
    public int numberOfDimensions() {
        return 3;
    }
    
    // Added toString to display volume
	@Override
	public String toString() {
		return "The volume of the Sphere is " + Math.round(getVolume() * 100)/100.0;
	}
    
}