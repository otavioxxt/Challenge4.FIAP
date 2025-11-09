package br.com.fiap.beans;

public class Prontuario {
    private Paciente paciente;
    private String alergias;
    private String historico;
    private String observacoes;

    public Prontuario() {
    }

    public Prontuario(Paciente paciente, String alergias, String historico, String observacoes) {
        this.paciente = paciente;
        this.alergias = alergias;
        this.historico = historico;
        this.observacoes = observacoes;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return "Prontuario" +
                "paciente" + paciente +
                "alergias" + alergias +
                "historico" + historico +
                "observacoes" + observacoes;
    }
}
