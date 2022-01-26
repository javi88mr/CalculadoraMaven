/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadormaven;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Javier
 */
public class CalculadoraApp extends Application {
    CalculadoraController controler;
    
    @Override
    public void start(Stage stage) throws Exception {
        controler = new CalculadoraController();
        
        Scene escena = new Scene(controler.getVista());
        
       stage.setScene(escena);
       stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
