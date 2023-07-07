package com.devbak.appli_gestionpatient;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 *
 * @author  BakayokoJunior
 * Mon mail --> bakbassjunior@gmail.com
 * Compte github --> https://github.com/BakayokoJunior
 */


public class LoginController implements Initializable {

    @FXML
    private Label errorMgs;

    @FXML
    private PasswordField pwdtf;

    @FXML
    private TextField usertf;


    @FXML
    public void connecter(ActionEvent actionEvent) {
        // les champs saisir son stocké dans les variables user & pass
        String user = usertf.getText();
        String pass = pwdtf.getText();

        if (user.isBlank() || pass.isBlank()){
            errorMgs.setText("Entrez vos coordonnées !");
        } else if (!user.equalsIgnoreCase("admin") || !pass.equalsIgnoreCase("admin")) {
            errorMgs.setText("Vérifier vos coordonnées !");
        }else {
            // la cas ou user = admin & pass = admin une rédirection vers l'interface gestion
            FXMLLoader Loader = new FXMLLoader(getClass().getResource("gestion.fxml"));
            Parent root = null;
            try {
                root = Loader.load();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Scene loginSc = usertf.getScene();
            loginSc.setRoot(root);
        }
    }

    void connecte(javafx.event.ActionEvent actionEvent) throws IOException {
    }

    public void close(){
        System.exit(0);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }



}
