
class Ani {
	String msg = getMessage () ;
	String getMessage () {
		return "A";
	}
}

class Dog1 extends Ani {
	String getMessage () {
		return "B";
	}
}

public class Overriding {
	public static void main (String [] args) {
		Ani animal = new Dog1 () ;
		System.out.println(animal.msg);
	}
}
git