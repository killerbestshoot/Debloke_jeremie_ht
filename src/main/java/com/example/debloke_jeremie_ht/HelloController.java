package com.example.debloke_jeremie_ht;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField username;
    public PasswordField password;
    public Button authButton;
    @FXML
    private Label welcomeText;

    public void authUser(ActionEvent actionEvent) {

        System.out.println(username.getText()+" "+ password.getText());
    }
}