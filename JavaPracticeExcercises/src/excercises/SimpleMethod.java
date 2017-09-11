package excercises;

import java.util.Scanner;

public class SimpleMethod {

	public static void main(String[] args) {
		int a,b,c;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a, b values");
		a=in.nextInt();
		b=in.nextInt();
		c=minFunction(a,b);
		System.out.println("Minimum of "+a+" , "+b+" is: "+c);

	}
	public static int minFunction(int a,int b) {
		int min;
		
		if (a>b) {
			min=b;
			
		}
		else {
			min=a;
		}
		return min;
	}
}
