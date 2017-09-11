package excercises;

import java.util.Scanner;

public class ProductOf2Numbers {

	public static void main(String[] args) {
		double x,y,z;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the values for x,y");
		x=in.nextDouble();
		y=in.nextDouble();
		z=x*y;
		System.out.println("Product of x,y is "+z);
	}

}
