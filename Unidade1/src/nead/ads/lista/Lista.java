package nead.ads.lista;

public class Lista implements ILista{
	Elemento topo, base;
	int qtdElementos;

	@Override
	public void adiciona(int valor) {
		Elemento elemento = new Elemento(valor);
		if(base == null) {
			topo = elemento;
			base = elemento;
		}else{
			topo.setProximo(elemento);
			topo = elemento;
		}
		qtdElementos++;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		base=base.getProximo();
		qtdElementos--;
		
	}

	@Override
	public void procura(int valor) {
		// TODO Auto-generated method stub
		Elemento auxiliar = base;
		for(int i=0; i< qtdElementos; i++ ) {
			if (auxiliar.getValor()==valor) {
				System.out.println("Valor " + valor + " encontrado na posição " + (i+1));
				return;
			}
			auxiliar = auxiliar.getProximo();
		}
		System.out.println("Valor não encontrado na lista");
	}

	@Override
	public void listaelementos() {
		Elemento auxiliar = base;
		for(int i=0; i< qtdElementos; i++ ) {
			System.out.println("Valor da posicao " + (i+1) + ": " + auxiliar.getValor());
			auxiliar = auxiliar.getProximo();
		}
	}

	@Override
	public String esvazia() {
		base=null;
		topo=null;
		qtdElementos = 0;
		return null;
	}

	@Override
	public String toString() {
		if(this.qtdElementos == 0) {
			return "A lista esta vazia";
		}else {
			return "Lista [topo=" + topo.getValor() + ", base=" + base.getValor() + ", qtdElementos=" + qtdElementos + "]";
		}
	}
	
	

}
