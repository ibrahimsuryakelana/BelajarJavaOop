package latihan;
import java.util.Random;
import java.sql.Timestamp;


public class Util extends Model{
    int leftLimit = 97; // letter 'a'
    int rightLimit = 122; // letter 'z'
    int targetStringTitle = 25;
    int targetStringText = 100;
    int targetStringSource = 10;

    Util(String id, String title, String text, String source, Timestamp date) {
        super(id, title, text, source, date);
        //TODO Auto-generated constructor stub
    }

    public String getRandomId() {
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
}
