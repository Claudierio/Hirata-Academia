package repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hirataacademia.basicas.Matricula;

public interface RepositorioMatricula extends JpaRepository<Matricula, Long>{

}
