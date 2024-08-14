import java.util.Scanner;

public class Greatest {
    public static void main (String args[]){

        int a;
        int b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        a = sc.nextInt();
        System.out.println("Enter a number: ");
        b = sc.nextInt();

        if ( a > b){
            System.out.println("A is greater");
        }

        else{
            System.out.println("B is greater");
        }


        
    }
}