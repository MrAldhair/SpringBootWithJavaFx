package PSGV.Controllers;

import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerPrincipal implements Initializable {

    public Label lblTitle;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        this.lblTitle.setText("Hello World");

    }

}
