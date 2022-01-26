/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.calculadormaven;

import java.awt.Button;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;


/**
 * FXML Controller class
 *
 * @author Javier
 */
public class CalculadoraController implements Initializable {

    
    @FXML
    private Button button0;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private Button buttonBorrar;

    @FXML
    private Button buttonDiv;

    @FXML
    private Button buttonIgual;

    @FXML
    private Button buttonMas;

    @FXML
    private Button buttonMasMenos;

    @FXML
    private Button buttonMenos;

    @FXML
    private Button buttonPor;

    @FXML
    private Button buttonPunt;

    @FXML
    private Label labelResultado;

    @FXML
    private BorderPane root;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
    }    
    
    public CalculadoraController () throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Calculadora.fxml"));
        
        loader.setController(this);
        loader.load();        
        
    }
    
    public BorderPane getVista (){
        return root;
    }
    
}
