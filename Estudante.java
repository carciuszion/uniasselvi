package dominio;

public class Estudante {
	private int matricula;
	private String nome;
	private String email;
	
		
	public Estudante(int matricula, String nome, String email) {
		this(matricula, nome );
		this.email = email;
	}
	public Estudante(int matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	
	public String getEmail() {
		return email;
	}


}


