
class Shape{
void getArea() {
System.out.println("Area is 84");
}
}
class Rect extends Shape{
void getArea() {
System.out.println("Area is 100");
}
}
public class ShapeandRectangle {
public static void main(String [] args) {
Rect obj = new Rect();
obj.getArea();
}

}

