package prjClinica;

import java.util.Scanner;

public class Medico {
	
	public String especialidadeMedico;
	public String nomeMedico;
	public int qtdConsultasMedico;
	
	public void checarConsultaMedico(String nomePaciente, String especialidadeMedico,String data,int numeroIdentificacaoPaciente) {
		System.out.println("Consulta marcada com paciente n°" + numeroIdentificacaoPaciente + "\n" + "Nome do paciente: " + nomePaciente + "\n" + "Especialidade: " + especialidadeMedico + "\n" + "na data:" + data + "\n");
	}
	public void cancelarConsulta(String nomePaciente, String especialidadeMedico, int numeroIdentificacaoPaciente) {
		System.out.println("Consulta cancelada com paciente n°" + numeroIdentificacaoPaciente  + "\n" + "Nome do paciente: " + nomePaciente + "\n" + "Especialidade: " + especialidadeMedico + "\n");
	}
	public String cadastrarEspecialidade() {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Insira sua especialidade:");
		String especialidade = ler.next();
		System.out.println("Especialidade cadastrada: " + especialidade + "!" + "\n");
		
		return especialidade;
	}

}