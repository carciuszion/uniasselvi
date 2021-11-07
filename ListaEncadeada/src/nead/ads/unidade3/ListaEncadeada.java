package nead.ads.unidade3;

public class ListaEncadeada implements IListaEncadeada {
	private No primeiro;
	private No ultimo;
	private int intTotalElementos;

	public void adiciona(Object elemento) {
		if(this.intTotalElementos == 0) {
			adicionaNoComeco(elemento);
		}else {
			No novo = new No(elemento);
			this.ultimo.setProximo(novo);
			this.ultimo = novo;
			this.intTotalElementos++;
		}
	}

	public void adicionaNoComeco(Object elemento) {
		No novo = new No(this.primeiro, elemento );
		this.primeiro = novo;
		if(intTotalElementos==0) {
			this.ultimo = this.primeiro;
		}
		this.intTotalElementos++;
	}

	public void adicionaPosicao(int posicao, Object elemento) {
		if(posicao==0){
			this.adicionaNoComeco(elemento);
		}else if (posicao==this.intTotalElementos){
			this.adiciona(elemento);
		}else{
			No anterior = this.pegaNo(posicao-1);
			No novo = new No(anterior.getProximo(),elemento);
			anterior.setProximo(novo);
			this.intTotalElementos++;
		}
	}

	public Object pega( int posicao){
		return this.pegaNo(posicao).getElemento();
	}

	private boolean posicaoOcupada(int posicao){
		return posicao >= 0 && posicao < this.intTotalElementos;
	}

	private No pegaNo(int posicao) {
		if(!this.posicaoOcupada(posicao)){
			throw new IllegalArgumentException("Posição não existe");
		}
		No atual = primeiro;
		for(int i =0; i<posicao;i++){
			atual = atual.getProximo();
		}
		return atual;
	}

	public void removeDoComeco() {
		if(!this.posicaoOcupada(0)){
			System.out.println("Posição não existe");
			return;
		}
		this.primeiro = this.primeiro.getProximo();
		intTotalElementos--;
		if (intTotalElementos == 0 ) ultimo = null;
	}
	public void removeDoFim() {
		if(!this.posicaoOcupada(intTotalElementos-1)){
			System.out.println("Posição não existe");
			return;
		}
		if(this.intTotalElementos==1){
			removeDoComeco();
		}else{
			No anterior = this.pegaNo(intTotalElementos -2);
			No atual = anterior.getProximo();
			anterior.setProximo(atual.getProximo());
			ultimo = atual;
			intTotalElementos--;
		}
	}

	
	public void remove(int posicao) {
		if(!this.posicaoOcupada(posicao)){
			System.out.println("Posição não existe");
			return;
		}
		if(posicao==0){
			removeDoComeco();
		}else if(posicao == (intTotalElementos-1)){
			removeDoFim();
		}else{
			No anterior = this.pegaNo(posicao-1);
			No atual = anterior.getProximo();
			No proximo = atual.getProximo();
			anterior.setProximo(proximo);
			proximo.setAnterior(anterior);
			intTotalElementos--;
			System.out.println("Removendo a pessoa da prosição " + posicao);
		}
		
	}

	public int tamanho() {
		return this.intTotalElementos;
	}

	public boolean contem(Object elemento) {
		No atual = this.primeiro;
		while(atual!=null){
			if(atual.getElemento().equals(elemento)){
				return true;
			}
			atual = atual.getProximo();
		}
		return false;
	}

	
	@Override
	public String toString() {
		//StringBuilder sb = new StringBuilder();
		String sLista = "";
		No temp = primeiro;
		if(intTotalElementos==0) {
			sLista = "A lista está vazia";
		}else {
			for(int i = 0 ; i<intTotalElementos; i++){
				//sb.append(temp.getElemento()+" ");
				sLista+="Elemento " + i + ": " +temp.toString()+ " Proximo:" + ((i==intTotalElementos-1)?"Não tem proximo":temp.getProximo().toString()) + "\n";
				temp = temp.getProximo();
			}
		}
		//return sb.toString();
		return sLista;
	}

	public No getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(No primeiro) {
		this.primeiro = primeiro;
	}

	public No getUltimo() {
		return ultimo;
	}

	public void setUltimo(No ultimo) {
		this.ultimo = ultimo;
	}

	public int getIntTotalElementos() {
		return intTotalElementos;
	}

	public void setIntTotalElementos(int intTotalElementos) {
		this.intTotalElementos = intTotalElementos;
	}
	
}