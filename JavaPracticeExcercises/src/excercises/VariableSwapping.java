package excercises;

import java.util.Scanner;

public class VariableSwapping {

	public static void main(String[] args) {

		int a,b;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter variables to swap");
		a=in.nextInt();
		b=in.nextInt();
		System.out.println("Before Swapping "+a+" ,"+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping "+a+" ,"+b);

	}

}
