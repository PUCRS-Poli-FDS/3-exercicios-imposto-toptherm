package controller;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class TelaInicialController extends Application {

    @FXML
    private TextField nome;

    @FXML
    private TextField CPF;

    @FXML
    private TextField idade;

    @FXML
    private TextField numeroDependentes;

    @FXML
    private TextField contribuicaoOficial;

    @FXML
    private TextField rendimentoTotal;


    @Override
    public void start(Stage stage) throws IOException {
        File f = new File("src/fxml/telaCadastro.fxml");
        Parent fxmlParent = FXMLLoader.load(f.toURI().toURL());

        stage.setScene(new Scene(fxmlParent, 300, 100));
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}