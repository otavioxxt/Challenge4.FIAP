package br.com.fiap.beans;

public class Procedimento {
    private String nome;
    private String descricao;
    private String data;

    public Procedimento() {
    }

    public Procedimento(String nome, String descricao, String data) {
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Procedimento" +
                "nome" + nome +
                "descricao" + descricao +
                "data" + data;
    }
}
