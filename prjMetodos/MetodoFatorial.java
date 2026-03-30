package prjMetodos;

import java.util.Scanner;

public class MetodoFatorial {
	
	public static int fatorial(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f = f*i;
		}
		System.out.println("fatorial: "+f);
		return f;
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n;
		System.out.println("Insira um número:");
		n = ler.nextInt();
		
		fatorial(n);
		
	}

}
