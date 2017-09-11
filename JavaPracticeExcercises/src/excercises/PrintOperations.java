package excercises;

import java.util.Scanner;
public class PrintOperations {

	public static void main(String[] args) {
		
		int a,b;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a, b");
		a=in.nextInt();
		b=in.nextInt();
		
		System.out.println("Sum of a, b ="+ (a+b));
		System.out.println("Difference between a, b ="+ (a-b));
		System.out.println("Product of a, b ="+ (a*b));
		System.out.println("Division of  a, b ="+ (a/b));
		System.out.println("Reminder of a, b ="+ (a%b));
		System.out.println("Result of Expression is "+((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) );
	}

}
