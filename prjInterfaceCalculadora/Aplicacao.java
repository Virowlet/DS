package prjInterfaceCalculadora;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		
		//inicializacao
		System.out.println("Insira dois números:");
		int a = ler.nextInt();
		int b = ler.nextInt();
		int resultado = 0;
		
		//menu
		boolean t = false;
		while(t==false) {
		System.out.println("Qual Operação gostaria de fazer com estes números?");
		System.out.println("1 -> Soma");
		System.out.println("2 -> Subtracao");
		System.out.println("3 -> Multiplicacao");
		System.out.println("4 -> Divisao");
		int input = ler.nextInt();
		
		//apuracao do input
			switch(input) {
			case 1:
				Soma soma = new Soma();
				resultado = soma.calcula(a, b);
				t = true;
				break;
			case 2:
				Subtracao subtracao = new Subtracao();
				resultado = subtracao.calcula(a, b);
				t = true;
				break;
			case 3:
				Multiplicacao multiplicacao = new Multiplicacao();
				resultado = multiplicacao.calcula(a, b);
				t = true;
				break;
			case 4:
				Divisao divisao = new Divisao();
				resultado = divisao.calcula(a, b);
				t = true;
				break;
			default:
				System.out.println("Opcao Invalida");
				t = false;
			}
		}
		
		//resultado
		System.out.println("Resultado = " + resultado);
		
		ler.close();

	}

}
