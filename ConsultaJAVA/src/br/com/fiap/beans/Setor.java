package br.com.fiap.beans;

public class Setor {
    private String nome;
    private String andar;
    private String sala;

    public Setor() {
    }

    public Setor(String nome, String andar, String sala) {
        this.nome = nome;
        this.andar = andar;
        this.sala = sala;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Setor" +
                "nome" + nome +
                "andar" + andar +
                "sala" + sala;
    }
}
