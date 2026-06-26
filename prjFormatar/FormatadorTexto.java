package prjFormatar;

public class FormatadorTexto {
	
	private String texto;
	private boolean inverter;
	private int repeticoes;

	public FormatadorTexto(String texto) {
		setTexto(texto);
		System.out.println(this.texto.toUpperCase());
	}
	public FormatadorTexto(String texto, boolean inverter) {
		setTexto(texto);
		String invertida = new StringBuilder(this.texto).reverse().toString();
		System.out.println(invertida);
	}
	public FormatadorTexto(String texto, int repeticoes) {
		setTexto(texto);
		setRepeticoes(repeticoes);
		while(this.repeticoes>0) {
			System.out.println(this.texto);
			this.repeticoes--;
		}
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public boolean isInverter() {
		return inverter;
	}

	public void setInverter(boolean inverter) {
		this.inverter = inverter;
	}

	public int getRepeticoes() {
		return repeticoes;
	}

	public void setRepeticoes(int repetições) {
		this.repeticoes = repetições;
	}
	
	//Formatador de texto: pois os parâmetros são tipos diferentes de variáveis(booleano e int), a partir disso é possível identificar a opção correta.

}
