
package com.company.controller;

import Configurations.DataAndHour;
import Configurations.LoadImage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;


public class EmpleadoController implements Initializable{

    @FXML private Label lblTitle;
    @FXML private Label lblDescription;
    @FXML private TextField txtDate;
    @FXML private ImageView imageMain;
    @FXML private TableView<?> tbSales;
    @FXML private Button btnFilter;
    @FXML private ComboBox<?> cbFilter;
    @FXML private Button btnNewSale;
    @FXML private Button btnSignOutEmployee;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        DataAndHour.dateAndHour(this.txtDate);
        
        LoadImage.loadImageMain(this.imageMain);
        
    }

    @FXML private void newSale(ActionEvent event) {
        
        Object ev = event.getSource();
        
        if(ev.equals(this.btnNewSale)){ 
        
            try {
            
            App.setRoot("VistaNuevaVenta");
            
            } catch (IOException e) {

                System.out.println("Error: " + e.getMessage());

            }
        
        }
 
    }

    @FXML private void signOutEmployee(ActionEvent event) {
        
        Object ev = event.getSource();
        
        if(ev.equals(this.btnSignOutEmployee)){
        
            try {
            
            App.setRoot("VistaPrincipal");

            } catch (IOException e) {

                System.out.println("Error: " + e.getMessage());

            }
            
        }
        
    }
   
}