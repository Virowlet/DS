package prjMetodos;

import java.util.Random;
import java.util.Scanner;

public class SorteioInteiros {
	
	public static boolean testeDeIgualdade(int n1, int s1, int n2, int s2) {
		boolean t;
		if (n1==s1 && n2==s2) {
			t = true;
			System.out.println("Iguais!");
		}
		else {
			t = false;
			System.out.println("Diferentes...");
		}
		System.out.println(t);
		return t;
	}
	
	public static void leiaDoisInteiros() {
		Scanner ler = new Scanner (System.in);
		System.out.println("Insira dois números entre 1 e 10");
		int n1 = ler.nextInt();
		int n2 = ler.nextInt();
		sorteieDoisInteiros(n1,n2);
	}
	public static void sorteieDoisInteiros(int n1, int n2) {
		Random gerador = new Random();
		
		System.out.println("números sorteados:");
		
		int numero1 = gerador.nextInt(10);
		System.out.println(numero1);
		
		int numero2 = gerador.nextInt(10);
		System.out.println(numero2);
		
		testeDeIgualdade(n1,numero1,n2,numero2);
		
	}


	public static void main(String[] args) {
		leiaDoisInteiros();
	}

}
