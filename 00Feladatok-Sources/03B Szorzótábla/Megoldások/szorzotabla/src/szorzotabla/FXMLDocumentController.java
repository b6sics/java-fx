package szorzotabla;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author tothj
 */
public class FXMLDocumentController implements Initializable {
    
    private int eredmeny;
    private int pont = 0;
    
    private void feladat() {
        Random vg = new Random();
        int x = vg.nextInt(19)+2;
        int y = vg.nextInt(19)+2;
        eredmeny = x*y;
        lblFeladat.setText(x + " x " + y + " =");
    }
    
    private void pontki() {
        lblPont.setText("Pont: " + pont);
    }

    @FXML
    private Label lblFeladat;

    @FXML
    private Label lblHelyes;
    
    @FXML
    private TextField txtMegoldas;

    @FXML
    private Button btnKesz;

    @FXML
    private Label lblPont;

    @FXML
    void gomb() {
        if (btnKesz.getText().equals("Kész")) {
            try {
                int megoldas = Integer.parseInt(txtMegoldas.getText());
                if (megoldas == eredmeny) {
                    txtMegoldas.setStyle("-fx-text-fill: green");
                    lblHelyes.setText("Helyes!");
                    pont++;
                } else {
                    txtMegoldas.setStyle("-fx-text-fill: red");
                    lblHelyes.setText("Hibás!");
                    pont--;
                }
                pontki();
                txtMegoldas.setEditable(false);
                btnKesz.setText("Tovább");
            } catch (NumberFormatException ex) {
                txtMegoldas.requestFocus();
            }
        } else {
            feladat();
            txtMegoldas.clear();
            txtMegoldas.setEditable(true);
            txtMegoldas.setStyle("-fx-text-fill: black");
            txtMegoldas.requestFocus();
            btnKesz.setText("Kész");
            lblHelyes.setText("");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        feladat();
        pontki();
    }    
    
}
