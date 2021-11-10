package heranca;

public abstract class Funcionario {
	protected int codigo;
	protected String nome;
	protected double salario;
	
	
	
	public Funcionario(int codigo, String nome, double salario) {
		this.codigo = codigo;
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	
	public abstract void CalcularSalario();
	
	public int getCodigo() {
		return codigo;
	}
	
	
	
	
	
}

