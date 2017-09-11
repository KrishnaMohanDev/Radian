package excercises;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		int sum=111;
		
		for(int i=0;i<=9999;i++) {
			
			if(i%2!=0) {
				sum=sum+i;
			}
		}
		System.out.println("Sum of Odd Numbers is "+sum);
	}

}
