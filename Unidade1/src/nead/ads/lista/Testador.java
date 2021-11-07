package nead.ads.lista;

public class Testador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista lista = new Lista();
		
		lista.adiciona(5);
		lista.adiciona(7);
		lista.adiciona(9);
		//lista.remove();
		//lista.remove();
		//lista.remove();
		//lista.adiciona(5);
		
		lista.procura(7);
		lista.listaelementos();
		lista.esvazia();
		
		System.out.println(lista);

	}

}
