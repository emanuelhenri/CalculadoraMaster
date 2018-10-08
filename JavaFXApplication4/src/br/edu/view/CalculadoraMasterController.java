/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author 04163917292
 */
public class CalculadoraMasterController implements Initializable {

    @FXML
    private TextField txtNumero1;
    @FXML
    private Button btnDiminuir;
    @FXML
    private Button btnMultiplicar;
    @FXML
    private Button btnSomar;
    @FXML
    private TextField txtNumero2;
    @FXML
    private TextField txtResultado;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void DIVIDIR(ActionEvent event) {
        double Num1 = Double.parseDouble(txtNumero1.getText()),
              Num2 = Double.parseDouble(txtNumero2.getText());
       Double result = Num1 / Num2;
       txtResultado.setText(result.toString());
    }

    @FXML
    private void MENOS(ActionEvent event) {
    double Num1 = Double.parseDouble(txtNumero1.getText()),
              Num2 = Double.parseDouble(txtNumero2.getText());
       Double result = Num1 - Num2;
       txtResultado.setText(result.toString());
    }

    @FXML
    private void VEZES(ActionEvent event) {
   double Num1 = Double.parseDouble(txtNumero1.getText()),
              Num2 = Double.parseDouble(txtNumero2.getText());
       Double result = Num1 * Num2;
       txtResultado.setText(result.toString());
    }

    @FXML
    private void MAIS(ActionEvent event) {
    double Num1 = Double.parseDouble(txtNumero1.getText()),
              Num2 = Double.parseDouble(txtNumero2.getText());
       Double result = Num1 + Num2;
       txtResultado.setText(result.toString());
    }

    @FXML
    private void AbrirHistorico(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
    fxmlLoader.setLocation(getClass().getResource("/br/edu/view/Historico.fxml"));
    Scene scene = new Scene(fxmlLoader.load(), 900, 682);
    Stage stage = new Stage();
    stage.setTitle("ir para menu principal");
    stage.setScene(scene);
    stage.show();
 
}
}

    
    

