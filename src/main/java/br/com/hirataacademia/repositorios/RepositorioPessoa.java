package br.com.hirataacademia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hirataacademia.basicas.Pessoa;
@Repository
public interface RepositorioPessoa extends JpaRepository<Pessoa, Long> {

}
	