package prjHeranca;

public class Aplicacao {

	public static void main(String[] args) {
		
		Triangulo triangulo = new Triangulo();
		Quadrado quadrado = new Quadrado();
		Retangulo retangulo = new Retangulo();
		
		double areaTriangulo = triangulo.calcularArea(15, 10);
		double areaQuadrado = quadrado.calcularArea(10);
		double areaRetangulo = retangulo.calcularArea(10, 9);
		
		System.out.println("Área do triangulo: " + areaTriangulo);
		System.out.println("Área do quadrado: " + areaQuadrado);
		System.out.println("Área do retângulo: " + areaRetangulo);

	}

}