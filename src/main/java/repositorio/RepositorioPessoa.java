package repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hirataacademia.basicas.Pessoa;

public interface RepositorioPessoa extends JpaRepository<Pessoa, Long> {

}
	