/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03f1headsortails;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author b6dmin
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private ImageView ivErme;

    @FXML
    private Button btnFej;

    @FXML
    private Button btnIras;

    @FXML
    private Label lblResult;

    private final Image kep1 = new Image("euro_fej.gif");
    private final Image kep2 = new Image("euro_iras.gif");

    private void feldob(boolean tipp) {
        double r = Math.random();
        boolean result;
        if (r < 0.5) {
            result = true;
            ivErme.setImage(kep1);
        } else {
            result = false;
            ivErme.setImage(kep2);
        }
        if (tipp == result) {
            lblResult.setText("Nyertél");
        } else {
            lblResult.setText("vesztettél");
        }
    }

    @FXML
    void handleBtnFejAction(ActionEvent event) {
        feldob(true);
    }

    @FXML
    void handleBtnIrasAction(ActionEvent event) {
        feldob(false);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
