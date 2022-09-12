package br.com.hirataacademia.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hirataacademia.basicas.Sala;
import br.com.hirataacademia.repositorios.RepositorioSala;
@Service
public class CadastroSala {
	@Autowired
	private RepositorioSala repositorioSala;
	public Sala save(Sala entity) {
		
		return repositorioSala.save(entity);
	}
	
	public List<Sala> findAll(){
		
		return repositorioSala.findAll();
	}
	
	public void deleteById(Long id) {
		repositorioSala.deleteById(id);
	}

	public void delete(Sala entity) {
		repositorioSala.delete(entity);
	}
}
