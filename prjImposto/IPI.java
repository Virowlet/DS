package prjImposto;

public class IPI implements Imposto {
	
	private double porcentagem = 10;
	
	@Override
	public double calcularImposto(double valor) {
		valor = valor/100*porcentagem;
		System.out.println("Valor imposto = " + valor);
		return valor;
	}
}
