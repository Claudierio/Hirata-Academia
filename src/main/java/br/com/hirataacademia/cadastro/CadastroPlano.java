package br.com.hirataacademia.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hirataacademia.basicas.Plano;
import br.com.hirataacademia.cadastro.exception.PlanoNaoEncontradoException;
import br.com.hirataacademia.repositorios.RepositorioPlano;
@Service
public class CadastroPlano {
	@Autowired
	private RepositorioPlano repositorioPlano;
	public Plano save(Plano entity) {
		
		return repositorioPlano.save(entity);
	}
	
	public List<Plano> findAll(){
		
		return repositorioPlano.findAll();
	}
	
	public void deleteById(Long id) {
		repositorioPlano.deleteById(id);
	}

	public void delete(Plano entity) {
		repositorioPlano.delete(entity);
	}	
	public Plano findPlanoById(Long id) throws PlanoNaoEncontradoException{
		
		return repositorioPlano.findById(id).orElseThrow(()-> new PlanoNaoEncontradoException());
	}
}
