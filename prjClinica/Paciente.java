package prjClinica;

import java.util.Scanner;

public class Paciente {

	public String nomePaciente;
	public int numeroIdentificacaoPaciente;
	public String fonePaciente;
	
	public String seCadastrar() {
		Scanner ler = new Scanner (System.in);
		System.out.println("Qual o seu nome?");
		String nome = ler.next();
		System.out.println("Qual o seu telefone?");
		String fone = ler.next();
		System.out.println("Bem vindo " + nome + "!");
		return nome;
	}
	public void agendarConsulta(String nomePaciente, String nomeMedico, String especialidadeMedico,String data) {
		Scanner ler = new Scanner (System.in);
		System.out.println(nomePaciente +" digite seu número de identificacao:");
		numeroIdentificacaoPaciente = ler.nextInt();
		System.out.println("Paciente n°"+ numeroIdentificacaoPaciente + "\n" + "Consulta marcada com o médico: " + nomeMedico + "\n" + "Especialidade: " + especialidadeMedico + "\n"+ "na data: " + data + "\n");
	}
	public void checarConsultaPaciente(String nomeMedico, String especialidadeMedico,String data) {
		System.out.println("Consulta:" + "\n" + "Médico: " + nomeMedico + "\n" + "Especialidade: " + especialidadeMedico + "\n"+ "na data: " +  data + "\n");
	}
	public void cancelarConsulta(String nomeMedico, String especialidadeMedico) {
		System.out.println("Consulta cancelada com o médico: " + nomeMedico + "\n" + "Especialidade: " + especialidadeMedico + "\n");
	}
	
}