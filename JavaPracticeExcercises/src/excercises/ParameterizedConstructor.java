package excercises;

public class ParameterizedConstructor {

	public static void main(String[] args) {
		

	}

}

class Student {
	int id, age;
	String name;
	
	Student(int i, String n){
		id=i;
		name=n;
		
	}
	
	public Student(int id, String name, int a) {
		super();
		this.id = id;
		this.name = name;
		age=a;
	}

	void display() {
		System.out.println(id+" "+name+" "+age);
	}
	public static void main(String[] args) {
		Student s1=new Student(123, "Krishna");
		Student s2=new Student(124, "Mohan", 29);
		
		s1.display();
		s2.display();
		
		
	}
}
