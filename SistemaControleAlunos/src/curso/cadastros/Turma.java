package curso.cadastros;

public class Turma {
	private int codTurma;
	private String NomeTurma;
	private Curso curso ;
	private Professor professor;
	private Boolean removido;
	public Turma(int codTurma, String nomeTurma, Curso curso, Professor professor) {
		this.codTurma = codTurma;
		NomeTurma = nomeTurma;
		this.curso = curso;
		this.professor = professor;
	}
	public int getCodTurma() {
		return codTurma;
	}
	public void setCodTurma(int codTurma) {
		this.codTurma = codTurma;
	}
	public String getNomeTurma() {
		return NomeTurma;
	}
	public void setNomeTurma(String nomeTurma) {
		NomeTurma = nomeTurma;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Boolean getRemovido() {
		return removido;
	}
	public void setRemovido(Boolean removido) {
		this.removido = removido;
	}
	@Override
	public String toString() {
		return "Turma [codTurma=" + codTurma + ", NomeTurma=" + NomeTurma + ", curso=" + curso.getNomeCurso() + ", professor="
				+ professor.getNome() + ", removido=" + removido + "]";
	}
	
	

}
