package br.com.hirataacademia.repositorios;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.hirataacademia.basicas.Despesa;
import br.com.hirataacademia.basicas.Pagamento;

@Repository
public interface RepositorioDespesa extends JpaRepository<Despesa, Long>{
	
	@Query("select p from Despesa p where p.data >= :inicio and p.data <= :fim")
	public List<Despesa> listarDespesaPorIntervalo(@Param("inicio") Date inicio, @Param("fim") Date fim);
}
