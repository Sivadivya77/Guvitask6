package guvitask5;

public class Maincircle {

	public static void main(String[] args) {
		

        int r = 0;
        Circle circle = new Circle(r);
        System.out.println("Radius of the circle is " + r);
        System.out.println("The area of the circle is " + circle.getArea());
        System.out.println("The circumference of the circle is " + circle.getCircumference());
        r = 12;
        circle.setRadius(r);
        System.out.println("\nRadius of the circle is " + r);
        System.out.println("The area of the circle is now " + circle.getArea());
        System.out.println("The circumference of the circle is now " + circle.getCircumference());
	}
	    }
	
/*output
 * Radius of the circle is 0
The area of the circle is 0.0
The circumference of the circle is 0.0

Radius of the circle is 12
The area of the circle is now 452.3893421169302
The circumference of the circle is now 75.39822368615503*/
 

