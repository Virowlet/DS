package aula01;

public class AtividadeMatriz04 {

	public static void main(String[] args) {
		
		int m[][] = new int [4][4];
		int num = 1;
		
		for(int i=0; i<4; i++) {
			for(int j=0;j<4;j++) {
				m[i][j] = num;
				num++;
				if (j==0) {
					System.out.print(m[i][j] + " ");
				}
			}
		}
	}
}