package dto;

import java.math.BigDecimal;

public class PessoaFisica{
    private String nome;
    private String CPF;
    private Integer idade;
    private Integer dependentes;
    private BigDecimal contribuicaoOficial;
    private BigDecimal rendimentoTotal;


    public PessoaFisica(String nome, String CPF, int idade){
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
    }

    public PessoaFisica(String nome, String CPF, int idade, BigDecimal contribuicaoOficial, BigDecimal rendimentoTotal){
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
        this.contribuicaoOficial = contribuicaoOficial;
        this.rendimentoTotal = rendimentoTotal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Integer getIdade() {
        return idade;
    }


    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getDependentes() {
        return dependentes;
    }

    public void setDependentes(Integer dependentes) {
        this.dependentes = dependentes;
    }

    public BigDecimal getContribuicaoOficial() {
        return contribuicaoOficial;
    }

    public void setContribuicaoOficial(BigDecimal contribuicaoOficial) {
        this.contribuicaoOficial = contribuicaoOficial;
    }

    public BigDecimal getRendimentoTotal() {
        return rendimentoTotal;
    }

    public void setRendimentoTotal(BigDecimal rendimentoTotal) {
        this.rendimentoTotal = rendimentoTotal;
    }
}