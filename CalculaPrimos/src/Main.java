
public class Main {

	public static void main(String[] args) {

		// imprime os 100 primeiros numeros primos
String numerosPrimos="" ;
int contador=0, numero=1;
		while (contador < 100) {
			if (numeroPrimo(numero) == true) {
				numerosPrimos = numerosPrimos + "-" + numero;
				contador++;
				if(contador % 10 == 0) numerosPrimos = numerosPrimos + "\n";
			}
			numero++;
		}
		System.out.println("Total de primos " + contador);
		System.out.println(numerosPrimos);
	}

	private static Boolean numeroPrimo(int numero) {
		Boolean ehnumeroPrimo = true;
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				ehnumeroPrimo = false;
			}
		}
		return ehnumeroPrimo;
	}

}
