package labels;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author KjG
 */
public class FXMLLabelsController implements Initializable {

    @FXML
    void bezar(MouseEvent event) {
        Platform.exit();
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
