package br.com.binsolution.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {

    private String nome;
    private String instrutor;
    //    private List<Aula> aulas = new LinkedList<>();
    private List<Aula> aulas = new ArrayList<Aula>();

    /**
     * DIFERENÇA ENTRE ArrayList E LinkedList - Basicamente performance
     * ArrayList é mais rápida quando estática
     * LinkedList é mais rápida para alterar elementos
     *
     * @return
     */

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    public int getTempoTotal() {
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", instrutor='" + instrutor + '\'' +
                ", tempoTotal='" + this.getTempoTotal() + '\'' +
                ", aulas=" + aulas +
                '}';
    }
}
