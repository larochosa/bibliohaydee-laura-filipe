package br.escola.bibliohaydee.model;

public class Autor {

    private String nome;
    private String nacionalidade;
    private int anoNascimento;


    // Construtor sem parâmetros (primeira modelagem)
    public Autor() {
    }


    public String getNome() { return nome; }
    public String getNacionalidade() { return nacionalidade; }
    public int getAnoNascimento() { return anoNascimento; }


    public void setNome(String nome) { this.nome = nome; }
    public void setNacionalidade(String nacionalidade) { this.nacionalidade = nacionalidade; }
    public void setAnoNascimento(int anoNascimento) { this.anoNascimento = anoNascimento; }


    @Override
    public String toString() {
        return nome + " (" + nacionalidade + ", " + anoNascimento + ")";

        // TODO: declare nome, nacionalidade e ano de nascimento
    // TODO: crie o construtor sem parâmetros
   }
}
