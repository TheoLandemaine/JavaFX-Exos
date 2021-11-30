package com.coding.javafxexos.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class TemperatureController implements Initializable {

    @FXML
    private TextField txtCelsius;

    @FXML
    private TextField txtFarein;

    @FXML
    private Slider sldCelsius;

    @FXML
    private Slider sldFarein;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        txtCelsius.setOnKeyReleased(ConvertisseurCelsiusAction -> {
            double celsius = Double.parseDouble(txtCelsius.getText());
            double fahrenheit = (celsius*1.8)+32;
            txtFarein.setText(String.valueOf(fahrenheit));
            sldCelsius.setValue(celsius);
            sldFarein.setValue(fahrenheit);
        });

        txtFarein.setOnKeyReleased(ConvertisseurFahrenAction -> {
            double fahrenheit = Double.parseDouble(txtFarein.getText());
            double celsius = (fahrenheit-32)/1.8;
            txtCelsius.setText(String.valueOf(celsius));
            sldCelsius.setValue(celsius);
            sldFarein.setValue(fahrenheit);
        });

        sldCelsius.setOnMouseDragged(BarreCelsiusAction -> {
            double celsius = sldCelsius.getValue();
            txtCelsius.setText(String.valueOf(celsius));
            double fahrenheit = (celsius*1.8)+32;
            txtFarein.setText(String.valueOf(fahrenheit));
            sldFarein.setValue(fahrenheit);
        });

        sldFarein.setOnMouseDragged(BarreFahrenAction -> {
            double fahrenheit = sldFarein.getValue();
            txtFarein.setText(String.valueOf(fahrenheit));
            double celsius = (fahrenheit-32)/1.8;
            txtCelsius.setText(String.valueOf(celsius));
            sldCelsius.setValue(celsius);
        });

    }
}
