interface SmartDevice {
    void  connectWifi() ;
    default void deviceStatus(){
        System.out.println("Smart device is ready");

    }
    
}
class SmartTV implements SmartDevice{
    public  void connectWifi(){
        System.out.println("Smart TV connected to WiFi");
    }

}
class SmartWatch implements SmartDevice{
    public void connectWifi(){
        System.out.println("Smart Watch connected to WiFi");
    }

}
public class Task28_main {
    public static void main(String[] args) {
        SmartTV a=new SmartTV();
        a.connectWifi();
        a.deviceStatus();
        SmartWatch b=new SmartWatch();
        b.connectWifi();
        b.deviceStatus();
    }
    
}
