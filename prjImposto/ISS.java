package prjImposto;

public class ISS implements Imposto {

	private double porcentagem = 5;
	
	@Override
	public double calcularImposto(double valor) {
		valor = valor/100*porcentagem;
		System.out.println("Valor imposto = " + valor);
		return valor;
	}
}
