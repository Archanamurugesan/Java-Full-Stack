
class BankAccount{
void deposit() {
System.out.println("Amount is depoited ");
}
void withdraw() {
System.out.println("Amount is withdraw");
}
}
class SavingsAccount extends BankAccount{
void withdraw() {
int amnt = 90;
if (amnt < 100) {
System.out.println("Bal is falls below Hundred");
}
else {
System.out.println("Withdraw allowed");
}
}
}
public class Bank {

	
public static void main(String[] args) {
SavingsAccount s = new SavingsAccount();
s.deposit();
s.withdraw();

}

}

