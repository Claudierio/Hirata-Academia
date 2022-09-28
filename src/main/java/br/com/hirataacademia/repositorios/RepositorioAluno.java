package br.com.hirataacademia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hirataacademia.basicas.Aluno;

@Repository
public interface RepositorioAluno extends JpaRepository<Aluno, Long> {

}
