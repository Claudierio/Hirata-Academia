package br.com.hirataacademia.repositorios;

import basicas.Aluno;

import java.util.ArrayList;
import java.util.List;

public class RepositorioAlunoArrayList implements RepositorioAluno{

    private List<Aluno> alunos;

    public RepositorioAlunoArrayList(){
        this.alunos = new ArrayList<Aluno>();
    }


    @Override
    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    @Override
    public List<Aluno> listarAlunos() {
        return this.alunos;
    }

    @Override
    public Aluno procurarAlunoId(long id) {
        for (Aluno a : this.alunos){
            if (a.getIdAluno()==id){
                return a;
            }
        }
        return null;
    }

    @Override
    public Aluno procurarAlunoNome(String nome) {
        for (Aluno a : this.alunos){
            if (a.getNome().equals(nome)){
                return a;
            }
        }
        return null;
    }

    @Override
    public void atualizarAluno(Aluno aluno) {
        this.alunos.remove(aluno);
        this.alunos.add(aluno);
    }
}
