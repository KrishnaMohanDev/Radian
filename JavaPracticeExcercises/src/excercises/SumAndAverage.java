package excercises;

public class SumAndAverage {

	public static void main(String[] args) {
		int sum=0;
		
		for (int i=0;i<=100;i++) {
			sum=sum+i;
	
		}
		double avg=sum/100;
		System.out.println("Sum of 1 to 100 is "+sum);
		System.out.println("Avarage of 1 to 100 is "+avg);
		
		}

}
