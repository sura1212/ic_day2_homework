abstract class PaymentGateway{
    abstract void  makePayment();
}
class GooglePay extends  PaymentGateway{
    public  void makePayment(){
        System.out.println("Payment completed using Google Pay");

    }
}
class PhonePe extends  PaymentGateway{
    public  void makePayment(){
        System.out.println("Payment completed using PhonePe");

    }
}
public class Task25_Main {
    public static void main(String[] args) {
        GooglePay g=new GooglePay();
        g.makePayment();
        PhonePe p=new PhonePe();
        p.makePayment();
        
    } 
    
}
