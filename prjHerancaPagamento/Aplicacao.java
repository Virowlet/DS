package prjHerancaPagamento;

public class Aplicacao {

	public static void main(String[] args) {
		
		
		BoletoBancario boleto = new BoletoBancario();
		CartaoDebito debito = new CartaoDebito();
		CartaoCredito credito = new CartaoCredito();
		
		boleto.processar(99.99, "Vinícius","47518567822", "25/05/2026", "25/06/2026","Caixa");
		debito.processar(99.99);
		credito.processar(99.99);

	}

}
