package latihan;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main{

    public static void main(String[] args) throws Exception{ 
        Model obj = new Model("id", "title", "text", "source", null);
        Model[] o = new Model[10];
            for (int a = 0; a < 10 ; a++) {
                o[a] = new Model(obj.randomId(), obj.randomTitle(), obj.randomText(), obj.randomSource(), obj.randomDate());
                    // obj.randomTitle();
                    // obj.randomText();
                    // obj.randomSource();
                // obj.randomDate();
            }
            for (int a = 0; a < 10 ; a++) {
                o[a].display();
            }

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.print("\ninput id :");

        // Reading data using readLine
        String seach_id = reader.readLine();
        for (int a = 0; a < 2; a++) {
            String ids = o[a].id;
            if (ids.equals(seach_id)) {
                System.out.print("input title :");
                String new_titles = reader.readLine();
                o[a].setTitle(new_titles);
            }
        }
            for (int a = 0; a < 2 ; a++) {
                o[a].display();
            }
            
    }
}
