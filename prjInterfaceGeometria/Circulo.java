package prjInterfaceGeometria;

public class Circulo implements FormaGeometrica {

	private double raio;
	
	@Override
	public double area(double a) {
		this.raio = a;
		double area = Math.PI*(this.raio*this.raio);
		return area;
	}

	@Override
	public double comprimento(double a) {
		this.raio = a;
		double comprimento = 2 * Math.PI * this.raio;
		return comprimento;
	}

}
