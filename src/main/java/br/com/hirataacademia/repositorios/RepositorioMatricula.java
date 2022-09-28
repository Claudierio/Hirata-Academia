package br.com.hirataacademia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hirataacademia.basicas.Matricula;

@Repository
public interface RepositorioMatricula extends JpaRepository<Matricula, Long> {

}
