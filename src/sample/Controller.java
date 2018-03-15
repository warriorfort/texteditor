package sample;

import com.sun.org.apache.xpath.internal.SourceTree;
import javafx.fxml.FXML;
import javafx.scene.input.KeyEvent;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import javax.swing.border.TitledBorder;
import java.io.*;
import java.util.*;

public class Controller {
    public double x1;
    public double y1;
    int count = 0;
    int occur = 0;
    int flag = 0;
    int flagCase =0;
    String temp2 = "";
    String sub;
    public String fin = "Hello";
    public String key = "";
    public  String transfer ="Welc";
    public  String username ="";
    Set<String> rec = new LinkedHashSet<>();
    Set<String> recmem = new LinkedHashSet<>();

    ArrayList<Integer> al = new ArrayList<Integer>();
    @FXML
    private TextField tf;

    @FXML
    public TitledBorder primaryStage;
    @FXML
    private TextArea workingTextArea;

    @FXML
    private BorderPane mainBorderPane;
    @FXML
    private  Button btn1;
    @FXML
    private  Button btn2;
    @FXML
    private  Button btn3;
    @FXML
    private ContextMenu contextMenu;
    @FXML
    private ListView suggestionlist;

    String titl = Main.getStage().getTitle();

    public void initialize() {


        //----------------------Setting user name------------------------//

        BufferedReader br = null;
        FileReader fr = null;
        String sCurrentLine = null;

        String buffer = null;
        try {
            String usrname= "";
            fr = new FileReader("username.txt");
            br = new BufferedReader(fr);


            br = new BufferedReader(new FileReader("username.txt"));

            while ((sCurrentLine = br.readLine()) != null) {

                usrname = sCurrentLine;
            }

            fin = "Hi "+usrname;

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











        //------------------Setting user name---------------------------------//
        // changed the font
        workingTextArea.setFont(Font.font("Comic Sans MS", FontWeight.MEDIUM,14));
        // suggestionlist.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        contextMenu = new ContextMenu();
        MenuItem wd = new MenuItem("Word Meaning");
        contextMenu.getItems().add(wd);
        /*btn1.setStyle("-fx-background-color: #0000ff");
        btn2.setStyle("-fx-background-color: #0000ff");
        btn3.setStyle("-fx-background-color: #0000ff");*/
        wd.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //idea for word meaning output word meaning in alert window

                // adding platform runlater didn't improved the ui lagginess much.

                Platform.runLater(() -> {

                    ArrayList<String> al1 = new ArrayList<>();
                    String s = workingTextArea.getSelectedText();
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Word Meaning");
                    alert.setHeaderText("Look what i have found on the web");
                    String d = "";
                    try {
                        al1 = wordmeaningapi.api(s);
                        for (int f = 0; f < al1.size(); f++) {
                            d = d + al1.get(f) + "\n";


                        }

                        alert.setContentText(d);


                        alert.showAndWait();


                    } catch (Exception e) {
                        e.printStackTrace();
                    }


                    //  System.out.println(s);
                } );
            }
        });
        workingTextArea.setContextMenu(contextMenu);

        // System.out.println(workingTextArea.getCaretPosition());
/*
        fixed the bug of getting erroneous behaviour on first time loading of suggestion
        calling change() in initialize fixed the problem
*/
        change();

        suggestionlist.getItems().add("Place cursor at end of word and press CTRL for suggestions");
       // tf.setText("");
        tf.setPromptText("Search");

    }


    @FXML
    public void savefile() throws IOException {
        BufferedWriter bw = null;
        FileWriter fw = null;
        String titl = Main.getStage().getTitle();
        if (titl.equals("Untitled")) {
            System.out.println(workingTextArea.getText());
            String con = workingTextArea.getText();
            Dialog<ButtonType> dialog = new Dialog<>();
            dialog.initOwner(mainBorderPane.getScene().getWindow());
            dialog.setTitle("Filename");
            //dialog.setHeaderText("Use this dialog to create a new todo item");
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("savefile.fxml"));
            try {
                dialog.getDialogPane().setContent(fxmlLoader.load());

            } catch (IOException e) {
                System.out.println("Couldn't load the dialog");
                e.printStackTrace();
                return;
            }

            dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
            dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

            Optional<ButtonType> result = dialog.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK) {
                DialogController controller = fxmlLoader.getController();
                String fname = controller.filename();
                Main.getStage().setTitle(fname);
                System.out.println(fname);
//appending the newly created file to master.txt

                Masterappend ma = new Masterappend();
                ma.append(fname);

                try {


                    File file = new File(fname);

                    // if file doesnt exists, then create it
                    if (!file.exists()) {
                        file.createNewFile();
                        flag = 1;
                    }

                    // true = append file
                    fw = new FileWriter(file.getAbsoluteFile());
                    bw = new BufferedWriter(fw);
                    System.out.println("text area split by new line");
                    for (String line : con.split("\\n"))
                    {
                        System.out.println(line);
                    }

                    writetofilewithnextline(fname,con.split("\\n"));
                 //   bw.write(con);


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
        } else {
            try {

                titl = Main.getStage().getTitle();
                File file = new File(titl);

                // if file doesnt exists, then create it
                if (!file.exists()) {
                    file.createNewFile();
                    flag = 1;
                }

                // true = append file
                fw = new FileWriter(file.getAbsoluteFile());
                bw = new BufferedWriter(fw);
                System.out.println(workingTextArea.getText());
               // bw.write(workingTextArea.getText());
                writetofilewithnextline(titl,workingTextArea.getText().split("\\n"));
                System.out.println("text area split by new line");
                for (String line : workingTextArea.getText().split("\\n"))
                {
                    System.out.println(line);
                }
                System.out.println("Saved");

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

// writetofilewithnextline ---> written on 6th oct
    public void writetofilewithnextline(String filename , String arr[])
    {
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {



            File file = new File(filename);

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            // true = append file
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
           for(int f=0;f<arr.length;f++)
           {

               bw.write(arr[f]);
               bw.newLine();

           }

            System.out.println("Done");

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
    @FXML
    public void of() {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainBorderPane.getScene().getWindow());
        dialog.setTitle("Enter the filename to open");
        //dialog.setHeaderText("Use this dialog to create a new todo item");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("openfl.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());

        } catch (IOException e) {
            System.out.println("Couldn't load the dialog");
            e.printStackTrace();
            return;
        }
        DialogController controller = fxmlLoader.getController();
        controller.setlistview();

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);
        Optional<ButtonType> result = dialog.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {

            //bug fixing on opening consecutive file text is getting appended so
            workingTextArea.setText("");

            String opnflname = controller.getitm().substring(1, controller.getitm().length() - 1);

            Main.getStage().setTitle(opnflname);
            BufferedReader br = null;
            FileReader fr = null;
            String sCurrentLine = null;

            String buffer = null;
            try {

                fr = new FileReader(opnflname);
                br = new BufferedReader(fr);


                br = new BufferedReader(new FileReader(opnflname));

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                    workingTextArea.appendText(sCurrentLine);
                    workingTextArea.appendText("\n");
                    System.out.println("opened");

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


    }

    @FXML
    public void opnfile() {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainBorderPane.getScene().getWindow());
        dialog.setTitle("Enter the filename to open");
        //dialog.setHeaderText("Use this dialog to create a new todo item");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("openf.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());

        } catch (IOException e) {
            System.out.println("Couldn't load the dialog");
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            DialogController controller = fxmlLoader.getController();
            String opnflname = controller.opnfilename();
            Main.getStage().setTitle(opnflname);
            BufferedReader br = null;
            FileReader fr = null;
            String sCurrentLine = null;

            String buffer = null;
            try {

                fr = new FileReader(opnflname);
                br = new BufferedReader(fr);


                br = new BufferedReader(new FileReader(opnflname));

                while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
                    workingTextArea.appendText(sCurrentLine);
                    workingTextArea.appendText("\n");
                    System.out.println("opened");

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

    }

    public void newfile() throws IOException {
        //fixed the bug when nothing is in there textarea no need to open new file.
        if (!(workingTextArea.getText().isEmpty())) {
            String titl = Main.getStage().getTitle();

            savefile();
            workingTextArea.setText("    ");
            Main.getStage().setTitle("Untitled");

        }
    }

    @FXML
    public void handleExit() {
        Platform.exit();

    }

    @FXML
    public void finder() {
//for clearing the content in arraylist when user input new string

        al.clear();

        // System.out.println("hello");
        // System.out.println(tf.getText());
        String original = workingTextArea.getText();
        sub = tf.getText().toLowerCase();
        String root = workingTextArea.getText().toLowerCase();
        System.out.println(root);

        int index1 = root.indexOf(sub);
        al.add(index1);
        //   System.out.println(index1);
        //earlier it was index1>0 was causing issue as it will not return very first starting substring of root if sub equals that.
        while ((index1 < root.length() - 1) && (index1 >= 0)) {
            index1 = root.indexOf(sub, index1 + 1);
            al.add(index1);
            //  System.out.println(index1);

        }
        occur = al.size() - 2;
        for (int f = al.size() - 2; f > -1; f--) {
            System.out.println(al.get(f));
            System.out.println(root.substring(al.get(f), al.get(f) + sub.length()));
            workingTextArea.setStyle(" -fx-highlight-fill: lightgray; -fx-font: Verdana;-fx-font-weight: SEMI_BOLD ; -fx-highlight-text-fill: black; ");
            workingTextArea.selectRange(al.get(f), al.get(f) + sub.length());


        }
    }
    @FXML
    public void next() {
        if (occur >= 1) {
            // workingTextArea.setStyle("-fx-highlight-fill: lightgray; -fx-highlight-text-fill: firebrick; ");
            // workingTextArea.selectRange(al.get(),al.get(f)+ sub.length());
            System.out.println(occur);
            occur--;
            //setting the style of workingtextarea
            workingTextArea.setStyle(" -fx-highlight-fill: lightgray; -fx-font: Verdana;-fx-font-weight: SEMI_BOLD ; -fx-highlight-text-fill: black; ");
            workingTextArea.selectRange(al.get(al.size() - 2 - occur), al.get(al.size() - 2 - occur) + sub.length());

        } else if (occur < 1) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Search results");
            alert.setHeaderText("Search results");
            alert.setContentText("You have reached end of document" + "\n" + "No of occurences of string :" + sub + " in file is " + (al.size() - 1));
            // clearing the textfield once search is done
            tf.clear();

            alert.showAndWait();

        }


    }
    @FXML
    public void handl(MouseEvent mouseEvent) {
        x1 = mouseEvent.getX();
        y1 = mouseEvent.getY();
        //suggestioncontroller sc = new suggestioncontroller();
        //  sc.handle(mouseEvent);
    }
    @FXML
    public void suggestion(KeyEvent keyEvent) throws IOException {
        System.out.println("starting" + workingTextArea.getCaretPosition());

        // suggestionlist.getItems().removeAll();

        String content = workingTextArea.getText().substring(0, workingTextArea.getCaretPosition());
        //System.out.println(workingTextArea.getText().substring(0,workingTextArea.getCaretPosition()));


        String[] temp = content.split(" ");

        int zx =temp.length;
        System.out.println("length of buffer"+zx);
        if (temp.length >= 1) {
            System.out.println("inside key assigning area");
            key = temp[temp.length - 1];
            System.out.println(key);
            System.out.println(key.length());

        }


        // System.out.println(workingTextArea.getCaretPosition()-key.length()-2 );
        //System.out.println(workingTextArea.getCaretPosition()-1);
        //working to get the start and end index of key and replace it with suggestion.
       /*if(workingTextArea.getCaretPosition()>=0)

       {
           //for very initial position
           if(workingTextArea.getCaretPosition()-key.length()>=0)
           {  System.out.println(workingTextArea.getText(workingTextArea.getCaretPosition()-key.length(),workingTextArea.getCaretPosition())); }

       }*/
        // System.out.println(workingTextArea.getText(11,14));
        suggestionlist.getItems().clear();
        rec.clear();
        recmem.clear();
        if(key.charAt(0)<=90&&key.charAt(0)>=65)
        {
            flagCase=1;
            System.out.println("no need to change");
        }
        else
        if(key.charAt(0)<=122&&key.charAt(0)>=97)
        {
            System.out.println("need to change");
            flagCase=0;
        }
        // Set<String> rec = new LinkedHashSet<>();
        // Set<String> recmem = new LinkedHashSet<>();
        Htmlsuggestion hs = new Htmlsuggestion();
        Memorysuggestion ms = new Memorysuggestion();
        /*was facing issue when enter key was pressed as whole stringg
                was getting passed to function like
                En    (when enter key is pressed )
                ter
                        extracted the last word with the help of splitter on the basis of
                "\n"*/
        String [] enterkey = key.split("\n");


        key = enterkey[(enterkey.length)-1];
        String first = String.valueOf(key.charAt(0));
        key = first.toUpperCase() + key.substring(1).toLowerCase();

        System.out.println("changed value" + key);
        System.out.println("break");

        rec = hs.words(key);

        recmem = ms.memwords(key);
        for (String tempq: recmem)
        {
            System.out.println("from recmm"+tempq);
        }
        if(recmem.size()>=5)
        {

            Iterator<String> ism = recmem.iterator();
            //implemented the style of list suggestions
            suggestionlist.setStyle("-fx-font-weight : BOLD ; -fx-text-fill: black; -fx-font :Comic Sans MS");

            int i = 0;
            while (ism.hasNext() && i < 5) {
                i++;
                // System.out.println(is.next());
                String grtfiv = ism.next();

                if(flagCase==0)
                {
                    grtfiv = String.valueOf(grtfiv.charAt(0)).toLowerCase()+grtfiv.substring(1);
                    suggestionlist.getItems().add(grtfiv);
                }
                else
                {
                    suggestionlist.getItems().add(grtfiv);
                }
                // suggestionlist.getItems().add(ism.next());
            }
            //  suggestionlist.getItems().removeAll();
            temp2 = key;
        }

        else
        {
            Iterator<String> ismm = recmem.iterator();
            //implemented the style of list suggestions
            suggestionlist.setStyle("-fx-font-weight : BOLD ; -fx-text-fill: black;-fx-font :Comic Sans MS ");

            int i = 0;
            while (ismm.hasNext() && i < 5) {
                i++;
                String grtfiv = ismm.next();

                if(flagCase==0)
                {
                    grtfiv = String.valueOf(grtfiv.charAt(0)).toLowerCase()+grtfiv.substring(1);
                    suggestionlist.getItems().add(grtfiv);
                }
                else
                {
                    suggestionlist.getItems().add(grtfiv);
                }
                //  System.out.println(ismm.next()+"from real assigning");
                // suggestionlist.getItems().add(ismm.next());
            }
            //  suggestionlist.getItems().removeAll();
            temp2 = key;
            // Set<String> left = new LinkedHashSet<>();
            rec.removeAll(recmem);
            Iterator<String> is = rec.iterator();
            //implemented the style of list suggestions
            suggestionlist.setStyle("-fx-font-weight : BOLD ; -fx-text-fill: black; -fx-font :Comic Sans MS");

            // int i = 0;
            while (is.hasNext() && i < 5) {
                i++;
                String grtfiv = is.next();

                if(flagCase==0)
                {
                    grtfiv = String.valueOf(grtfiv.charAt(0)).toLowerCase()+grtfiv.substring(1);
                    suggestionlist.getItems().add(grtfiv);
                }
                else
                {
                    suggestionlist.getItems().add(grtfiv);
                }
                // System.out.println(is.next());
                //suggestionlist.getItems().add(is.next());
            }
            //  suggestionlist.getItems().removeAll();
            temp2 = key;

        }
       /* suggestionlist.getItems().add(key);
        suggestionlist.getItems().add("king");
        suggestionlist.getItems().add("queen");
        suggestionlist.getItems().add("prince");*/

        // suggestionlist.getItems().add("princess");


        //  ObservableList selectedIndices1 = suggestionlist.getSelectionModel().getSelectedIndices();
        // ObservableList d1 = suggestionlist.getSelectionModel().getSelectedItems();
        //System.out.println(d1.toString());

        //    suggestionlist.getItems().removeAll();
        // Button btn = (Button)actionEvent.getSource();

        // Point2D point = btn.localToScreen(0.0d + btn.getWidth(), 0.0d - btn.getHeight());
        //suggestioncontroller sc = new suggestioncontroller();
        //sc.showEmployeesHelper(actionEvent,workingTextArea,x1,y1);
        // sc.handle(mouseEvent);

/*
        String [] s = workingTextArea.getText().split(" ");


        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainBorderPane.getScene().getWindow());
        dialog.setTitle("Enter the filename to open");
        //dialog.setHeaderText("Use this dialog to create a new todo item");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("savefile.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());

        } catch(IOException e) {
            System.out.println("Couldn't load the dialog");
            e.printStackTrace();
            return;
        }



        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();

        //System.out.println("textfield changed from " + oldValue + " to " + newValue);
        System.out.println(s[s.length- 1]);
       // System.out.println(workingTextArea.getText());

*/
    }

    @FXML
    public void change() {



        suggestionlist.getSelectionModel().selectedItemProperty()
                .addListener(new ChangeListener<String>() {

                    public void changed(
                            ObservableValue<? extends String> observable,
                            String oldValue, String newValue) {
                        // change the label text value to the newly selected
                        // ite
                        //   System.out.println(newValue);
                        fin = newValue;
                        /*System.out.println("hohhhaha");
                        System.out.println(key);
                        System.out.println(fin);
                        if(key.charAt(0)>=97&&key.charAt(0)<=122)
                        {
                            System.out.println("need to convert");
                        }
                        System.out.println("hohhaa");*/
                        // transfer =fin;
                        /*Memorysuggestion ms = new Memorysuggestion();
                        ms.setmemory(fin);*/
                        /*if(flagCase==1)

                        {

                            String second = String.valueOf(fin.charAt(0));
                            fin = second.toUpperCase() + fin.substring(1);
                        }
                        else if(flagCase==0)
                        {
                            String third = String.valueOf(fin.charAt(0));
                            fin = third.toLowerCase() + fin.substring(1);

                        }*/
                    }
                });
        //  String tempchange = workingTextArea.getText(0,workingTextArea.getCaretPosition()-key.length()) +" "+fin+" ";
        //  workingTextArea.clear();
        //  workingTextArea.appendText(tempchange);
/*
        System.out.println("hohhhaha");
        System.out.println(key);*/
        System.out.println(fin);

        /*if(key!=null) {
            if (key.charAt(0) >= 97 && key.charAt(0) <= 122) {
                System.out.println("need to convert");
            }
        }*/
        System.out.println("hohhaa");

        String pre = "";
        if (workingTextArea.getCaretPosition() >= 0 && fin != null)

        {
            Memorysuggestion ms1 = new Memorysuggestion();
            ms1.setmemory(fin);
            /*if(flagCase==1)
            {

                String first = String.valueOf(fin.charAt(0));
                fin = first.toUpperCase() + fin.substring(1);
            }
            else if(flagCase==0)
            {
                String first = String.valueOf(fin.charAt(0));
                fin = first.toLowerCase() + fin.substring(1);

            }*/

            System.out.println("from assigning area");
            // workingTextArea.clear();
            String fg = workingTextArea.getText();
            //for very initial position
            if (workingTextArea.getCaretPosition() - key.length() >= 0) {
                pre = workingTextArea.getText(0, workingTextArea.getCaretPosition() - key.length())+ fin + fg.substring(workingTextArea.getCaretPosition());
                 System.out.println(pre);
            }
            workingTextArea.clear();
            workingTextArea.setText(pre);
            suggestionlist.getItems().clear();
             workingTextArea.positionCaret(workingTextArea.getLength());
            //passing the used word to memory


        }

    }


    public void replaceall()
    {
        String con = workingTextArea.getText();
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainBorderPane.getScene().getWindow());
        dialog.setTitle("Replace String");
        //dialog.setHeaderText("Use this dialog to create a new todo item");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("replace.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());

        } catch (IOException e) {
            System.out.println("Couldn't load the dialog");
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            DialogController controller = fxmlLoader.getController();

            System.out.println(controller.getstrings());
            String recv [] = controller.getstrings().split(" ");

            System.out.println(recv[0]+recv[1]);
            String replaced =   con.replace(recv[0],recv[1]);
            System.out.println(replaced);
            workingTextArea.clear();
            workingTextArea.setText(replaced);

        }

    }
    @FXML
    public  void username()
    {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainBorderPane.getScene().getWindow());
        dialog.setTitle("Give a name");
        //dialog.setHeaderText("Use this dialog to create a new todo item");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("username.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());

        } catch (IOException e) {
            System.out.println("Couldn't load the dialog");
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            DialogController controller = fxmlLoader.getController();

            username = controller.getname();
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {


                File file = new File("username.txt");

                // if file doesnt exists, then create it


                // true = append file
                fw = new FileWriter(file.getAbsoluteFile());
                bw = new BufferedWriter(fw);
                //current string is replacing the previously stored one
                bw.write(username);


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
// by ram prakash singh
    }
}

