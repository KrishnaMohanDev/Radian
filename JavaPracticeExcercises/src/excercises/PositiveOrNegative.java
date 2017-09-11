package excercises;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		int x;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the Number:");
		x=in.nextInt();
		
		if(x>=0) {
			System.out.println("This is a Positive Number");
			
		}
		else {
			System.out.println("This is a Negative Number");
		}
			
	}

}
