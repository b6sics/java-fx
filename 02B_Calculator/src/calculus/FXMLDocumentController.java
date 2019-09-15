package calculus;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author t1
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label lblBrutto;

    @FXML
    private TextField txtBrutto;

    @FXML
    private CheckBox chkFiatal;

    @FXML
    private RadioButton rb0;

    @FXML
    private RadioButton rb1;

    @FXML
    private RadioButton rb2;

    @FXML
    private ToggleGroup gyerekCsoport;

    @FXML
    private TextField txtLevon;

    @FXML
    private TextField txtNetto;

    @FXML
    void exitAction() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Kilépés");
        alert.setHeaderText(null);
        alert.setContentText("Biztosan ki szeretnél lépni?");
        ButtonType btIgen = new ButtonType("Igen", ButtonBar.ButtonData.YES);
        ButtonType btNem = new ButtonType("Nem", ButtonBar.ButtonData.NO);
        alert.getButtonTypes().setAll(btIgen, btNem);
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == btIgen) {
            Platform.exit();
        }
    }

    @FXML
    void calcAction() {
        try {
            int brutto = Integer.parseInt(txtBrutto.getText());
            int levonas = (int) Math.round((0.15 + 0.17) * brutto);
            if (chkFiatal.isSelected()) {
                levonas -= 5000;
            }
            if (rb1.isSelected()) {
                levonas -= 10000;
            } else if (rb2.isSelected()) {
                levonas -= 35000;
            }
            if (levonas < 0) {
                levonas = 0;
            }
            levonas += (int) Math.round(0.015 * brutto);
            txtLevon.setText("" + levonas);
            txtNetto.setText("" + (brutto - levonas));
        } catch (NumberFormatException nfe) {
            txtLevon.setText("Hibás adat!");
            txtNetto.setText("Hibás adat!");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        calcAction();
    }

}
