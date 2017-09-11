package excercises;

import java.util.Scanner;

public class PrintNumberInWords {

	public static void main(String[] args) {
		int x;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		x=in.nextInt();
		
		if(x==1) {
			System.out.println("ONE");
		}
		else if (x==2) {
			System.out.println("TWO");
		}
		else if (x==3) {
			System.out.println("THREE");
		}
		else if (x==4) {
			System.out.println("FOUR");
		}
		else if (x==5) {
			System.out.println("FIVE");
		}
		else if (x==6) {
			System.out.println("SIX");
		}
		else if (x==7) {
			System.out.println("SEVEN");
		}
		else if (x==8) {
			System.out.println("EIGHT");
		}
		else if (x==9) {
			System.out.println("NINE");
		}
		else  {
			System.out.println("OTHER");
		}
	}


}
