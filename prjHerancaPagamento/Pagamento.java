package prjHerancaPagamento;

public abstract class Pagamento {

	public abstract void processar(double valor);
	
	public abstract void processar(double valor,String nome,String cpf,String dataEmissao,String dataVencimento, String agencia);
	
}
