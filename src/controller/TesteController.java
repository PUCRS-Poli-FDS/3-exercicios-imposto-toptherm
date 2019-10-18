package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class TesteController implements Initializable {

    @FXML
    private Button btnPagar;

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

    @FXML
    private void showValorAPagar() {
        System.out.println(nome.getText());
        System.out.println(idade.getText());
        System.out.println(CPF.getText());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("ehnois");
    }
}
