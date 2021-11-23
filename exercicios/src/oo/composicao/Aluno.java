package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    final String nome;

    final List<Curso> cursos = new ArrayList<>(); // Sempre apontará para o mesmo end de memória.

    public Aluno(String nome) {
        this.nome = nome;
    }

    Curso obterCursoNome(String nome) {
        for(Curso curso: this.cursos) {
            if(curso.nome.equalsIgnoreCase(nome)) {
                return curso;
            }
        }
        return null;
    }

    void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    public String toString() {
        return nome;
    }
}
