package entidades;

public class Aluno extends Pessoa {
	private String curso;
	private String turma;
	private String turno;
	public Aluno( ) {
		super();
		curso = null;
		turma = null;
		turno = null;
	}
	
	public Aluno(String id, String nome, String email, String tel, String cpf, String curso, String turma, String turno) {
		super(id, nome, email, tel, cpf);
		this.curso = curso;
		this.turma = turma;
		this.turno = turno;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", turma=" + turma + ", turno=" + turno + "]";
	}
	
	
	

}
