package com.fsd.controller;

import com.fsd.dto.PessoaFisica;
import com.fsd.imposto.ImpostoCompleto;
import com.fsd.imposto.ImpostoSimplificado;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

public class ImpostoController implements Initializable {
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
	private Label valorTotal;

	@FXML
	private void showValorAPagar() {
		PessoaFisica pessoaFisica;
		if (idade.getText().isEmpty() || numeroDependentes.getText().isEmpty()) {
			pessoaFisica = new PessoaFisica(nome.getText(), CPF.getText(),
					new BigDecimal(contribuicaoOficial.getText()), new BigDecimal(rendimentoTotal.getText()));
		} else {
			pessoaFisica = new PessoaFisica(nome.getText(), CPF.getText(), Integer.parseInt(idade.getText()),
					Integer.valueOf(numeroDependentes.getText()), new BigDecimal(contribuicaoOficial.getText()),
					new BigDecimal(rendimentoTotal.getText()));
		}

		BigDecimal valorImposto = calcularIrpf(pessoaFisica);
		valorTotal.setText("Valor total de imposto de renda a ser pago: " + valorImposto);
		valorTotal.setVisible(true);
	}

	private ImpostoCompleto impostoCompleto;
	private ImpostoSimplificado impostoSimplificado;

	public ImpostoController() {
		this.impostoCompleto = ImpostoCompleto.getInstance();
		this.impostoSimplificado = ImpostoSimplificado.getInstance();
	}

	public BigDecimal calcularIrpf(PessoaFisica pessoaFisica) {
		BigDecimal baseCalculo = pessoaFisica.getRendimentoTotal().subtract(pessoaFisica.getContribuicaoOficial());
		if (pessoaFisica.getIdade() == null || pessoaFisica.getDependentes() == null) {
			return impostoSimplificado.calculaImpostoSimplificado(baseCalculo);
		} else {
			return impostoCompleto.calculaImpostoCompleto(baseCalculo, pessoaFisica.getDependentes(),
					pessoaFisica.getIdade());
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}
}
