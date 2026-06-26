package prjInterfaceGeometria;

public class Quadrado implements FormaGeometrica {

	private double lado;
	
	@Override
	public double area(double a) {
		this.lado = a;
		double area = this.lado*this.lado;
		return area;
	}

	@Override
	public double comprimento(double a) {
		this.lado = a;
		double comprimento = this.lado;
		return comprimento;
	}

}