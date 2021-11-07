package curso.cadastros;

public class Professor {
	private String cpf;
	private String nome;
	private String endereco;
	private String email;
	private String Telefone;
	private Curso curso;
	private Boolean removido;
	public Professor(String cpf, String nome, String endereco, String email, String telefone, Curso curso) {
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		Telefone = telefone;
		this.curso = curso;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public boolean getRemovido() {
		return removido;
	}
	public void setRemovido(boolean removido) {
		this.removido = removido;
	}
	@Override
	public String toString() {
		return "Professor [cpf=" + cpf + ", nome=" + nome + ", endereco=" + endereco + ", email=" + email
				+ ", Telefone=" + Telefone + ", curso=" + curso.getNomeCurso() + ", removido=" + removido + "]";
	}
	
	
}
