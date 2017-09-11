package excercises;

import java.util.Scanner;

public class AverageOfNumbers {

	public static void main(String[] args) {

		double x,y,z;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 3 Numbers");
		x=in.nextDouble();
		y=in.nextDouble();
		z=in.nextDouble();
		
		double average=(x+y+z)/3;
		System.out.println("Average of 3 Numbers is "+average);

	}


}
