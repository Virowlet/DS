package prjMetodos;

public class Menu {

	public static void exibirMenu(String opcao1, String opcao2, String opcao3, String opcao4, String opcao5) {
		System.out.println(opcao1+"\n"+opcao2+"\n"+opcao3+"\n"+opcao4+"\n"+opcao5);
	}
	
	public static void main(String args[]) {
		String opcao1 = "Retângulo";
		String opcao2 = "Triângulo";
		String opcao3 = "Círculo";
		String opcao4 = "Losango";
		String opcao5 = "Sair";
		
		exibirMenu(opcao1,opcao2,opcao3,opcao4,opcao5);
	}
}
