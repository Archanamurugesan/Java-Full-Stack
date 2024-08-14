
class Animal1{
void move() {
System.out.println("Walk");
}
}
class Cheetah extends Animal1{
void move() {
System.out.println("Run");
}
}
public class Animalmove {

public static void main(String[] args) {
Cheetah c = new Cheetah();
System.out.print("Cheetah will ");
c.move();

}

}