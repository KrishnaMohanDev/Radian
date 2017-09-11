package excercises;

public class VoidMethodExample {

	public static void main(String[] args) {

		classFunction(25);

	}
public static void classFunction(double marks) {
	if(marks>75) {
		System.out.println("Distinction");
	}
	else if (marks<75 && marks>60) {
		System.out.println("2nd Class");
	}
	
	else if (marks<60 && marks>35) {
		System.out.println("3rd Class");
	}
	else if (marks<35 && marks>0) {
		System.out.println("Falied");
	}
	else {
		System.out.println("Invalid Marks");
	}
}
}
