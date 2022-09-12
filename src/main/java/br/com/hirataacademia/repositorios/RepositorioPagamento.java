package br.com.hirataacademia.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hirataacademia.basicas.Pagamento;
@Repository
public interface RepositorioPagamento extends JpaRepository<Pagamento, Long> {

}
