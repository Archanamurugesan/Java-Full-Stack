
class Animal {
	
	void makeSound () {
		
		System.out.println ("Meoww");
	}
}

class Cat extends Animal {
	
	void makeSound () {
		
		System.out.println ("Bark");
	}
}


public class Sound {
	public static void main (String [] args) {
		
		System.out.println ("The Sound cat makes is ");
		
		Cat b = new Cat () ;
		
		b.makeSound();
	}

}
