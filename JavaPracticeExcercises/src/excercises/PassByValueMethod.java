package excercises;

import java.util.Scanner;

public class PassByValueMethod {

	public static void main(String[] args) {

		int a,b;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter values of a, b to swap are:");
		a=in.nextInt();
		b=in.nextInt();

		swapFunction(a,b);
		
			}
	public static void swapFunction(int a,int b) {
		System.out.println("Values of a, b before swapping: "+a+","+b);
		int c=a;
		a=b;
		b=c;
		
		System.out.println("Values of a, b after swapping: "+a+","+b);
	}
}
