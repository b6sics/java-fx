package zaszlo;

import java.net.URL;
import java.util.Optional;
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
 * @author Joe
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private StackPane spPiros;

    @FXML
    private StackPane spFeher;

    @FXML
    private StackPane spZold;

    @FXML
    void feherAction() {
        if (spFeher.getStyle().equals("-fx-background-color: white"))
            spFeher.setStyle("-fx-background-color: #f4f4f4");
        else
            spFeher.setStyle("-fx-background-color: white");
    }

    @FXML
    void pirosAction() {
        if (spPiros.getStyle().equals("-fx-background-color: red"))
            spPiros.setStyle("-fx-background-color: #f4f4f4");
        else
            spPiros.setStyle("-fx-background-color: red");
    }

    @FXML
    void zoldAction() {
        if (spZold.getStyle().equals("-fx-background-color: green"))
            spZold.setStyle("-fx-background-color: #f4f4f4");
        else
            spZold.setStyle("-fx-background-color: green");
    }

    @FXML
    void mindAction() {
        feherAction();
        pirosAction();
        zoldAction();
    }

    @FXML
    void nevjegyAction() {
        Alert info = new Alert(AlertType.INFORMATION);
        info.setTitle("Névjegy");
        info.setHeaderText(null);
        info.setContentText("Zászló program\nKészítette: Csipke Józsika");
        info.showAndWait();
    }
    
    @FXML
    void kilepAction() {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Kilépés");
        alert.setHeaderText(null);
        alert.setContentText("Biztosan ki szeretnél lépni?");
        ButtonType btIgen = new ButtonType("Igen", ButtonData.YES);
        ButtonType btNem = new ButtonType("Nem", ButtonData.NO);
        alert.getButtonTypes().setAll(btIgen, btNem);
        if (alert.showAndWait().get() == btIgen)
            Platform.exit();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
