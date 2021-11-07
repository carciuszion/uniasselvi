package nead.ads;

public class Arvore {
	private String nomeArvore;
	private String fruto;
	private int qtdFrutos;
	private int qtdFolhas;
	private int idade;
	
		
	public Arvore(String nomeArvore, String fruto) {
		this.nomeArvore = nomeArvore;
		this.fruto = fruto;
		this.setIdade(0);
		this.setQtdFolhas(0);
		this.setQtdFrutos(0);
	}
	
	public void Aniversario() {
		idade ++;
		setQtdFolhas(qtdFolhas+100);
		setQtdFrutos(qtdFrutos+20);
		System.out.println("Feliz aniverário " + this.getNomeArvore() + " você completou " + getIdade() + " ano" + (idade>1?"s":""));
	}
	
	public String getNomeArvore() {
		return nomeArvore;
	}
	public void setNomeArvore(String nomeArvore) {
		this.nomeArvore = nomeArvore;
	}
	public String getFruto() {
		return fruto;
	}
	public void setFruto(String fruto) {
		this.fruto = fruto;
	}
	public int getQtdFrutos() {
		return qtdFrutos;
	}
	public void setQtdFrutos(int qtdFrutos) {
		this.qtdFrutos = qtdFrutos;
	}
	public int getQtdFolhas() {
		return qtdFolhas;
	}
	public void setQtdFolhas(int qtdFolhas) {
		this.qtdFolhas = qtdFolhas;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Arvore [nomeArvore=" + nomeArvore + ", fruto=" + fruto + ", qtdFrutos=" + qtdFrutos + ", qtdFolhas="
				+ qtdFolhas + ", idade=" + idade + "]";
	}
	
	

}
