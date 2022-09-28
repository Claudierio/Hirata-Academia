package br.com.hirataacademia.repositorios;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.hirataacademia.basicas.Pagamento;

@Repository
public interface RepositorioPagamento extends JpaRepository<Pagamento, Long> {

	@Query("select p from Pagamento p where p.dataPagamento >= :inicio and p.dataPagamento <= :fim")
	public List<Pagamento> listarPagamentoPorIntervalo(@Param("inicio") Date inicio, @Param("fim") Date fim);

}
