class  Product{
    String productName ;
    int quantity;
    double  price;
    Product(){
        this.productName="unknow";
        this.quantity=0;
        this.price=0;
    }
    Product(String productName){
        this.productName=productName;
        this.quantity=0;
        this.price=0;
    }
   Product(String productName,int quantity,double price){
        this.productName=productName;
        this.quantity=quantity;
        this.price=price;
    }
    void   calculateTotal(){
        System.out.println("productname="+productName);
        System.out.println("quantity="+quantity);
        System.out.println("price="+price);
        System.out.println("Total Price: ₹" + (quantity * price));

    }
}
public class task31_main {
    public static void main(String[] args) {
        Product p=new Product("life Man",4,200);
        p.calculateTotal();
        
    }
    
}
