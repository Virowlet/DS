package prjMetodos;

public class Saudacao {
	
	public static void saudacaoPersonalizada(String nome){
		System.out.println("Olá "+nome+", seja bem vindo(a)!");
	}

	public static void main(String[] args) {
		String nome = "Vitor";
		
		saudacaoPersonalizada(nome);
	}

}
