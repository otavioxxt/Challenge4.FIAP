package br.com.fiap.beans;

public class Paciente {
    private String nome;
    private String cpf;
    private String sexo;
    private int idade;
    private double peso;
    private double altura;

    public Paciente() {
    }

    public Paciente(String nome, String cpf, String sexo, int idade, double peso, double altura) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome +
                ", cpf='" + cpf +
                ", sexo='" + sexo  +
                ", idade=" + idade +
                ", peso=" + peso +
                ", altura=" + altura;
    }
}
