package JSON;

import org.quickconnectfamily.json.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

public class MatiasTest {

    public static void main(String[] args) {

        try {
            FileOutputStream fout = new FileOutputStream("MatiasJSON.txt");
            FileInputStream fin = new FileInputStream("MatiasJSON.txt");

            JSONOutputStream jsonOut = new JSONOutputStream(fout);
            JSONInputStream jsonIn = new JSONInputStream(fin);

            MatiasObjectTest car1 = new MatiasObjectTest("VW", "Jetta", "2014", "White");
            MatiasObjectTest car2 = new MatiasObjectTest("Ferrari", "458", "2016", "Red");
            MatiasObjectTest car3 = new MatiasObjectTest("Honda", "Accord", "2015", "Black");

            System.out.println(JSONUtilities.stringify(car1));

            jsonOut.writeObject(car1);
            jsonOut.writeObject(car2);
            jsonOut.writeObject(car3);

            HashMap parsedMap = (HashMap) jsonIn.readObject();

            MatiasObjectTest readObject = new MatiasObjectTest("make", "model", "2014", "hello");

            System.out.println(parsedMap.get("make"));

            // NASTY

            FileOutputStream fout2 = new FileOutputStream("Java_logo.png");
            FileInputStream fin2 = new FileInputStream("Java_logo.png");

            JSONOutputStream jsonOut2 = new JSONOutputStream(fout2);
            JSONInputStream jsonIn2 = new JSONInputStream(fin2);

            MatiasObjectTest try1 = new MatiasObjectTest("one", "two", "three", "four");

            System.out.println(JSONUtilities.stringify(try1));

            jsonOut2.writeObject(try1);


            // NASTY PATH

            jsonOut.writeObject(null);
            jsonOut.writeObject(0);
            jsonOut.writeObject("Hello");

            // no permissions to write in the file, read a unknown filetype

        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
