import java.util.Scanner;

public class FuncaoVerificadorDeMaioridade {

    public static boolean  ehMaiorDeIdade(int idade){
    	boolean t;
    	if(idade>=18) {
    		t = true;
    	}
    	else {
    		t = false;
    	}
    	return t;
    }

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		boolean t;
		System.out.println("Insira a idade:");
		int idade = ler.nextInt();
		
		t = ehMaiorDeIdade(idade);
		
		if(t==true) {
			System.out.println("Maior de Idade");
		}
		else {
			System.out.println("Menor de Idade");
		}
	}

}