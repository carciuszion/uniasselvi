package nead.ads.unidade3;

public class PessoaLista {
	private String nome;
	private String sobrenome;
	private Double peso;
	private PessoaLista prox;
	
	
	public PessoaLista(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome ;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return  sobrenome;
	}
	public void setSobreNome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public PessoaLista getProx() {
		return prox;
	}
	public void setProx(PessoaLista prox) {
		this.prox = prox;
	}
	@Override

	public String toString() {
		return "[nome=" + getNome() + "]";
	}

	

}
