package telas;

public class Usuario {
	private int idusuario;
	private String nome;
	private String senha;
	
	public Usuario( String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
	}
	
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
