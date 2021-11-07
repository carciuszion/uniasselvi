package nead.ads.vetor;

public class Testador {

	public static void main(String[] args) {
		// Vetores
		Aluno[] vetorDeAlunos = new Aluno[3];
		vetorDeAlunos[0] = new Aluno(1, "Jose",0);
		vetorDeAlunos[1] = new Aluno(5, "Joao",0);
		vetorDeAlunos[2] = new Aluno(3, "Maria",0);
		Aluno aluno = new Aluno(0, "Carcius",20);
		System.out.println(aluno);
		for (int i = 0; i < vetorDeAlunos.length; i++) {
			System.out.println(vetorDeAlunos[i]);
		}
		
		aluno.setNomeAluno("Raimundo");
		
		aluno.aniversario();
		
		System.out.println(aluno);
		
		System.out.println(aluno.getNomeAluno());
		
		// Matrizes
		Aluno[][] matrizDeAlunos = new Aluno[3][3];
		matrizDeAlunos[0][0] = new Aluno(1, "Jose1",0);
		matrizDeAlunos[0][1] = new Aluno(5, "Joao1",0);
		matrizDeAlunos[0][2] = new Aluno(3, "Maria1",0);
		matrizDeAlunos[1][0] = new Aluno(1, "Jose2",0);
		matrizDeAlunos[1][1] = new Aluno(5, "Joao2",0);
		matrizDeAlunos[1][2] = new Aluno(3, "Maria2",0);
		matrizDeAlunos[2][0] = new Aluno(1, "Jose3",0);
		matrizDeAlunos[2][1] = new Aluno(5, "Joao3",0);
		matrizDeAlunos[2][2] = new Aluno(3, "Maria3",0);

		//Aluno aluno = new Aluno(0, "Carcius");
		// System.out.println(aluno);
		System.out.println("");
		for (int i = 0; i < matrizDeAlunos.length; i++) {
			for(int j=0; j<matrizDeAlunos.length; j++) {
				System.out.println(matrizDeAlunos[i][j]);	
			}
			System.out.println("");
		}

	
	
	}

}
