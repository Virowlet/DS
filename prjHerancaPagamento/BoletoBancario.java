package prjHerancaPagamento;

public class BoletoBancario extends Pagamento {

	private double valor;
	private String nome;
	private String cpf;
	private String dataEmissao;
	private String dataVencimento;
	private String agencia;
	
	@Override
	public void processar(double valor) {
		
	}
	
	@Override
	public void processar(double valor,String nome,String cpf,String dataEmissao,String dataVencimento, String agencia) {
		this.valor = valor;
		this.nome = nome;
		this.cpf = cpf;
		this.dataEmissao = dataEmissao;
		this.dataVencimento = dataVencimento;
		this.agencia = agencia;
		System.out.println("Forma de Pagamento: Boleto Bancário");
		System.out.println("CPF: " + cpf);
		System.out.println("Nome: " + nome);
		System.out.println("Data de emissão: " + dataEmissao);
		System.out.println("Data de vencimento: " + dataVencimento);
		System.out.println("Agência: " + agencia);
		System.out.println("*****************************");
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
}
