package prjHeranca;

public class Quadrado extends FiguraGeometrica {
	
	private double lado;
	
	@Override
	public double calcularArea(double a,double b) {
		return a*a;
	}
	
	@Override
	public double calcularArea(double a) {
		this.lado = a;
		double area = this.lado*this.lado;
		return area;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

}
