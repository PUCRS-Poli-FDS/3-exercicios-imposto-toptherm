package controller;

import dto.PessoaFisica;

import java.math.BigDecimal;

public class ImpostoController {

    private ImpostoCompleto impostoCompleto;
    private ImpostoSimplificado impostoSimplificado;

    public BigDecimal calcularIrpf(PessoaFisica pessoaFisica){
        if(pessoaFisica.getIdade() == null || pessoaFisica.getDependentes() == null){
            return impostoCompleto.calculaImpostoSimplificado();
        }else {
            return impostoCompleto.calculaImpostoCompleto();
        }
    }
}
