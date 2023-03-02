package br.com.binsolution.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

    public static void main(String[] args) {
        // NÃO CONSIDERA A ORDEM DE ADIÇÃO
        Set<String> alunos = new HashSet<>();
        alunos.add("João");
        alunos.add("Paulo");
        alunos.add("Maria");
        alunos.add("Pedro");
        alunos.add("Olga");
        alunos.add("Olga");

        for (String aluno : alunos) {
            System.out.println(aluno);
        }
        System.out.println(alunos);

        System.out.println(alunos.size());

        System.out.println(alunos.contains("Olga"));

        alunos.remove("Maria");
        System.out.println(alunos);

        List<String> alunosEmList = new ArrayList<>(alunos);
        String alunoGet = alunosEmList.get(1);
        System.out.println(alunoGet);
    }
}
