import java.util.Scanner;

public class FuncaoContadorRegressivo {
	
	public static void contagemRegressiva(int i) {
		while(i>=0) {
			System.out.println(i);
			i--;
		}
	}
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int i;
		
		System.out.println("Insira um número:");
		i = ler.nextInt();
		
		contagemRegressiva(i);

	}

}
