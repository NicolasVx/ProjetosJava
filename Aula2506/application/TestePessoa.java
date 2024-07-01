package application;

import entidades.Aluno;
import entidades.Pessoa;
import entidades.Produto;

public class TestePessoa {

	public static void main(String[] args) {
		//criei obj pessoa baseado na classe Pessoa e instanciei
		Pessoa pessoa = new Pessoa();
		Produto produto = new Produto();
		pessoa.setNome("Nicolas Gomes");
		System.out.println(pessoa.getNome());
		
		Aluno aluno = new Aluno();
		aluno.setId("1");
		aluno.setNome("Nicolas");
		aluno.setEmail("nicolas@gmail.com");
		aluno.setCpf("123456789-00");
		aluno.setTel("31 9888777666");
		aluno.setCurso("Tec. Desenv. de Sistemas");
		aluno.setTurma("BHZ231");
		aluno.setTurno("Manhã");
		System.out.println("ID: "+aluno.getId());
		System.out.println("Nome: "+aluno.getNome());
		System.out.println("CPF: "+aluno.getCpf());
		System.out.println("Email: "+aluno.getEmail());
		System.out.println("Telefone: "+aluno.getTel());
		System.out.println("Curso: "+aluno.getCurso());
		System.out.println("Turma: "+aluno.getTurma());
		System.out.println("Turno: "+aluno.getTurno());
		
		
	}

}
