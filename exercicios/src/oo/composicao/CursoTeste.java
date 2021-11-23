package oo.composicao;

public class CursoTeste {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Jo�o");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Matheus");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Orienta��o a Objetos");
        Curso curso3 = new Curso("Python B�sico");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        for(Aluno aluno: curso1.alunos) {
            System.out.println("Estou matriculado no curso 1 " + curso3.nome + "...");
            System.out.println("e o meu nome � " + aluno.nome + ".");
            System.out.println();
        }

        System.out.println(aluno1.cursos.get(0).alunos);

        Curso cursoEncontrado = aluno1.obterCursoNome("Java Completo");

        if (cursoEncontrado != null) {
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }

    }
}
