package latihan;
import java.sql.Timestamp;


public class Model {
    String id;
    String title;
    String text;
    String source;
    Timestamp date;
    Model(String id, String title, String text, String source, Timestamp date) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.source = source;
        this.date = date;
    }

    public void setTitle(String new_title) {
        this.title = new_title;
    }

    public void show() {
        System.out.println("\nid\t:\t" + id);
        System.out.println("title\t:\t" + title);
        System.out.println("text\t:\t" + text);
        System.out.println("source\t:\t" + source);
        System.out.println("date\t:\t" + date);
        System.out.println("==================================");
    }

 

}
