import java.util.Scanner;

public class FuncaoGeradorDeCrachá {

	public static void imprimirCrachas(String cargo, String nome) {
		System.out.println(nome);
		System.out.print("Está no cargo: " + cargo);
	}
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String cargo;
		String nome;
		
		System.out.println("Insira um cargo:");
		cargo = ler.next();
		System.out.println("Insira um nome:");
		nome = ler.next();
		
		imprimirCrachas(cargo,nome);

	}

}