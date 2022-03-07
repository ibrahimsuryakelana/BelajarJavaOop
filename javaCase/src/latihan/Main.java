package latihan;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        Util util = new Util("id", "title", "text", "source", null);
        Model[] obj = new Model[51];
        for (int a = 1; a <= 50; a++) {
            obj[a] = new Model(util.getRandomId(), util.randomTitle() , util.randomText(), util.randomSource(), util.randomDate());
        }
        for (int a = 1; a <= 50; a++) {
            System.out.println("\nData ke-"+ a);
            obj[a].show();
        }

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
                System.out.println("--------update title----------");
        for (int e = 1; e <= 5; e++) {
             System.out.print("\ninput id yang akan diupdate :");

            // Reading data using readLine
            String seach_id = reader.readLine();
            for (int a = 1; a <= 50; a++) {
                String ids = obj[a].id;
                if (ids.equals(seach_id)) {
                    System.out.print("input title :");
                    String new_titles = reader.readLine();
                    obj[a].setTitle(new_titles);
                }
            }
        }
       
        
        for (int a = 1; a <= 50; a++) {
            System.out.println("Data sudah terupdate");
            System.out.println("\nData ke-"+ a);
            obj[a].show();
        }
        
    }
}
