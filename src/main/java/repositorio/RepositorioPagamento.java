package repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hirataacademia.basicas.Pagamento;

public interface RepositorioPagamento extends JpaRepository<Pagamento, Long> {

}
