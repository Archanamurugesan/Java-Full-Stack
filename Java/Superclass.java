
class A{
    int a = 110;
    A(String name){
        System.out.println("Welcome " + name);
    }
    void myMethod() {
        System.out.println("Super class method");
    }
}
class B extends A {
    B(){
        super("Radhi");
    }
    void myMethod2() {
        System.out.println("Super class variable : " + super.a);
        super.myMethod();
    }
}
public class Superclass {

    public static void main(String[] args) {
        B b = new B();
        b.myMethod2();

    }

}