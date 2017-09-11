package excercises;

public class CozaWozaLoza {

	public static void main(String[] args) {
		int x=1;
		
		for (int i=1;i<=100;i++) {
			x=i;
			if (i%11==0) {
				System.out.println(x);
			}
			else if(i%3==0) {
				System.out.print("Coza"+" ");
			}
			else if(i%5==0) {
				System.out.print("Woza"+" ");
			}
			else if (i%7==0) {
				System.out.print("Loza"+" ");
			}

			else {
			
				System.out.print(" "+x+" ");
			}
			
		}

	}

}
