package excercises;

import java.util.Scanner;

public class CheckOddOrEven {

	public static void main(String[] args) {
		int x;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of x");
		x=in.nextInt();
		
		if (x%2==0) {
			System.out.println(x+" is an Even Number");
			
		}
		else {
			System.out.println(x+" is an Odd Number");
		}
	}

}
