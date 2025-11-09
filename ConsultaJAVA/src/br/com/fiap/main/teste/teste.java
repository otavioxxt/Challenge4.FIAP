package br.com.fiap.main.teste;
import br.com.fiap.beans.*;

public class teste {
    public static void main(String[] args) {
        Paciente objPaciente = new Paciente();
        Medico objMedico = new Medico();
        Enfermeiro objEnfermeiro = new Enfermeiro();
        Consulta objConsulta = new Consulta();
        Prontuario objProntuario = new Prontuario();
        Receita objReceita = new Receita();
        Setor objSetor = new Setor();
        Hospital objHospital = new Hospital();
        Procedimento  objProcedimento = new Procedimento();
        Internacao objInternacao = new Internacao();


        objPaciente.setNome("Fulano");
        objPaciente.setCpf("123.456.7890");
        objPaciente.setSexo("Masculino");
        objPaciente.setIdade(12);
        objPaciente.setPeso(12.5);
        objPaciente.setAltura(1.70);
        objMedico.setNome("Braufa");
        objMedico.setCrm("555555");
        objMedico.setEspecialidade("Cardiologista");
        objEnfermeiro.setNome("Coisinha");
        objEnfermeiro.setCoren("11111");
        objEnfermeiro.setTurno("Matutino");
        objConsulta.setData("11/09");
        objConsulta.setHora("11 horas");
        objProntuario.setAlergias("Dipirona");
        objProntuario.setHistorico("paciente com hipertensão controlada, consulta regular a cada 6 meses");
        objProntuario.setObservacoes("evitar prescrição de medicamentos que contenham dipirona." +
                "\nRecomenda-se uso alternativo de paracetamol para dor ou febre.");
        objReceita.setMedicamento("Paracetamol");
        objReceita.setDosagem("500mg");
        objReceita.setDuracao("1 comprimido por dia por tempo indeterminado");
        objSetor.setNome("Cordiologista");
        objSetor.setAndar("Terceiro andar");
        objSetor.setSala("305");
        objHospital.setNome("Hospital das Clinicas de São Paulo");
        objHospital.setEndereco("Av. Dr. Enéas Carvalho de Aguiar, 255 - São Paulo - SP");
        objHospital.setTelefone("(11) 2661-0000");
        objProcedimento.setNome("Eletrocardiograma");
        objProcedimento.setData("11/09");
        objProcedimento.setDescricao("ECG de rotina para avaliação de ritmo cardíaco.");
        objInternacao.setDataEntrada("11/09");
        objInternacao.setDataSaida("15/09");
        objInternacao.setMotivo("Observação de quadro hipertensivo");

        System.out.println(
                "Nome: "  + objPaciente.getNome() +
                " CPF: " + objPaciente.getCpf() +
                " Sexo: " + objPaciente.getSexo() +
                " Idade: " + objPaciente.getIdade() +
                " Peso: " + objPaciente.getPeso() +
                " Altura: " + objPaciente.getAltura() +
                "\nNOME DO MÉDICO: " + objMedico.getNome() +
                " CRM: " + objMedico.getCrm() +
                " ESPECIALIDADE: " + objMedico.getEspecialidade() +
                "\nNome do Enfermeiro: " + objEnfermeiro.getNome() +
                " Coren: " + objEnfermeiro.getCoren() +
                " Turno: " + objEnfermeiro.getTurno() +
                "\nData da consulta: " + objConsulta.getData() +
                " Hora: " + objConsulta.getHora() +
                "\nAlergias: " + objProntuario.getAlergias() +
                " Histórico: " + objProntuario.getHistorico() +
                " Observacoes: " + objProntuario.getObservacoes() +
                "\nMedicamento: " + objReceita.getMedicamento() +
                " Dosagem: " + objReceita.getDosagem() +
                " Duração: " + objReceita.getDuracao() +
                " \nSetor: " + objSetor.getNome() +
                " Andar: " + objSetor.getAndar() +
                " Sala: " + objSetor.getSala() +
                "\nHospital: " + objHospital.getNome() +
                " Endereço: " + objHospital.getEndereco() +
                " Telefone: " + objHospital.getTelefone() +
                "\nProcedimento: " + objProcedimento.getNome() +
                " Data: " + objProcedimento.getData() +
                " Descricao: " + objProcedimento.getDescricao() +
                "\nData de Entrada: " + objInternacao.getDataEntrada() +
                " Data de Saida: " + objInternacao.getDataSaida() +
                " Motivo: " + objInternacao.getMotivo()

        );
    }
}


