package excercises;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		int x;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Number");
		x=in.nextInt();
		for (int i = 1;i<=10; i++) {
			

			System.out.println(x+"*"+i+" = "+(x*i));	
			
		}
				
	}

}
