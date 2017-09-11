package excercises;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		double r;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Radius of the circle r");
		r=in.nextDouble();
		double area=Math.PI*r*r;
		double perimeter=2*Math.PI*r;
		System.out.println("Area of the circle with Radius "+r+" is "+area);
		System.out.println("Perimeter of the circle with Radius "+r+" is "+perimeter);

	}

}
