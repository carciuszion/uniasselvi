package nead.ads.lista;

public class Lista implements ILista {
	Elemento ultimo, primeiro;
	int qtdElementos;

	@Override
	public void adiciona(int valor) {
		Elemento elemento = new Elemento(valor);
		if (primeiro == null) {
			 primeiro = elemento;
			 ultimo = elemento;
		} else {
			ultimo.setProximo(elemento);
			ultimo = elemento;
		}
		qtdElementos++;
	}

	@Override
	public void remove() {
		System.out.println("O elemento "+ primeiro.getValorElemento() + " foi retirado da lista");
		primeiro = primeiro.getProximo();
		qtdElementos--;


	}

	@Override
	public void procura(int valor) {
		Elemento auxiliar = primeiro;
		for(int i=0; i<this.qtdElementos;i++) {
			if(auxiliar.getValorElemento() == valor) {
				System.out.println("Valor encontrado na posição " + (i+1) + " da lista");
				return;
			}
			auxiliar = auxiliar.getProximo();
		}
		System.out.println("Valor " + valor + " não encontrado na lista");
	

	}

	@Override
	public void lista() {
		// TODO Auto-generated method stub

	}

	@Override
	public void esvazia() {
		primeiro = null;
		ultimo = null;
		qtdElementos = 0;

	}

	@Override
	public String toString() {
		if (primeiro == null) {
			return "A lista está vazia";
		}else {
			return "Lista [primeiro=" + primeiro.getValorElemento() + " ultimo=" + ultimo.getValorElemento() +  ", qtdElementos=" + qtdElementos + "]";			
		}
		
	}
	
	

}
