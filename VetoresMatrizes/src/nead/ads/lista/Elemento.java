package nead.ads.lista;

public class Elemento {
	private Elemento proximo;
	private int valorElemento ;
	
	
	public Elemento(int valorElemento) {
		this.valorElemento = valorElemento;
	}
	
	public Elemento getProximo() {
		return proximo;
	}
	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}
	public int getValorElemento() {
		return valorElemento;
	}
	public void setValorElemento(int valorElemento) {
		this.valorElemento = valorElemento;
	}
	
	

}
