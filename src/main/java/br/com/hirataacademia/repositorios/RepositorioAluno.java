package br.com.hirataacademia.repositorios;

import basicas.Aluno;

import java.util.List;

public interface RepositorioAluno {

    void adicionarAluno(Aluno aluno);
    List<Aluno> listarAlunos();
    Aluno procurarAlunoId(long id);
    Aluno procurarAlunoNome(String nome);
    void atualizarAluno(Aluno aluno);
}
