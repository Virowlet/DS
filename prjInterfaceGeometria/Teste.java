package prjInterfaceGeometria;

public class Teste {

	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado();
		Circulo circulo = new Circulo();
		
		//quadrado
		System.out.println("Quadrado:");
		System.out.printf("Comprimento: %.2f%n",quadrado.comprimento(4));
		System.out.printf("Área: %.2f%n",quadrado.area(4));
		
		//circulo
		System.out.println("Círculo:");
		System.out.printf("Comprimento: %.2f%n",circulo.comprimento(4));
		System.out.printf("Área: %.2f%n",circulo.area(4));
		
	}

}
