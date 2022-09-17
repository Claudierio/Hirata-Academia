package br.com.hirataacademia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hirataacademia.basicas.FichadeTreino;

@Repository
public interface RepositorioFichadeTreino extends JpaRepository<FichadeTreino, Long>{

}
