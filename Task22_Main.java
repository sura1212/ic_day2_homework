abstract class BankAccount {
    abstract void calculateInterest(double balance);
    public  void displayAccountType() {
        System.out.println("Bank Account Details");
    }
  
}
class SavingsAccount extends BankAccount{
    double balance;
    @Override 
    public void calculateInterest(double  balance ){
        this.balance=balance;
        System.out.println("calculateInterest="+(balance*0.5));
    

    }

}
public class Task22_Main {
    public static void main(String[] args) {
        SavingsAccount s=new SavingsAccount();
        s.displayAccountType();
        s.calculateInterest(200000);

        
    }
    
}
