package nead.ads.lista;

public class Elemento {
	private int valor;
	private Elemento proximo;
	
	public Elemento(int valor) {
		super();
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
		
	}

	public Elemento getProximo() {
		return proximo;
	}

	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}

	@Override
	public String toString() {
		return "Elemento [valor=" + valor + ", proximo=" + proximo + "]";
	}
	
	
	

}
