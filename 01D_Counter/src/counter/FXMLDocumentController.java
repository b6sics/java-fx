package counter;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author KjG
 */
public class FXMLDocumentController implements Initializable {

    private int left = 0;
    private int right = 0;

    @FXML
    private Label lbLeft;

    @FXML
    private Label lblRight;

    @FXML
    void handleButtonAction1(ActionEvent event) {
        left++;
        lbLeft.setText("" + left);
    }

    @FXML
    void handleButtonAction2(ActionEvent event) {
        right++;
        lblRight.setText("" + right);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
