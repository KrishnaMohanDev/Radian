package excercises;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {

		int x,y,z;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the 3 Numbers:");
		x=in.nextInt();
		y=in.nextInt();
		z=in.nextInt();
		
		if(x>y && x>z) {
			System.out.println(x+" is the highest number");
			
		}
		
		else if (y>x && y>z) {
			System.out.println(y+" is the highest number");
			
		}
		
		else {
			System.out.println(z+" is the highest number");
		}

	}
	
}
