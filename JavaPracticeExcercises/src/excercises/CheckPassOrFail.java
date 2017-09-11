package excercises;

import java.util.Scanner;

public class CheckPassOrFail {

	public static void main(String[] args) {
		int x;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the value of x");
		x=in.nextInt();
		
		if (x>=50) {
			
			System.out.println("Marks of the student are "+x+" PASS");
			
						
		}
		else {
			System.out.println("Marks of the student are "+x+" FAIL");
		}
		System.out.println("DONE");
	
	}

}
