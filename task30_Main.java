class Course{
    String courseName ;
    int  duration;
    double fre;
    Course(String courseName,int duration,double fre){
        this.courseName=courseName;
        this.duration=duration;
        this.fre=fre;

    }
   void display(){
    System.out.println(courseName);
    System.out.println(duration);
    System.out.println(fre);

   }
}
public class task30_Main {
    public static void main(String[] args) {
        Course c=new Course("java", 12, 3000);
        c.display();
    }
    
}
