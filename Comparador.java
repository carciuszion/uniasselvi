package dominio;

import java.util.Comparator;

public class Comparador {
	//Usando lambyda expressions
    public static final Comparator<Estudante> NOME = (Estudante o1, Estudante o2) -> o1.getNome().compareTo(o2.getNome());
    public static final Comparator<Estudante> EMAIL = (Estudante o1, Estudante o2) -> o1.getEmail().compareTo(o2.getEmail());
    public static final Comparator<Estudante> MATRICULA = (Estudante o1, Estudante o2) -> Integer.compare(o1.getMatricula(), o2.getMatricula());
    public static final Comparator<Estudante> EMAIL2 = (Estudante o1, Estudante o2) -> EMAIL.thenComparing(NOME).compare(o1, o2);
}