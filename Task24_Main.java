abstract class Delivery{
    public  void acceptOrder(){
        System.out.println("Delivery order accepted");

    }
    abstract void deliverProduct();
}
class FoodDelivery extends Delivery{
    public  void deliverProduct(){
        System.out.println("Food order delivered to customer");
    }
}
class ParcelDelivery extends Delivery{
    public  void deliverProduct(){
        System.out.println("Parcel delivered successfully");
    }
}
public class Task24_Main {
    public static void main(String[] args) {
        FoodDelivery f=new FoodDelivery();
        f.deliverProduct();
        ParcelDelivery p=new ParcelDelivery();
        p.deliverProduct();

    }
    
}
