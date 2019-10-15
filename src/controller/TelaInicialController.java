package controller;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class TelaInicialController extends Application
{

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
        URL resource = getClass().getClassLoader().getResource("/fxml/telaCadastro.fxml");
        URL arquivoFXML = resource;
        Parent fxmlParent = FXMLLoader.load(arquivoFXML);
        stage.setScene(new Scene(fxmlParent, 300, 100));
        stage.setTitle("Olá mundo com FXML");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}