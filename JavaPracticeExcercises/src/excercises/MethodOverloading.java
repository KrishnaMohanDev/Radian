package excercises;

import java.util.Scanner;

public class MethodOverloading {

	public static void main(String[] args) {
		/*double x,y;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the values for x, y:");
		x=in.nextDouble();
		y=in.nextDouble();
		*/
		minFunction(13,15);
		minFunction(12.5,15.3);

	}
	public static void minFunction(int x, int y) {
		if(x>y) {
			System.out.println(y+" is the minimum number.");
		}
		else {
			System.out.println(x+" is the minimum number.");
		}
	}
	public static void minFunction(double x, double y) {
		if(x>y) {
			System.out.println(y+" is the minimum number");
		}
		else {
			System.out.println(x+" is the minimum number");
		}
	}
}
