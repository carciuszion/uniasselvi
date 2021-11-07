package nead.ads.unidade3;

public interface IListaEncadeada {
	public void adiciona(Object elemento);
	public void adicionaNoComeco(Object elemento);
	public void adicionaPosicao(int posicao, Object elemento);
	public Object pega( int posicao);
	public void removeDoComeco();
	public void removeDoFim();
	public void remove(int posicao);
	public int tamanho();
	public boolean contem(Object elemento);

}
