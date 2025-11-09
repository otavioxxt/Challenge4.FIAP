package br.com.fiap.beans;

public class Receita {
    private String medicamento;
    private String dosagem;
    private String duracao;
    private Medico medico;

    public Receita() {
    }

    public Receita(String medicamento, String dosagem, String duracao, Medico medico) {
        this.medicamento = medicamento;
        this.dosagem = dosagem;
        this.duracao = duracao;
        this.medico = medico;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getDosagem() {
        return dosagem;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public String toString() {
        return "Receita" +
                "medicamento" + medicamento +
                "dosagem" + dosagem +
                "duracao" + duracao +
                "medico" + medico;
    }
}
