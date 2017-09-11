package excercises;

import java.util.Scanner;

public class Devide2Numbers {

	public static void main(String[] args) {
		double x,y,z;
		
		Scanner in = new Scanner(System.in); 
		System.out.println("Enter x,y");
		x=in.nextDouble();
		y=in.nextDouble();
		z=x/y;
		System.out.println("Division of x,y is "+z);
	}

}
