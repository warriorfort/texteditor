package sample;


import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Created by timbuchalka on 8/05/2016.
 */
public class DialogController {
    @FXML
    public ListView<String> lst;

    @FXML
public TextField filename ;
    @FXML
    public TextField filename1;
    @FXML
    public  TextField instring;
    @FXML
    public TextField outstring;
    @FXML
    public TextField username;
    public String filename()
    {
          filename.setPromptText("add .txt  at end of name.");
        return filename.getText();
    }
    public String opnfilename()
    {

        return filename1.getText();
    }
    public void setlistview()
    {
        BufferedReader br = null;
        FileReader fr = null;
        String sCurrentLine = null;

        String buffer =null ;
        try {

            fr = new FileReader("master.txt");
            br = new BufferedReader(fr);


            br = new BufferedReader(new FileReader("master.txt"));

            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
                lst.getItems().add(sCurrentLine);
            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (br != null)
                    br.close();

                if (fr != null)
                    fr.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }

    }
     public String getitm()
     {



         ObservableList selectedIndices = lst.getSelectionModel().getSelectedIndices();
         ObservableList d = lst.getSelectionModel().getSelectedItems();
                String h =  d.toString();
                return  h ;

     }
     public String getstrings()
     {


         return (instring.getText() +" " + outstring.getText() );
     }
     public String getname()
     {

         return  username.getText();
     }


}

