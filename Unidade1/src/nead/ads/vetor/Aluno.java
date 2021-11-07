package nead.ads.vetor;

public class Aluno {
	private int codigoAluno;
	private String nomeAluno;
	private int idade; 
	
	public Aluno(int intcodigoAluno, String strnomeAluno, int intidade) {
		super();
		codigoAluno = intcodigoAluno;
		nomeAluno = strnomeAluno;
		idade = intidade;
	}

	public void aniversario() {
		System.out.println("Feliz Aniversario " + this.nomeAluno);
		idade++;
	}
	
	public int getCodigoAluno() {
		return codigoAluno;
	}
	
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	@Override
	public String toString() {
		return "Aluno [codigoAluno=" + codigoAluno + ", nomeAluno=" + nomeAluno + ", idade=" + idade + "]";
	}



}
