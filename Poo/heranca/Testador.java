package heranca;

public class Testador {

	public static void main(String[] args) {
		Funcionario horista = new Horista(1, "Jose horista", 800, 200, 3);
		Funcionario comissionado = new Comissionado(2, "joao comissionado", 1000, 500);
		System.out.println(horista.getNome() + " Salario: " + horista.getSalario());
		System.out.println(comissionado.getNome() +  " Salario: " + comissionado.getSalario());
		horista.CalcularSalario();
		comissionado.CalcularSalario();
		System.out.println(horista.getNome() + " Salario: " + horista.getSalario());
		System.out.println(comissionado.getNome() +  " Salario: " + comissionado.getSalario());

	}

}
