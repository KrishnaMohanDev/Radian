package excercises;

public class SumAndAvgWhile {

	public static void main(String[] args) {
			int sum=0;
			int i=1;
			while(i<=100) {
				sum=sum+i;
				i++;
			}
			double avg=sum/100;
			System.out.println("Sum of 1 to 100 Numbers is "+sum);
			System.out.println("Average of 1 to 100 is "+avg);
		}

	}

