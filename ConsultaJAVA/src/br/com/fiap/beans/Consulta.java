package br.com.fiap.beans;

public class Consulta {
    private String data;
    private String hora;
    private Medico medico;
    private Enfermeiro enfermeiro;
    private Paciente paciente;

    public Consulta() {
    }

    public Consulta(String data, String hora, Medico medico, Enfermeiro enfermeiro, Paciente paciente) {
        this.data = data;
        this.hora = hora;
        this.medico = medico;
        this.enfermeiro = enfermeiro;
        this.paciente = paciente;
    }

    public static String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public static String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Enfermeiro getEnfermeiro() {
        return enfermeiro;
    }

    public void setEnfermeiro(Enfermeiro enfermeiro) {
        this.enfermeiro = enfermeiro;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Consulta" +
                "data" + data +
                "hora" + hora +
                "medico " + medico +
                "enfermeiro" + enfermeiro +
                "paciente" + paciente;
    }
}
