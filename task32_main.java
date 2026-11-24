class Book{
    int bookid;
    String title;
    String author;
    Book(int bookId, String title){
        this.bookid=bookId;
        this.title=title;
        this.author="unknow";
    }
    Book(int bookId, String title, String author) {
        this.bookid=bookId;
        this.title=title;
        this.author=author;

    }
    void display(){
        System.out.println("bookid="+bookid);
        System.out.println("title="+title);
        System.out.println("author="+author);

    }
}
public class task32_main {
    public static void main(String[] args) {
        Book b=new Book(12, "life of human", "sura pranay kumar");
        b.display();
        
    }
    
}
