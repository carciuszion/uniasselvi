package curso.cadastros;

public class Curso {
	private int codCurso;
	private String NomeCurso;
	private String AreaCurso;
	private boolean removido;
	
	
	
	public Curso(String nomeCurso, String areaCurso) {
		NomeCurso = nomeCurso;
		AreaCurso = areaCurso;
	}
	public int getCodCurso() {
		return codCurso;
	}
	public void setCodCurso(int codCurso) {
		this.codCurso = codCurso;
	}
	public String getNomeCurso() {
		return NomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		NomeCurso = nomeCurso;
	}
	public String getAreaCurso() {
		return AreaCurso;
	}
	public void setAreaCurso(String areaCurso) {
		AreaCurso = areaCurso;
	}
	public boolean getRemovido() {
		return removido;
	}
	public void setRemovido(boolean removido) {
		this.removido = removido;
	}

	
	
}
