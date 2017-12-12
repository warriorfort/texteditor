package sample;

/**
 * Created by Ram on 25-07-2017.
 */
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Bounds;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Path;
import javafx.stage.Popup;
import javafx.stage.Window;

/**
 * JavaFX Controller for main view
 *
 * @author carlwalker
 *
 */
public class suggestioncontroller {
    public Double a;
    public Double b;





    public void showEmployeesHelper(ActionEvent evt,TextArea ta ,Double x1,Double y1) {

        Button btn = (Button)evt.getSource();

        Point2D point = btn.localToScreen(0.0d + btn.getWidth(), 0.0d - btn.getHeight());


        try {
            suggestionpopup employeesHelper = new suggestionpopup(ta,point);
            //Path caret = findCaret(workingTextArea);
          //  Point2D screenLoc = findScreenLocation(caret);
          //  Popup employeesHelper = new suggestionpopup();
           // employeesHelper.show(workingTextArea, screenLoc.getX(), screenLoc.getY() + 20);
          employeesHelper.show(btn.getScene().getWindow());


        } catch(Exception exc) {
            exc.printStackTrace();
            Alert alert = new Alert(AlertType.ERROR, "Error creating employees popup; exiting");
            alert.showAndWait();
            btn.getScene().getWindow().hide();  // close and implicit exit
        }
    }

    private Path findCaret(Parent parent) {
        // Warning: this is an ENORMOUS HACK
        for (Node n : parent.getChildrenUnmodifiable()) {
            if (n instanceof Path) {
                return (Path) n;
            } else if (n instanceof Parent) {
                Path p = findCaret((Parent) n);
                if (p != null) {
                    return p;
                }
            }
        }
        return null;
    }

    private Point2D findScreenLocation(Node node) {
        double x = 0;
        double y = 0;
        for (Node n = node; n != null; n=n.getParent()) {
            Bounds parentBounds = n.getBoundsInParent();
            x += parentBounds.getMinX();
            y += parentBounds.getMinY();
        }
        Scene scene = node.getScene();
        x += scene.getX();
        y += scene.getY();
        Window window = scene.getWindow();
        x += window.getX();
        y += window.getY();
        Point2D screenLoc = new Point2D(x, y);
        return screenLoc;
    }





}

