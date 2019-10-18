package controller;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TelaInicialController extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        File f = new File("src/fxml/telaCadastro.fxml");
        Parent fxmlParent = FXMLLoader.load(f.toURI().toURL());

        stage.setScene(new Scene(fxmlParent, 700, 400));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}