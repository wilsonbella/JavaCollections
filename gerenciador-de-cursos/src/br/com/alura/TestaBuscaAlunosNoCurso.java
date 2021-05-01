package br.com.alura;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		Aluno a1 = new Aluno("Pedro alves", 2541);
		Aluno a2 = new Aluno("Gustavo soares", 1456);
		Aluno a3 = new Aluno("Bruna souza", 8564);
		Aluno a4 = new Aluno("Claudia abreu", 4875);
		Aluno a5 = new Aluno("Luis morais", 4875);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		javaColecoes.matricula(a5);
		
		System.out.println(javaColecoes.getAlunos());
		
		System.out.println("Quem é o aluno com matricula 8564?");
		Aluno aluno = javaColecoes.buscaMatriculado(8563);
		System.out.println("Aluno: " + aluno);
	}
}
