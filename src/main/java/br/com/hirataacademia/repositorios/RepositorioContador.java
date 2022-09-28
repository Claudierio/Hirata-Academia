package br.com.hirataacademia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hirataacademia.basicas.Contador;

@Repository
public interface RepositorioContador extends JpaRepository<Contador, Long> {

}
