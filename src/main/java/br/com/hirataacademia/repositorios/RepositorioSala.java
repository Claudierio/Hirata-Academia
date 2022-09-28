package br.com.hirataacademia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hirataacademia.basicas.Sala;

@Repository
public interface RepositorioSala extends JpaRepository<Sala, Long> {

}
