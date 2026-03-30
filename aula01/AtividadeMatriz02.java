package aula01;

public class AtividadeMatriz02 {

	public static void main(String[] args) {
		
		int m[][] = new int [5][5];
		int num = 1;
		int soma = 0;
		
		for(int i=0; i<5; i++) {
			for(int j=0;j<5;j++) {
				m[i][j] = num;
				num++;
			}	
		}
		for(int i=0; i<5; i++) {
			for(int j=0;j<5;j++) {
				soma = soma + m[i][j];
			}	
		}
		System.out.println(soma);
	}
}