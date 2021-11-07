package nead.ads.pilha;

import nead.ads.lista.Elemento;

public class Pilha implements IPilha{
	private Elemento primeiro;
	private int qtdElementos;
	
	@Override
	public void empilha(int valor) {
		Elemento elemento = new Elemento(valor);
		Elemento auxiliar = null;
		if (primeiro == null) {
			primeiro = elemento;
		}else {
			auxiliar = primeiro;
			primeiro = elemento;
			primeiro.setProximo(auxiliar);
		}
		qtdElementos ++;
		//System.out.println("Empilhando o " + qtdElementos +"º elemento da pilha:" + primeiro.getValorElemento());
		
	}
	@Override
	public void desempilha() {
		if(qtdElementos>0) {
			System.out.println("Desempilhando o " + qtdElementos +"º elemento da pilha:" + primeiro.getValorElemento());
			primeiro = primeiro.getProximo();
			qtdElementos --;
		}else {
			System.out.println("A pilha não tem elemento para desempilhar");
		}
		
	}
	@Override
	public void procura(int valor) {
		Elemento aux = primeiro;
		for(int i=0; i<qtdElementos; i++) {
			if(aux.getValorElemento() == valor) {
				System.out.println("Valor " + valor + " encontrado na prosição " + (i+1) + " da pilha");
				return;
			}
			aux = aux.getProximo();
		}
		System.out.println("Valor " + valor + " não encontrado na pilha");		
	}
	@Override
	public void listaElementos() {
		Elemento aux = primeiro;
		if(qtdElementos>0) {
			for(int i=0; i<qtdElementos; i++) {
				System.out.println("Valor " + aux.getValorElemento() + " na prosição " + (i+1) + " da pilha");
				aux = aux.getProximo();
			}
		}else {
			System.out.println("A pilha não tem elementos para listar");				
		}
	}

	@Override
	public void esvazia() {
	qtdElementos = 0;
	primeiro = null;
		
	}
	
	
	@Override
	public String toString() {
		return "Pilha [primeiro=" + primeiro + ", qtdElementos=" + qtdElementos + "]";
	}


	

	
	
	

}
