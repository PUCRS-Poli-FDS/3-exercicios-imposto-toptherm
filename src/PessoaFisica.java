public class PessoaFisica{
    private String nome;
    private String CPF;
    private int idade;
    private int dependentes;
    private float contribuicaoOficial;
    private float rendimentoTotal;


    public PessoaFisica(String nome, String CPF, int idade){
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
    }

    public PessoaFisica(String nome, String CPF, int idade, int dependentes){
        this.super(nome, CPF, idade);
        this.dependentes = dependentes;
    }

    public PessoaFisica(String nome, String CPF, int idade, float contribuicaoOficical, float rendimentoTotal){
        this.super(nome, CPF, idade);
        this.contribuicaoOficial = contribuicaoOficial;
        this.rendimentoTotal = rendimentoTotal;
    }

    

}