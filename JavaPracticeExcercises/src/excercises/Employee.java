package excercises;

class MaintainEmployee {

	int id;
	String name;
	double salary;
	
	void insert(int i, String n,double s) {
		id=i;
		name=n;
		salary=s;
		
	}
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}

}

public class Employee {

	public static void main(String[] args) {
		MaintainEmployee e1=new MaintainEmployee();
		MaintainEmployee e2=new MaintainEmployee();
		MaintainEmployee e3=new MaintainEmployee();
		
		e1.insert(123,"Krishna",10000);
		e2.insert(124, "Mohan", 20000);
		e3.insert(125, "Dev", 30000);
		
		e1.display();
		e2.display();
		e3.display();
	}
		
	
	
}
