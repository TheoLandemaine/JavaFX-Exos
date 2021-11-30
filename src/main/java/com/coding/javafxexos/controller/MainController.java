package com.coding.javafxexos.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private Button btnTemperature;

    @FXML
    private Button btnCombat;

    @FXML
    private AnchorPane PagePrincipale;

    @FXML
    private VBox temperature;

    @FXML
    private VBox combats;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        PagePrincipale.getChildren().removeAll(temperature, combats);

        btnTemperature.setOnMouseClicked(btnCommodeAction -> {
            PagePrincipale.getChildren().removeAll(combats);
            PagePrincipale.getChildren().addAll(temperature);
        });

        btnCombat.setOnMouseClicked(btnFauteuilAction -> {
            PagePrincipale.getChildren().removeAll(temperature);
            PagePrincipale.getChildren().addAll(combats);
        });

    }
}