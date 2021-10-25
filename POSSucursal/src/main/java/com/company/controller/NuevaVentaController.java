
package com.company.controller;

import Configurations.DataAndHour;
import Configurations.LoadImage;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class NuevaVentaController implements Initializable{

    @FXML private Label lblTitle;
    @FXML private Label lblDescription;
    @FXML private Button btnGenerateSale;
    @FXML private TextField txtDate;
    @FXML private ImageView imageMain;
    @FXML private TextField txtTotal;
    @FXML private Button btnReturnEmployeeSale;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");// 
        LocalDateTime now = LocalDateTime.now();
        this.txtDate.setText(dtf.format(now));
        
        LoadImage.loadImageMain(this.imageMain);
        
    }

    @FXML 
    private void generateSale(ActionEvent event) {
         
        Object ev = event.getSource();
        
        if(ev.equals(this.btnGenerateSale)){
        
            try {
                
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Alerta de nueva venta");
                alert.setContentText("¡Nueva venta registrada con exito!");
                alert.setHeaderText(null);
                alert.showAndWait();
                
            } catch (Exception e) {

                System.out.println("Error:" + e.getMessage());

            }
        
        }

    }

    @FXML 
    private void switchToEmployee(ActionEvent event) { 
        
        Object ev = event.getSource();
        
        if(ev.equals(this.btnReturnEmployeeSale)) {
        
            try {
            
            App.setRoot("VistaEmpleado");
            
            } catch (IOException e) {

                System.out.println("Error: " + e.getMessage());

            }
        
        }
        
    }

}
