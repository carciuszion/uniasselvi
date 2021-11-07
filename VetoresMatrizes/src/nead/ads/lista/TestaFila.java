package nead.ads.lista;

public class TestaFila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista lista = new Lista();
		
		lista.adiciona(5);
		lista.adiciona(8);
		lista.adiciona(2);
		lista.adiciona(7);
		lista.procura(10);
		System.out.println(lista);
		//lista.remove();
		//System.out.println(lista);
		lista.esvazia();
		//System.out.println(lista);

	}

}
