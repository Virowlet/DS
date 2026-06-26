package prjImposto;

public class ICSM implements Imposto {
	
	private double porcentagem = 18;
	
	@Override
	public double calcularImposto(double valor) {
		valor = valor/100*porcentagem;
		System.out.println("Valor imposto = " + valor);
		return valor;
	}
	
	

}
