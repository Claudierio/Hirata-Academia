package br.com.hirataacademia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hirataacademia.basicas.Endereco;

@Repository
public interface RepositorioEndereco extends JpaRepository<Endereco, Long> {

}
