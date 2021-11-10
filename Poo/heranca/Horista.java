package heranca;

public class Horista  extends Funcionario{
	private int horas ;
	private double valorHora;
	
	
	
	
	public Horista(int codigo, String nome, double salario,  int horas, double valorHora) {
		super(codigo, nome, salario);
		this.horas = horas;
		this.valorHora = valorHora;
//		this.CalcularSalario();
	}

	@Override
	public void CalcularSalario() {
		this.salario += (this.horas * this.valorHora);
	}
	
	
}

