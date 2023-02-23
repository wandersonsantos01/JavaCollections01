package br.com.binsolution.collections;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {
        Curso javaCollectiions = new Curso("Dominando as collections do java", "Paulo Silveira");

//        javaCollectiions.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
        javaCollectiions.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaCollectiions.adiciona(new Aula("Criando uma aula", 20));
        javaCollectiions.adiciona(new Aula("Modelando com collections", 16));

        System.out.println(javaCollectiions.getAulas());


    }
}
