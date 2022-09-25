package br.com.hirataacademia.cadastro;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hirataacademia.basicas.Contador;
import br.com.hirataacademia.cadastro.exception.ContadorNaoEncontradoException;
import br.com.hirataacademia.repositorios.RepositorioContador;

@Service
public class CadastroContador {
	@Autowired
	private RepositorioContador repositorioContador;

	public Contador save(Contador entity) {

		return repositorioContador.save(entity);
	}

	public List<Contador> findAll() {

		return repositorioContador.findAll();
	}

	public void deleteById(Long id) {
		repositorioContador.deleteById(id);
	}

	public void delete(Contador entity) {
		repositorioContador.delete(entity);
	}
	
	public Contador findContadorById(long id) {
		return repositorioContador.findById(id).orElseThrow(()-> new ContadorNaoEncontradoException());
	}

	
}
