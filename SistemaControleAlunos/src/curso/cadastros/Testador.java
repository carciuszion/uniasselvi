package curso.cadastros;

import curso.listas.ListaAlunos;

public class Testador {

	public static void main(String[] args) {

		Curso matematica = new Curso("Matemática", "Exatas");
		Curso cursohist = new Curso("História", "Humanas");
		System.out.println(matematica.getAreaCurso());
		System.out.println(matematica.getNomeCurso());
		Aluno aluno = new Aluno("52896762320", "João", "Rua 10, casa 20 cohab", "joao@gmail.com", "981977722" , matematica  );
		Aluno aluno2 = new Aluno("12345678900", "Jose", "Rua 1, casa 02 cohab", "jose@gmail.com", "981977722" , matematica  );
		Aluno aluno3 = new Aluno("02456979798", "Maria", "Rua 1, casa 02 cohab", "jose@gmail.com", "981977722" , cursohist  );
		Professor prof = new Professor("12345678900", "Jose", "Rua 1, casa 02 cohab", "jose@gmail.com", "981977722" , cursohist  );
		Turma turma1 = new Turma(1, "Turma1", matematica, prof);
		System.out.println(aluno);
		System.out.println(aluno2);
		System.out.println(prof);
		System.out.println(turma1);
		
		aluno.setTurma(turma1);
		System.out.println(aluno);
		ListaAlunos lista = new ListaAlunos();
		/*lista.adiciona(aluno);
		lista.adiciona(aluno2);
		lista.adiciona(aluno3);*/	
		System.out.println(lista.listaElementos());

	}

}
