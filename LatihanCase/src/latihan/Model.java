package latihan;

import java.sql.Timestamp;
import java.util.Random;

public class Model {
    String id;
    int max = 999999999;
    int min = 900000000;
    int leftLimit = 97; // letter 'a'
    int rightLimit = 122; // letter 'z'
    int targetStringTitle = 25;
    int targetStringText = 100;
    int targetStringSource = 10;
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

    public void display(){
        System.out.println("\nId\t:\t" + randomId());
        System.out.println("Title\t:\t" + randomTitle());
        System.out.println("Text\t:\t" + randomText());
        System.out.println("Source\t:\t" + randomSource());
        System.out.println("Date\t:\t" + randomDate());
    }

    public String randomId() {
        String SALTCHARS = "1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }

    // public int randomId(){
    //     return this.id = (int)Math.floor(Math.random()*(max-min+1)+min);
    // }

    public String randomTitle() {

        Random random = new Random();

        return this.title = random.ints(leftLimit, rightLimit + 1)
        .limit(targetStringTitle)
        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        .toString();
    }

    public String randomText(){

        Random random = new Random();
        
        return this.text = random.ints(leftLimit, rightLimit + 1)
        .limit(targetStringText)
        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        .toString();
    }

    public String randomSource(){

        Random random = new Random();

        return this.source = random.ints(leftLimit, rightLimit + 1)
        .limit(targetStringSource)
        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        .toString();
    }

    public Timestamp randomDate(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return this.date = timestamp;
    }

    // public int getId(){
    //     return this.id;
    // }

    public void setTitle(String title){
        this.title = title;

    }
       
}
