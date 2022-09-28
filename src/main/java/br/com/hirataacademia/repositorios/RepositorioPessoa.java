package br.com.hirataacademia.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.hirataacademia.basicas.Aluno;
import br.com.hirataacademia.basicas.Pessoa;

@Repository
public interface RepositorioPessoa extends JpaRepository<Pessoa, Long> {
	// @Query("SELECT obj FROM aluno obj")
	// public List<Aluno> findAllAlunos();

}
