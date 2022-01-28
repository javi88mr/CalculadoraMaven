/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.calculadormaven;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
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

    //modelo
    private double operando1, operando2;
    private Operaciones operacion=Operaciones.VACIO;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
    }    
    
    public CalculadoraController () throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Calculadora.fxml"));
        
        loader.setController(this);
        loader.load();


        
    }

    @FXML
    void on0ButtonActon(ActionEvent event) {
        labelResultado.setText(labelResultado.getText() + "0");
    }

    @FXML
    void on1ButtonActon(ActionEvent event) {
        labelResultado.setText(labelResultado.getText() + "1");
    }

    @FXML
    void on2ButtonActon(ActionEvent event) {
        labelResultado.setText(labelResultado.getText() + "2");
    }

    @FXML
    void on3ButtonActon(ActionEvent event) {
        labelResultado.setText(labelResultado.getText() + "3");
    }

    @FXML
    void on4ButtonActon(ActionEvent event) {
        labelResultado.setText(labelResultado.getText() + "4");
    }

    @FXML
    void on5ButtonActon(ActionEvent event) {
        labelResultado.setText(labelResultado.getText() + "5");
    }

    @FXML
    void on6ButtonActon(ActionEvent event) {
        labelResultado.setText(labelResultado.getText() + "6");
    }

    @FXML
    void on7ButtonActon(ActionEvent event) {
        labelResultado.setText(labelResultado.getText() + "7");
    }

    @FXML
    void on8ButtonActon(ActionEvent event) {
        labelResultado.setText(labelResultado.getText() + "8");
    }

    @FXML
    void on9ButtonActon(ActionEvent event) {
        labelResultado.setText(labelResultado.getText() + "9");
    }

    @FXML
    void onCButtonAction(ActionEvent event) {
        labelResultado.setText("");
        operando1 = 0;
        operando2 = 0;
        operacion = Operaciones.VACIO;
    }

    @FXML
    void onCambioSignoButtonActon(ActionEvent event) {
        labelResultado.setText("-"+labelResultado.getText() );
    }
//
    @FXML
    void onDivButtonAction(ActionEvent event) {
        if(operacion!=Operaciones.VACIO){
            operando2 = Double.parseDouble(labelResultado.getText());
            operando1=realizarOperacion();
            labelResultado.setText(String.valueOf(operando1));
            System.out.println(operando1);
        }
        else{
            operando1=Double.parseDouble(labelResultado.getText());


        }
        labelResultado.setText("");
        operacion=Operaciones.DIVISION;
    }



    @FXML
    void onIgualButtonActon(ActionEvent event) {

    }

    @FXML
    void onMasButtonActon(ActionEvent event) {

    }

    @FXML
    void onMenosButtonActon(ActionEvent event) {

    }

    @FXML
    void onPorButtonActon(ActionEvent event) {

    }

    @FXML
    void onPuntoButtonActon(ActionEvent event) {

    }
    private double realizarOperacion() {
        double resultado=0;
        switch(operacion){
            case SUMA:
                resultado=operando1+operando2;
                break;
            case RESTA:
                resultado=operando1-operando2;
                break;
            case MULTIPLICACION:
                resultado=operando1*operando2;
                break;
            case DIVISION:
                resultado=operando1/operando2;
                break;
        }
        return resultado;
    }
    
    public BorderPane getVista (){
        return root;
    }
    
}
