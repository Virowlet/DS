package prjInterfaceCalculadora;

public class Subtracao implements OperacaoMatematica {

	@Override
	public int calcula(int a, int b) {
		int result = a - b;
		return result;
	}

}
