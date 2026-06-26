package prjHerancaPagamento;

public class CartaoDebito extends Pagamento {

	private double valor;
	
	@Override
	public void processar(double valor) {
		this.valor = valor;
		System.out.println("Forma de Pagamento: Débito");
		System.out.println("Valor a ser debitado: " + this.valor);
		System.out.println("*****************************");
	}
	
	@Override
	public void processar(double valor,String nome,String cpf,String dataEmissao,String dataVencimento, String agencia) {
		
	}
	public void setValor(double valor){
		this.valor = valor;
	}
	
	public double getValor(){
		return valor;
	}
	
}
