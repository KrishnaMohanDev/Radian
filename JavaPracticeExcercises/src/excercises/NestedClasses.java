package excercises;

import java.util.Scanner;

public class NestedClasses {

	public static void main(String[] args) {
		int a,b;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a, b:");
		a=in.nextInt();
		b=in.nextInt();
		addition(a,b);
		division(a,b);
		reminder(a,b);
	}

	public static int addition(int a, int b) {
		int sum=a+b;
		System.out.println("Sum of a, b is "+sum);
		return sum;
	
	}
	public static double division(int a, int b) {
		double div=a/b;
		System.out.println("Division of a,b is "+div);
		return div;
	}
	public static double reminder(int a, int b) {
		int rem=a%b;
		System.out.println("Reminder of a,b is "+rem);
		return rem;
		
		
	}
	
}

