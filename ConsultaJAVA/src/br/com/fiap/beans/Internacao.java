package br.com.fiap.beans;

public class Internacao {
    private String dataEntrada;
    private String dataSaida;
    private String motivo;

    public Internacao() {
    }

    public Internacao(String dataEntrada, String dataSaida, String motivo) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.motivo = motivo;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @Override
    public String toString() {
        return "Internacao" +
                "dataEntrada" + dataEntrada +
                "dataSaida" + dataSaida +
                "motivo" + motivo;
    }
}
