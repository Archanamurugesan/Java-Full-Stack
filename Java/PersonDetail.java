
class Person {
	
	void getFirstName () {
		
		System.out.println("Firstname  : Archana");
	}
	
	void getLastName () {
		
		System.out.println("Lastname  : A M");

	}
}


class Employee {
	
	void getEmployeeId () {
		
		System.out.println("Employee Id : 101");

	}
	
	void getLastName () {
		
		System.out.println("Lastname  : Murugesan");

	}
}
public class PersonDetail {
	public static void main (String [] args) {
		
		System.out.println ("Person Details :");
		
		Employee b = new Employee ();
		
		b.getEmployeeId ();
		b.getLastName ();
		
	}

}
