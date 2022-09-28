package br.com.hirataacademia.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hirataacademia.basicas.Endereco;
import br.com.hirataacademia.basicas.Modalidade;
import br.com.hirataacademia.cadastro.exception.EnderecoNaoEncontradoException;
import br.com.hirataacademia.cadastro.exception.ModalidadeNaoEncontradaException;
import br.com.hirataacademia.repositorios.RepositorioModalidade;
@Service
public class CadastroModalidade {
	@Autowired
	private RepositorioModalidade repositorioModalidade;
	public Modalidade save(Modalidade entity) {
		
		return repositorioModalidade.save(entity);
	}
	
	public List<Modalidade> findAll(){
		
		return repositorioModalidade.findAll();
	}
	
	public void deleteById(Long id) {
		repositorioModalidade.deleteById(id);
	}

	public void delete(Modalidade entity) {
		repositorioModalidade.delete(entity);
	}
	public Modalidade findModalidadeById(Long id) throws ModalidadeNaoEncontradaException{
		
		return repositorioModalidade.findById(id).orElseThrow(()-> new ModalidadeNaoEncontradaException());
	}
}
