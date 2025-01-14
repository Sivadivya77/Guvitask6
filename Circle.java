package guvitask5;

public class Circle {
	private double radius;

    // Constructor for the Circle class that initializes the radius variable
    public Circle(double radius) {
        // Set the radius variable to the provided radius parameter
        this.radius = radius;
    }

  
    public double getRadius() {
        return radius;
    }

    	public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
} 


