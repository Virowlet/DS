package prjInterfaceCalculadora;

public class Divisao implements OperacaoMatematica {

	@Override
	public int calcula(int a, int b) {
		int result = a/b;
		return result;
	}

}
