import java.util.Scanner;
public class PrimeNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int flag=0,m=0;
        System.out.println("Enter number");
        int number = sc.nextInt();
        m = number/2;
        if(number==0 || number==1){
            System.out.println(number+" "+"is not prime number");
        }
        else{
            for(int i=2;i<m;i++){
            if (number%i == 0){
                System.out.println(number+" "+"is not prime number");
                flag = 1;
                break;
            }
            if(flag==0){
                System.out.println(number+" "+"is a Prime number");
                break;
            }
        }
    }
    }    
}