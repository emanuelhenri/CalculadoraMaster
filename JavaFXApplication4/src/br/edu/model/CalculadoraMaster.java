/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.model;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author 04163917292
 */

@Entity
public class CalculadoraMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @FXML
    private double Numero1;
    @FXML
    private double Numero2;
    @FXML
    private double Resultado;

    public double getNumero1() {
        return Numero1;
    }

    public void setTxtNumero1(double Numero1) {
        this.Numero1 = Numero1;
    }

    public double getNumero2() {
        return Numero2;
    }

    public void setNumero2(double Numero2) {
        this.Numero2 = Numero2;
    }

    public double getResultado() {
        return Resultado;
    }

    public void setResultado(double Resultado) {
        this.Resultado = Resultado;
    }
}
