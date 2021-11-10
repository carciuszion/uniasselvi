package heranca;

public class Comissionado extends Funcionario{
	private double comissao;
	
	public Comissionado(int codigo, String nome,  double salario, double comissao) {
		super(codigo, nome, salario);
		this.comissao = comissao;
		this.salario = salario;
//		this.CalcularSalario();
	}

	@Override
	public void CalcularSalario() {
		this.salario +=  this.comissao;
		
	}

}
