package excercises;

public class SumAndAvgDoWhile {

	public static void main(String[] args) {
		int sum=0;
		int i=1;
		do {
			sum=sum+i;
			i++;
			
		}
		while(i<=100);
		double avg=sum/100;
		System.out.println("Sum of 1 to 100 is "+sum);
		System.out.println("Average of 1 to 100 is "+avg);
	}
	

}
