package sample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Ram on 18-07-2017.
 */
public class Masterappend {



    public void append(String s)
    {
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {


            File file = new File("master.txt");

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();

            }

            // true = append file
            fw = new FileWriter(file.getAbsoluteFile(),true);
            bw = new BufferedWriter(fw);

            bw.write(s+"\n");


            System.out.println("File created and saved");

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (bw != null)
                    bw.close();

                if (fw != null)
                    fw.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }
        }
    }
}
