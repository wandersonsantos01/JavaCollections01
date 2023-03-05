package br.com.binsolution.collections;

public class TestaBuscaAlunoCurso {

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

        int matriculaBusca = 578451;
        System.out.println("Quem é o aluno com matricula " + matriculaBusca + "? ");
        Aluno aluno = javaCollectiions.BuscaMatriculado(matriculaBusca);
        System.out.println("Aluno: " + aluno);
    }

}
