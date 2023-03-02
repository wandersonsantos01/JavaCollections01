package br.com.binsolution.collections;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    //    private List<Aula> aulas = new LinkedList<>();
    private List<Aula> aulas = new ArrayList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();
//    private Set<Aluno> alunos = new LinkedHashSet<>();
//    private Set<Aluno> alunos = new TreeSet<>();

    /**
     * DIFERENÇA ENTRE ArrayList E LinkedList - Basicamente performance
     * ArrayList é mais rápida quando estática
     * LinkedList é mais rápida para alterar elementos
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

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
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

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }
}
