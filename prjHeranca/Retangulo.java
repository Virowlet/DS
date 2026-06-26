package prjHeranca;

public class Retangulo extends FiguraGeometrica {
	
	private double lado;
	private double base;
	
	@Override
	public double calcularArea(double a) {
		return a*a;
	}
	
	@Override
	public double calcularArea(double a,double b) {
		this.lado = a;
		this.base = b;
		double area = a*b;
		return area;
	}
	
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}

}
