package prjImposto;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira o valor do produto/servico:");
		double valor = ler.nextDouble();
		int input = 0;
		
		boolean t = false;
		while(t==false) {
			System.out.println("Reajustar o valor com base em que imposto?");
			System.out.println("1 ->ICSM");
			System.out.println("2 ->IPI");
			System.out.println("3 ->ISS");
			input = ler.nextInt();
			if(input<1||input>3) {
				System.out.println("Opcao invalida");
			}
			else {
				t = true;
			}
		}
		
		if(input==1) {
			System.out.println("Imposto: ICSM");
			ICSM icsm = new ICSM();
			icsm.calcularImposto(valor);
		}
		if(input==2) {
			System.out.println("Imposto: IPI");
			IPI ipi = new IPI();
			ipi.calcularImposto(valor);
		}
		if(input==3) {
			System.out.println("Imposto: ISS");
			ISS iss = new ISS();
			iss.calcularImposto(valor);
		}

	}

}
