/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03c_dates;

import java.net.URL;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

/**
 *
 * @author b6dmin
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private DatePicker dpMettol;

    @FXML
    private Button btnMaTol;

    @FXML
    private Button btnMaig;

    @FXML
    private DatePicker dpMeddig;

    @FXML
    private Label lblEvek;

    @FXML
    private Label lblHonapok;

    @FXML
    private Label lblNapok;

    @FXML
    void maig(ActionEvent event) {
        dpMeddig.setValue(LocalDate.now());
    }

    @FXML
    void matol(ActionEvent event) {
        dpMettol.setValue(LocalDate.now());
    }

    @FXML
    void szamol() {
        LocalDate eleje = dpMettol.getValue();
        LocalDate vege = dpMeddig.getValue();
        long evek = ChronoUnit.YEARS.between(eleje, vege);
        long honapok = ChronoUnit.MONTHS.between(eleje, vege);
        long napok = ChronoUnit.DAYS.between(eleje, vege);
        lblNapok.setText(napok + " nap");
        lblHonapok.setText(honapok + " hónap");
        lblEvek.setText(evek + " év");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        dpMettol.setValue(LocalDate.of(1989, 9, 1));
        dpMeddig.setValue(LocalDate.now());
        szamol();
    }

}
