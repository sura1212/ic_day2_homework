
interface Playable {
    void playMedia(); 

    
}

interface Downloadable {
    void downloadMedia();

    
}
class MusicPlayer implements  Playable,Downloadable{
    public  void playMedia(){
        System.out.println("Playing music...");
    }
    public void downloadMedia(){
        System.out.println("Downloading music...");
    }
}
public class Task27_Main {
    public static void main(String[] args) {
        MusicPlayer m=new MusicPlayer();
        m.playMedia();
        m.downloadMedia();
        
    }    
}
