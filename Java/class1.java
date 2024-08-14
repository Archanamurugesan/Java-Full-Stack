
class C{
C(){
System.out.println("C");
}
C(int c){
System.out.println("C 1");
}
}
class D extends C{
D(){
super();
System.out.println("D");
}
D(int c){
System.out.println("D 1");
}
}
public class class1 {

public static void main(String[] args) {
D d = new D();

}

}