package br.com.hirataacademia.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hirataacademia.basicas.Matricula;
import br.com.hirataacademia.repositorios.RepositorioMatricula;
@Service
public class CadastroMatricula {
	@Autowired
	private RepositorioMatricula repositorioMatricula;
	public Matricula save(Matricula entity) {
		
		return repositorioMatricula.save(entity);
	}
	
	public List<Matricula> findAll(){
		
		return repositorioMatricula.findAll();
	}
	
	public void deleteById(Long id) {
		repositorioMatricula.deleteById(id);
	}

	public void delete(Matricula entity) {
		repositorioMatricula.delete(entity);
	}
}
