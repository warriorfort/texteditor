package sample;

/**
 * Created by Ram on 25-07-2017.
 */

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Point2D;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.Popup;
/*
 * Copyright 2015 Bekwam, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Point2D;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Popup;
import javafx.util.Duration;

/**
 * Popup subclass for Employees Popup
 *
 * @author carlwalker
 *
 */
public class suggestionpopup extends Popup {
    double a ;
    double b;

    public suggestionpopup(TextArea tfTarget, Point2D position) throws Exception{

         final Reference<TextArea> tfTargetRef = new SoftReference<TextArea>(tfTarget);


      //  FXMLLoader fxmlLoader = new FXMLLoader(ListViewHelperApp.class.getResource("/ss/ListViewHelperEmployees.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("suggestion.fxml"));

        Parent content = fxmlLoader.load();

        Suggester controller = fxmlLoader.getController();

        controller.lvEmployees.getSelectionModel().selectedItemProperty().addListener((obs, oldValue, newValue) -> {

            if( newValue != null ) {

               // tfTargetRef.get().setText(newValue);

                System.out.println(newValue);
               String d= (String) tfTarget.getText();
               String [] temp = d.split(" ");
               String fnl ="";
               for(int c=0;c<temp.length -1 ;c++)
               {
                   fnl= fnl+" "+temp[c];
               }
               fnl = fnl +" "+(String) newValue ;
               tfTarget.setText(fnl);

              // workingTextArea.setText(fnl);


                // no delay -- and no feedback
                suggestionpopup.this.hide();

                // slight delay + gentle fade -- maintains highlight
                 /*       Duration duration = new Duration( 300 );

                        KeyValue kvOpacity = new KeyValue(content.opacityProperty(), 0);

                        KeyFrame atEndFrame = new KeyFrame(
                                duration,
                                (evt) -> ListViewHelperEmployeesPopup.this.hide(),
                                kvOpacity
                        );

                        Timeline timeline = new Timeline();
                        timeline.getKeyFrames().add( atEndFrame );
                        timeline.play();
                        */
            }

        });

       // suggestioncontroller lvhmc  = new suggestioncontroller();
        setX(position.getX());
        //setX(659.0000050067902);
        setY( position.getY() );

        System.out.println(position.getX());
        System.out.println(position.getY());

        setAutoHide(true);
        getContent().add( content );
    }


    public Double handle(MouseEvent event) {
        String msg =
                "(x: "       + event.getX()      + ", y: "       + event.getY()       + ") -- " +
                        "(sceneX: "  + event.getSceneX() + ", sceneY: "  + event.getSceneY()  + ") -- " +
                        "(screenX: " + event.getScreenX()+ ", screenY: " + event.getScreenY() + ")";
        System.out.println(msg);
        this.a = event.getX();
        this.b = event.getY();

        return a;

        //reporter.setText(msg);
    }

}
