/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3a_sleep;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 *
 * @author t1
 */
public class FXMLDocumentController implements Initializable {

    private int hossz = 465;

    private String nulla(int n) {
        if (n < 10) {
            return "0" + n;
        }
        return "" + n;
    }

    public void setHossz(int hossz) {
        this.hossz = hossz;
    }

    @FXML
    private ComboBox<String> cbxLeOra;

    @FXML
    private ComboBox<String> cbxLePerc;

    @FXML
    private Label lblKeljFel;

    @FXML
    private ComboBox<String> cbxFelOra;

    @FXML
    private ComboBox<String> cbxFelPerc;

    @FXML
    private Label lblFekudjLe;

    @FXML
    private ComboBox<String> cbxElalvas;

    @FXML
    void felkel(ActionEvent event) {
        int ora = Integer.parseInt(cbxLeOra.getValue());
        int perc = Integer.parseInt(cbxLePerc.getValue());
        int ido = ora * 60 + perc + hossz;
        if (ido > 24 * 60) {
            ido -= 24 * 60;
        }
        lblKeljFel.setText("Kelj fel " + ido / 60 + ":" + nulla(ido % 60) + "-kor!");
    }

    @FXML
    void lefekszik(ActionEvent event) {
        int ora = Integer.parseInt(cbxFelOra.getValue());
        int perc = Integer.parseInt(cbxFelPerc.getValue());
        int ido = ora * 60 + perc - hossz;
        if (ido < 0) {
            ido += 24 * 60;
        }
        lblFekudjLe.setText("Feküdj le " + ido / 60 + ":" + nulla(ido % 60) + "-kor!");
    }

    @FXML
    void elalszik(ActionEvent event) {
        hossz = 5 * 90 + Integer.parseInt(cbxElalvas.getValue());
        felkel(event);
        lefekszik(event);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cbxLeOra.getItems().addAll("07", "08", "09", "10", "11", "12",
                "13", "14", "15", "16", "17", "18",
                "19", "20", "21", "22", "23", "24",
                "01", "02", "03", "04", "05", "06");
        cbxLeOra.setValue("22");
        cbxLePerc.getItems().addAll("00", "05", "10", "15", "20", "25",
                "30", "35", "40", "45", "50", "55");
        cbxLePerc.setValue("45");
        cbxFelOra.getItems().addAll("01", "02", "03", "04", "05", "06",
                "07", "08", "09", "10", "11", "12",
                "13", "14", "15", "16", "17", "18",
                "19", "20", "21", "22", "23", "24");
        cbxFelOra.setValue("06");
        cbxFelPerc.getItems().addAll("00", "05", "10", "15", "20", "25",
                "30", "35", "40", "45", "50", "55");
        cbxFelPerc.setValue("30");
        cbxElalvas.getItems().addAll("05", "10", "15", "20", "25", "30");
        cbxElalvas.setValue("15");
    }

}
