/*
 * 
 * Jordan Abuhantash
 * Project 01
 * CMSC 335
 * Cube.java
 * 
 */


package shapes;

import utils.ThreeDimensionalShape;

public class Cube  implements ThreeDimensionalShape{

    int area;

    public Cube(int area) {
        this.area = area * area * area;
    }

    @Override
    public double getVolume() {
        return area;
    }

    @Override
    public int numberOfDimensions() {
        return 3;
    }
    
    // Added toString to display volume
	@Override
	public String toString() {
		return "The volume of the Cube is " + Math.round(getVolume() * 100)/100.0;
	}
    
}