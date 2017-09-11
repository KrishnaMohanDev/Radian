package excercises;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		/*int x;
						
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number to calculate factorial");
		x=in.nextInt();..*/
		Factorial(5);
				
	}
	public static void Factorial(int x) {
		
		for(int i=1;i<=x;) {
			int z;
			z=i;
			int y=z*i;
			
			i++;
			if(i==x) {
				System.out.println(y);		
			}
			
		}
		
		
	}
}
