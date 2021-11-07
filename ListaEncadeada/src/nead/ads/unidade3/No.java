package nead.ads.unidade3;

public class No {
	private No proximo;
	private No anterior;
	private Object elemento;
	
	public No(No proximo, Object elemento) {
		this.proximo = proximo;
		this.elemento = elemento;
	}
	
	public No(Object elemento) {
		this.elemento = elemento;
	}
	
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

	
	public No getAnterior() {
		return anterior;
	}
	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}
	public Object getElemento() {
		return elemento;
	}
	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}
	@Override
	public String toString() {
		return  elemento.toString() ;
	}
	
	
	

}
