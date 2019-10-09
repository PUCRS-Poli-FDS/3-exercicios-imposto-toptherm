package controller;

import dto.PessoaFisica;
import imposto.ImpostoCompleto;
import imposto.ImpostoSimplificado;

import java.math.BigDecimal;

public class ImpostoController {

    private ImpostoCompleto impostoCompleto;
    private ImpostoSimplificado impostoSimplificado;

    public BigDecimal calcularIrpf(PessoaFisica pessoaFisica){
        BigDecimal baseCalculo = pessoaFisica.getRendimentoTotal().subtract(pessoaFisica.getContribuicaoOficial());
        if(pessoaFisica.getIdade() == null || pessoaFisica.getDependentes() == null){
            return impostoSimplificado.calculaImpostoSimplificado(baseCalculo);
        }else {
            return impostoCompleto.calculaImpostoCompleto(baseCalculo, pessoaFisica.getDependentes(), pessoaFisica.getIdade());
        }
    }
}
