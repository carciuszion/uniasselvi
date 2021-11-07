package curso.listas;

import curso.cadastros.Aluno;
import curso.cadastros.Curso;

public class TestaListas {

	public static void main(String[] args) {
		
		Curso matematica = new Curso("Matemática", "Exatas");
		Curso cursohist = new Curso("História", "Humanas");
		System.out.println(matematica.getAreaCurso());
		System.out.println(matematica.getNomeCurso());
		Aluno aluno1 = new Aluno("52896762320", "joao", "Rua 10, casa 20 cohab", "joao@gmail.com", "981977722" , matematica  );
		Aluno aluno2 = new Aluno("12345678900", "Jose", "Rua 1, casa 02 cohab", "jose@gmail.com", "981977722" , matematica  );
		Aluno aluno3 = new Aluno("02456979798", "Maria", "Rua 1, casa 02 cohab", "maria@gmail.com", "981977722" , cursohist  );
		Aluno aluno4 = new Aluno("85258255644", "Roberto", "Rua 1, casa 02 cohab", "roberto@gmail.com", "981977722" , cursohist  );
		
		ListaAlunos lista = new ListaAlunos();
		lista.adiciona(aluno1, null);
		//System.out.println(lista.listaElementos());
		lista.adiciona(aluno2, aluno1);
		/*System.out.println(lista.listaElementos());
		lista.adiciona(aluno3, aluno1);
		System.out.println(lista.listaElementos());
		lista.adiciona(aluno4,aluno1);
		System.out.println(lista.listaElementos());
		System.out.println(lista);
		System.out.println(aluno1.getProximo());
		//lista.remove();
		//System.out.println(lista.listaElementos());
		//System.out.println(lista.procura("12345678900"));
		lista.esvazia();
		System.out.println(lista);*/
	}

}
