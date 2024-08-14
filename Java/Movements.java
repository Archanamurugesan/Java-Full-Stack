
class An {
	
	 void move () {
		System.out.println("All animals move ");
		
	}
	
	void eat () {
		System.out.println ("All animals eat ");
	}
}


class Dog extends An {
	void move () {
		
		System.out.println ("Dog will walk");
	}
	
	void eat () {
		System.out.println("Dog will eat chicken");
	}
}

class Fish extends An {
	
	void move () {
		System.out.println("Fish will swim");
	}
	
	void eat () {
		System.out.println ("Fish will eat algae");
	}
}
public class Movements {
	public static void main (String [] args) {
		An animal ;
		
		animal = new Dog () ; //DMD
		animal.move () ;
		animal.eat () ;
		
	}
}
