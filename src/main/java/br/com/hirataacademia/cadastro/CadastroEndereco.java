package br.com.hirataacademia.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hirataacademia.basicas.Despesa;
import br.com.hirataacademia.basicas.Endereco;
import br.com.hirataacademia.cadastro.exception.EnderecoNaoEncontradoException;
import br.com.hirataacademia.repositorios.RepositorioEndereco;


@Service
public class CadastroEndereco {
	@Autowired
	private RepositorioEndereco repositorioEndereco;
	public Endereco save(Endereco entity) {
		
		return repositorioEndereco.save(entity);
	}
	
	public List<Endereco> findAll(){
		
		return repositorioEndereco.findAll();
	}
	
	public void deleteById(Long id) {
		repositorioEndereco.deleteById(id);
	}

	public void delete(Endereco entity) {
		repositorioEndereco.delete(entity);
	}
	public Endereco findEnderecoById(Long id) throws EnderecoNaoEncontradoException {
		
		return repositorioEndereco.findById(id).orElseThrow(()-> new EnderecoNaoEncontradoException());
	}
}
