package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {
	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		Aluno a1 = new Aluno("Pedro alves", 2541);
		Aluno a2 = new Aluno("Gustavo soares", 1456);
		Aluno a3 = new Aluno("Bruna souza", 8564);
		Aluno a4 = new Aluno("Claudia abreu", 4875);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		System.out.println("Todos os alunos matriculados: ");

		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();

		while (iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}

//		javaColecoes.getAlunos().forEach(a -> {
//			System.out.println(a);

		// });
		System.out.println("O aluno " + a1 + "está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a4));

		Aluno pedro = new Aluno("Pedro alves", 2541);
		System.out.println("E esse Pedro está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(pedro));

		System.out.println("O a1 equals pedro?");
		System.out.println(a1.equals(pedro));
		// obrigatóriamente o seguinte é true:
		System.out.println(a1.hashCode() == pedro.hashCode());
	}

}
