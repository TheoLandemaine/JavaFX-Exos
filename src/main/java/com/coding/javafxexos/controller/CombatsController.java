package com.coding.javafxexos.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class CombatsController implements Initializable {

    @FXML
    private ComboBox boxJ1;

    @FXML
    private ComboBox boxJ2;

    @FXML
    private AnchorPane apnTour1;

    @FXML
    private AnchorPane apnTour2;

    @FXML
    private Button btnValider;

    @FXML
    private HBox hbxTitre1;

    @FXML
    private HBox hbxChoix1;

    @FXML
    private HBox hbxTitre2;

    @FXML
    private HBox hbxChoix2;

    @FXML
    private CheckBox cbxValider1;

    @FXML
    private CheckBox cbxValider2;

    @FXML
    private Text txtTitre1;

    @FXML
    private Text txtTitre2;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        apnTour1.getChildren().removeAll(hbxTitre1, hbxChoix1);
        apnTour2.getChildren().removeAll(hbxTitre2, hbxChoix2);

        btnValider.setOnMouseClicked(btnCommodeAction -> {
            apnTour1.getChildren().addAll(hbxTitre1, hbxChoix1);
        });

        cbxValider1.setOnMouseClicked(btnCommodeAction -> {
            apnTour2.getChildren().addAll(hbxTitre2, hbxChoix2);
        });

        boxJ1.getItems().addAll(
                "Guerrier",
                "Sorcière",
                "Voleur"
        );

        boxJ2.getItems().addAll(
                "Guerrier",
                "Sorcière",
                "Voleur"
        );


    }
}
