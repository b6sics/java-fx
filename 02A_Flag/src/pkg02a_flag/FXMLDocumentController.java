/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02a_flag;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.StackPane;

/**
 *
 * @author t1
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private StackPane spRed;

    @FXML
    private StackPane spWhite;

    @FXML
    private StackPane spGreen;

    @FXML
    void whiteAction() {
        if (spWhite.getStyle().equals("-fx-background-color: white")) {
            spWhite.setStyle("-fx-background-color: #f4f4f4");
        } else {
            spWhite.setStyle("-fx-background-color: white");
        }
    }

    @FXML
    void redAction() {
        if (spRed.getStyle().equals("-fx-background-color: red")) {
            spRed.setStyle("-fx-background-color: #f4f4f4");
        } else {
            spRed.setStyle("-fx-background-color: red");
        }
    }

    @FXML
    void greenAction() {
        if (spGreen.getStyle().equals("-fx-background-color: green")) {
            spGreen.setStyle("-fx-background-color: #f4f4f4");
        } else {
            spGreen.setStyle("-fx-background-color: green");
        }
    }

    @FXML
    void allAction() {
        whiteAction();
        redAction();
        greenAction();
    }

    @FXML
    void helpAction() {
        Alert info = new Alert(AlertType.INFORMATION);
        info.setTitle("Névjegy");
        info.setHeaderText(null);
        info.setContentText("Zászló program\nKészítette: Csipike Rose");
        info.showAndWait();
    }

    @FXML
    void exitAction() {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Kilépés");
        alert.setHeaderText(null);
        alert.setContentText("Biztosan ki szeretnél lépni?");
        ButtonType btIgen = new ButtonType("Igen", ButtonData.YES);
        ButtonType btNem = new ButtonType("Nem", ButtonData.NO);
        alert.getButtonTypes().setAll(btIgen, btNem);
        if (alert.showAndWait().get() == btIgen) {
            Platform.exit();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
