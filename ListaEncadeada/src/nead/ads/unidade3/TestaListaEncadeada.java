package nead.ads.unidade3;

public class TestaListaEncadeada {

	public static void main(String[] args) {
		PessoaLista pe0 = new PessoaLista("0.Carcius");
		PessoaLista pe1 = new PessoaLista("1.Jacinto");
		PessoaLista pe2 = new PessoaLista("2.jose");
		pe0.setSobreNome("Silva");
		pe1.setSobreNome("Souza");
		pe2.setSobreNome("Santos");
		
		ListaEncadeada le = new ListaEncadeada();
		
		le.adiciona(pe0);
		le.adicionaNoComeco(pe1);
		
		System.out.println(le);
		
		le.adicionaPosicao(1, pe2);
		
		System.out.println(le);
		
		//le.remove(1);
		
		System.out.println(le.contem(pe2));
		System.out.println(le);
		
		PessoaLista pe3 = ((PessoaLista)le.pega(2));
		System.out.println("Pegou " + pe3.toString());	

//		le.remove(1);	
		System.out.println(le);
//		le.removeDoComeco();

		System.out.println(le);

//		le.removeDoFim();

		System.out.println(le);

		System.out.println("A lista tem " + le.tamanho() + " elemento" + ((le.tamanho()==1)?"":"s"));
		System.out.println(pe1.getNome()  + (le.contem(pe1)?"": " Não") + " está na lista");
		

	}

}
