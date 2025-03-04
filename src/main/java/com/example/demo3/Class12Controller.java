package com.example.demo3;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Class12Controller {
    @FXML
    private TextField userField;

    @FXML
    private TextField myIdField;

    @FXML
    private Label showLabel;

    @FXML
    private void buttonUpdate(ActionEvent event) {
        String name = userField.getText();
        String id = myIdField.getText();
        showLabel.setText("Name: " + name + ", ID: " + id);
    }


}