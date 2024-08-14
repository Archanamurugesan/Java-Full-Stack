
class Vehicle{
void noOfEngine(){
System.out.println("One engine");
}
}
class TwoWheeler extends Vehicle{
void noOfWheels() {
System.out.println("I have two wheels");
}
}
class Bike extends TwoWheeler{
void brandname() {
System.out.println("Brand Name is Honda");
}
}
class Scooty extends TwoWheeler{
void brandname() {
System.out.println("Brand Name is Activa");
}
}

public class Inheritance {

public static void main(String[] args) {
Bike bike = new Bike();
bike.noOfEngine();
bike.noOfWheels();
bike.brandname();

Scooty scooty = new Scooty();
scooty.noOfEngine();
scooty.noOfWheels();
scooty.brandname();
}

}