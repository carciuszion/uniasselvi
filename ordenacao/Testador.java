package ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Testador {

	public static void main(String[] args) {
		Estudante e1 = new Estudante(1, "CJose Maria", "jose.gmail.com");
		Estudante e2 = new Estudante(3, "BSara Helena", "sara.gmail");
		Estudante e3 = new Estudante(2, "ARaimundo jose", "maria.gmail.com");
		Estudante e4 = new Estudante(4, "ARaimundo jose", "raimundo.gmail.com");		
		
		List<Estudante> lista = new ArrayList<Estudante>();
		lista.add(e1);
		lista.add(e2);
		lista.add(e3);
		lista.add(e4);
		
		
		imprimeLista(lista, "NOME");
		imprimeLista(lista, "MATRICULA");
		imprimeLista(lista, "MATRICULA2"); //imprime por ordem reversa da matricula
		imprimeLista(lista, "EMAIL");
		imprimeLista(lista, "EMAIL2");

	}

	private static void imprimeLista(List<Estudante> lista, String ordem) {
		if (ordem == "NOME") {
			Collections.sort(lista, Comparador.NOME);
		}else if(ordem == "MATRICULA") {
			lista.sort((o1, o2)->o1.getMatricula()-o2.getMatricula()); //usando lambyda expressions-
		}else if(ordem == "MATRICULA2") {
			Collections.sort(lista, Collections.reverseOrder(new ProviderCodigo())); //usando o provider e ordem reversa
		}else if(ordem == "EMAIL") {
			Collections.sort(lista, Comparador.EMAIL );
		}else if(ordem == "EMAIL2") {
			Collections.sort(lista, Collections.reverseOrder(Comparador.EMAIL ));			
		}
		
		System.out.println("Ordenando por " + ordem);
		for (Estudante estudante : lista) {
			System.out.println(estudante.getMatricula() + " " + estudante.getNome() + " " + estudante.getEmail());
		}	
		System.out.println("");
	}
	
}
