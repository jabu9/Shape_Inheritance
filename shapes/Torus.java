/*
 * 
 * Jordan Abuhantash
 * Project 01
 * CMSC 335
 * Torus.java
 * 
 */


package shapes;

import utils.ThreeDimensionalShape;

public class Torus implements ThreeDimensionalShape {

    int majorRadius, minorRadius;

    public Torus(int majorRadius, int minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    // Calculate and return the volume of the torus using the major and minor radius.
    @Override
    public double getVolume() {
        return (Math.PI * minorRadius * minorRadius) * (2 * Math.PI * majorRadius);
    }

    @Override
    public int numberOfDimensions() {
        return 3;
    }
    
    // Added toString to display volume
	@Override
	public String toString() {
		return "The volume of the Torus is " + Math.round(getVolume() * 100)/100.0;
	}
    
}