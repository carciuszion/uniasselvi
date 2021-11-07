package nead.ads.vetor;

import nead.ads.Arvore;

public class Testador {

	public static void main(String[] args) {
		
		int x=10;
		/*
		Arvore bananeira = new Arvore("Bananeira", "banana");
		Arvore mangueira = new Arvore("Mangueira", "manga");
		
		bananeira.Aniversario();
		bananeira.Aniversario();
		
		System.out.println(bananeira);
		System.out.println(mangueira);
		
		*/
		x++;
		x=x+1;
		//System.out.println(x);
		
		Arvore[][] matrizDeArvores = new Arvore[3][3];
		matrizDeArvores[0][0] = new Arvore("Bananeira", "banana");
		matrizDeArvores[0][1] = new Arvore("Mangueira", "manga");
		matrizDeArvores[0][2] = new Arvore("Laranjeira", "laranja");
		
		matrizDeArvores[1][0] = new Arvore("Bananeira1", "banana1");
		matrizDeArvores[1][1] = new Arvore("Mangueira1", "manga1");
		matrizDeArvores[1][2] = new Arvore("Laranjeira1", "laranja1");
		
		matrizDeArvores[2][0] = new Arvore("Bananeira2", "banana2");
		matrizDeArvores[2][1] = new Arvore("Mangueira2", "manga2");
		matrizDeArvores[2][2] = new Arvore("Laranjeira2", "laranja2");
		
		if(matrizDeArvores.length<3) {
			System.out.println("O vetor tem menos de Tres elementos");
		}else {
			for(int i=0;i<matrizDeArvores.length;i++) {
				for(int j=0; j<3; j++) {
					System.out.println(matrizDeArvores[i][j].getNomeArvore() + " " + matrizDeArvores[i][j].getFruto());	
				}
				System.out.println("");
			}
		}

	}

}
