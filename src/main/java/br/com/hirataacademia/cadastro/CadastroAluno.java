package br.com.hirataacademia.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hirataacademia.basicas.Aluno;
import br.com.hirataacademia.repositorios.RepositorioAluno;

@Service
public class CadastroAluno {
	@Autowired
	private RepositorioAluno repositorioAluno;
	public Aluno save(Aluno entity) {
		
		return repositorioAluno.save(entity);
	}
	
	public List<Aluno> findAll(){
		
		return repositorioAluno.findAll();
	}
	
	public void deleteById(Long id) {
		repositorioAluno.deleteById(id);
	}

	public void delete(Aluno entity) {
		repositorioAluno.delete(entity);
	}
}
