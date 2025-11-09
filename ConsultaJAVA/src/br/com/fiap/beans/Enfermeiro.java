package br.com.fiap.beans;

public class Enfermeiro {
    private String nome;
    private String coren;
    private String turno;

    public Enfermeiro() {
    }

    public Enfermeiro(String nome, String coren, String turno) {
        this.nome = nome;
        this.coren = coren;
        this.turno = turno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Enfermeiro" +
                "nome" + nome +
                "coren" + coren +
                "turno" + turno;
    }
}
