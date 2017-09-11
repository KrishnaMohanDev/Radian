package excercises;
import java.util.Scanner;
public class Sumof2Numbers {

	public static void main(String[] args) {
		double x,y,z;
				
		Scanner in = new Scanner(System.in);
		System.out.println("Input x,y");
		x=in.nextDouble();
		y=in.nextDouble();
		z=x+y;
		System.out.println("Sum of x,y is "+z);

	}

}
