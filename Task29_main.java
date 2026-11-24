class Mobile {
    String  brand ;
    int price ;
    Mobile(String brand,int price){
        this.brand=brand;
        this.price=price;
    }
    void display(){
        System.out.println("brand="+brand);
        System.out.println("price="+price);
    }
}
public class Task29_main {
    public static void main(String[] args) {
        Mobile m=new Mobile("iq", 500000);
        m.display();
        
    }
    
}
