package aula01;

public class ExemploMatriz4x4 {
	public static void main(String[]args) {
		int m[][] = new int [4][4];
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++ ) {
				m[i][j] = 1;
				System.out.print(m[i][j]+" ");
			}
		System.out.println("");
			
		}
	}
}
