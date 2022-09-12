package br.com.hirataacademia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hirataacademia.basicas.Modalidade;
@Repository
public interface RepositorioModalidade extends JpaRepository<Modalidade, Long>{

}
