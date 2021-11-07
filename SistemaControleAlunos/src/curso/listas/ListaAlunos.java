package curso.listas;

import curso.cadastros.Aluno;

public class ListaAlunos {
	private Aluno topo, base;
    private int qtdElementos=0;

    
    public int getQtdElementos() {
        return qtdElementos;
    }

    public void setQtdElementos(int qtdElementos) {
        this.qtdElementos = qtdElementos;
    }


    public void adiciona(Aluno aluno, Aluno topo) {
    if (base == null){
        base = aluno;
        topo = aluno;
        aluno.setanterior(null);
        aluno.setProximo(null);
    }else{
    	
    	Aluno auxiliar = topo;

		if (aluno.getNome().compareTo(auxiliar.getNome()) < 0) {
			if(auxiliar.getanterior() == null) {
				auxiliar.setanterior(aluno);
				base = aluno;
			}else {
				adiciona(aluno, auxiliar.getanterior());
			}
		}else{
			if(auxiliar.getProximo() == null) {
				auxiliar.setProximo(aluno);
			}else {
				adiciona(aluno, auxiliar.getProximo());
			}
		}
    }
		qtdElementos++;        
    }


    public void esvazia() {
        base = null;
        topo = null;
        qtdElementos = 0;
    }


    public String listaElementos() {
    	if (base==null && topo == null){
            return "Lista vazia";
        }else {
	        String listaElementos = "";
	        Aluno aluno = base;
	        for(int i=0;i<getQtdElementos();i++){
	            listaElementos=listaElementos + "[" + i + " - " + aluno.getNome() + "]" ;
	            if(aluno.getProximo()!=null) aluno = aluno.getProximo();
	        }
	        return (listaElementos);
        }
    }


    public String procura(String cpf) {
        Aluno aluno = base;
        for(int i=0;i<getQtdElementos();i++){
            if( aluno.getCpf() == cpf){
                return ("Aluno " + aluno.getNome() + " encontrado na posição " + i);
            }
            aluno = aluno.getProximo();
        }
        return ("Aluno Não encontrado na lista");
        
    }


    public void remove() {
        base = base.getProximo();
        qtdElementos--;
        
    }

    
    public String toString() {
        if (base==null && topo == null){
            return "Lista vazia";
        }else
        return "Lista [base=" + base.getNome() + ", qtdElementos=" + qtdElementos + ", topo=" + topo.getNome() + "]";
    }


}
