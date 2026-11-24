interface Alert {
    void sendAlert(String message);
}

class EmailAlert implements Alert {
    public void sendAlert(String message) {
        System.out.println("Email Alert: " + message);
    }
}

class MobileAlert implements Alert {
    public void sendAlert(String message) {
        System.out.println("Mobile Alert: " + message);
    }
}

public class Task26_main {
    public static void main(String[] args) {

        EmailAlert e = new EmailAlert();
        e.sendAlert("hi");

        MobileAlert m = new MobileAlert();
        m.sendAlert("good");
    }
}