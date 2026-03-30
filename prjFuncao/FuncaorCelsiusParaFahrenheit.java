import java.util.Scanner;

public class FuncaorCelsiusParaFahrenheit {

    public static double converterCelsiusParaFahrenheit(double c){
    	return (c*1.8)+32;
    }

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double f;
		
		System.out.println("Insira uma temperatura em graus Celsius: ");
		double c = ler.nextDouble();
		f = converterCelsiusParaFahrenheit(c);
		
		System.out.println("Fahrenheit: "+f);
	}

}