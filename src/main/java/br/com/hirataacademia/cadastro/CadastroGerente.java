package br.com.hirataacademia.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hirataacademia.basicas.Gerente;
import br.com.hirataacademia.cadastro.exception.GerenteNaoEncontradoException;
import br.com.hirataacademia.repositorios.RepositorioGerente;
@Service
public class CadastroGerente {
	@Autowired
	private RepositorioGerente repositorioGerente;
	
	public Gerente save(Gerente entity) {
		return repositorioGerente.save(entity);
	}
	
	
	public List<Gerente> findAll(){
		return repositorioGerente.findAll();
		}
	
	public void deleteById(Long id) {
		repositorioGerente.deleteById(id);
	}
	
	public void delete(Gerente entity) {
		repositorioGerente.delete(entity);
	}
	
	public Gerente findGerenteById(Long id) throws GerenteNaoEncontradoException {
		return repositorioGerente.findById(id).orElseThrow(()-> new GerenteNaoEncontradoException());
	}
}
