package prjArea;

public class CalculadoraArea {

	private double valor1;
	private double valor2;
	private double valor3;
	
	public CalculadoraArea(double raio) {
		double area;
		setValor1(raio);
		area = (valor1*valor1)*3.14;
		System.out.println("Area do Círculo = " + area);
	}
	public CalculadoraArea(double base,double altura) {
		double area;
		setValor1(base);
		setValor2(altura);
		area = valor1*valor2;
		System.out.println("Area do Retângulo = " + area);
	}
	public CalculadoraArea(double baseMaior,double baseMenor, double altura) {
		double area;
		setValor1(baseMaior);
		setValor2(baseMenor);
		setValor3(baseMenor);
		area = ((valor1+valor1)+valor3/2);
		System.out.println("Area do Trapézio = " + area);
	}

	public double getValor3() {
		return valor3;
	}
	public void setValor3(double valor3) {
		this.valor3 = valor3;
	}
	public double getValor2() {
		return valor2;
	}
	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}
	public double getValor1() {
		return valor1;
	}
	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}
	//Cálculo de área: Eles identificam o cálculo com base na quantidade de argumentos inseridos dentro dos parâmetros do construtor.
}