package prjClinica;

import java.util.Scanner;

public class Clinica {
	
	public static int continuar(int a) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Gostaria de continuar? " + "1 - Sim " + "2 - Não");
		a = ler.nextInt();
		return a;
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		//Instanciando
		Paciente paciente = new Paciente();
		Medico medico = new Medico();
		
		
		
		int usuario;
		System.out.println("Você é Médico ou Paciente" + "\n" + "1 - Paciente" + "\n" + "2 - Médico");
		usuario = ler.nextInt();
		boolean verificacao = true;
		boolean valido = false;
		switch(usuario) {
		case 1:
			System.out.println("Paciente!");
			verificacao = true;
			valido = true;
			break;
		case 2:
			System.out.println("Médico!");
			verificacao = false;
			valido = true;
			break;
		default:
			System.out.println("Inválido, reinicie o programa!");
			break;
		}
		
		if (verificacao == true && valido == true) {
			String nomePaciente = "'Sem nome cadastrado'";
			int navegacao = 1;
			while(navegacao==1) {
				System.out.println("O que deseja?" + "\n" + "1 - Cadastro"  + "\n" + "2 - Agendar Consulta" + "\n" + "3 - Checar Consulta" + "\n" + "4 - Cancelar Consulta");
				int acao = ler.nextInt();
				if(acao == 1) {
					nomePaciente = paciente.seCadastrar();
					navegacao = continuar(navegacao);
				}
				else {
					if(acao == 2) {
						paciente.agendarConsulta(nomePaciente, "Oswaldo de Assis", "Oftalmologia", "31/03");
						navegacao = continuar(navegacao);
					}
					else {
						if(acao == 3) {
							paciente.checarConsultaPaciente("Oswaldo de Assis", "Oftalmologia", "31/03");
							navegacao = continuar(navegacao);
						}
						else {
							if(acao == 4) {
								paciente.cancelarConsulta("Oswaldo de Assis", "Oftalmologia");
								navegacao = continuar(navegacao);
							}
							else{
								System.out.println("ERRO");
							}
						}
					}
				}	
			}
		}
		else {
			if(verificacao == false && valido == true) {
				String especialidadeMedico = "'Sem especialidade cadastrada'";
				int navegacao = 1;
				while(navegacao==1) {
					System.out.println("O que deseja?" + "\n" + "1 - Checar Consulta" + "\n" + "2 - Cancelar Consulta" + "\n" + "3 - Cadastrar Especialidade");
					int acao = ler.nextInt();
					if(acao == 1) {
						medico.checarConsultaMedico("Vitor", especialidadeMedico, "31/03",1);
						navegacao = continuar(navegacao);
					}
					else {
						if(acao == 2) {
							medico.cancelarConsulta("Vitor", especialidadeMedico, 1);
							navegacao = continuar(navegacao);
						}
						else {
							if(acao == 3) {
								especialidadeMedico = medico.cadastrarEspecialidade();
								navegacao = continuar(navegacao);
							}
							else {
								System.out.println("ERRO");
							}
						}
					}
				}
			}
		}
	}

}
