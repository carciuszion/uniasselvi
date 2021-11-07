package curso.cadastros;

public class Aluno {
	private String cpf;
	private String nome;
	private String endereco;
	private String email;
	private String Telefone;
	private Curso curso;
	private Turma turma;
	private Boolean removido;
	private  Aluno proximo;
	private  Aluno anterior;

	public Aluno(String cpf, String nome, String endereco, String email, String telefone, Curso curso) {
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		Telefone = telefone;
		this.curso = curso;
	}
	
	public Aluno getanterior() {
        return anterior;
    }
    public void setanterior(Aluno anterior) {
        this.anterior = anterior;
    }
    
	public Aluno getProximo() {
        return proximo;
    }
    public void setProximo(Aluno proximo) {
        this.proximo = proximo;
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
		return "Alunos [cpf=" + cpf + ", nome=" + nome + ", endereco=" + endereco + ", email=" + email + ", Telefone="
				+ Telefone + ", curso=" + curso.getNomeCurso() + ((turma==null)? "" :", turma=" + turma.getNomeTurma()) + ", removido=" + removido + "]";
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
		System.out.println("Adicionado na " + turma.getNomeTurma() + " com sucesso");
	}

	
}
