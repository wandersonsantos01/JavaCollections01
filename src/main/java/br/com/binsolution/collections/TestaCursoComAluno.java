package br.com.binsolution.collections;

import java.util.Set;
import java.util.Iterator;

public class TestaCursoComAluno {

    public static void main(String[] args) {
        Curso javaCollectiions = new Curso("Dominando as collections do java", "Paulo Silveira");

        javaCollectiions.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaCollectiions.adiciona(new Aula("Criando uma aula", 20));
        javaCollectiions.adiciona(new Aula("Modelando com collections", 16));

        Aluno a1 = new Aluno("Elon", 12356);
        Aluno a2 = new Aluno("Bill", 57845);
        Aluno a3 = new Aluno("Michael", 13354);

        javaCollectiions.matricula(a1);
        javaCollectiions.matricula(a2);
        javaCollectiions.matricula(a3);

        javaCollectiions.getAlunos().forEach(a -> {
            System.out.println(a);
        });

        System.out.println("O aluno está matriculado: ");
        System.out.println(javaCollectiions.estaMatriculado(a1));

        Aluno elon = new Aluno("Elon", 123456);
        System.out.println("Musk está matriculado? ");
        System.out.println(javaCollectiions.estaMatriculado(elon));

        System.out.println("Musk é igual a1? ");
        System.out.println(a1.equals(elon));

        System.out.println(a1.hashCode() == elon.hashCode());

        Set<Aluno> alunos = javaCollectiions.getAlunos();
        Iterator<Aluno> iterator = alunos.iterator();
        while (iterator.hasNext()) {
            Aluno proximo = iterator.next();
            System.out.println(proximo);
        }


    }
}
