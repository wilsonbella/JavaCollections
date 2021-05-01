package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class QualColecaoUsar {
	public static void main(String[] args) {
		Collection<Aluno> alunos = new HashSet<Aluno>();
		Aluno a1 = new Aluno("André", 2365);
		alunos.add(a1);
		alunos.size();
	}

}
