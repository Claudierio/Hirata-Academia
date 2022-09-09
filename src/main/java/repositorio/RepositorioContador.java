package repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hirataacademia.basicas.Contador;

public interface RepositorioContador extends JpaRepository<Contador, Long>{

}
