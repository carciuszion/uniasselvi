package dominio;

public class Testador {

	public static void main(String[] args) {
		Estudante e1 = new Estudante(1, "Jose");
		Estudante maria = new Estudante(2, "Maria Helena");
		Estudante e3 = new Estudante(3, "Maria jose", "maria.gmail.com");
		e1.setNome("Joao");
		
		System.out.println("O nome do estudate 1 é " + e1.getNome());
		System.out.println("O nome do estudate 2 é " + maria.getNome());
		System.out.println(e3.getNome() + " " + e3.getEmail());
	}

}
