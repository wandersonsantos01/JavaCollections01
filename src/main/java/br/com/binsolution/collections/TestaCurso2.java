package br.com.binsolution.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {
        Curso javaCollectiions = new Curso("Dominando as collections do java", "Paulo Silveira");

        javaCollectiions.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaCollectiions.adiciona(new Aula("Criando uma aula", 20));
        javaCollectiions.adiciona(new Aula("Modelando com collections", 16));

        List<Aula> aulasImutaveis = javaCollectiions.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);
        System.out.println(aulas);

        System.out.println(javaCollectiions.getTempoTotal());

        System.out.println(javaCollectiions.toString());

    }
}
