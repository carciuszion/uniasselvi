package nead.ads.pilha;

public class TestaPilha {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		//pilha.desempilha();
		pilha.empilha(4);
		pilha.empilha(6);
		pilha.empilha(7);
		
		
		pilha.esvazia();
		//pilha.listaElementos();
		//pilha.procura(7);
		System.out.println(pilha);
		pilha.desempilha();
		/*pilha.desempilha();
		pilha.desempilha();
		System.out.println(pilha);
		pilha.listaElementos();*/
		

	}

}
