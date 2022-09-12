package br.com.hirataacademia.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hirataacademia.basicas.ProfessorEstagiario;
import br.com.hirataacademia.repositorios.RepositorioProfessorEstagiario;
@Service
public class CadastroProfessorEstagiario {
	@Autowired
	private RepositorioProfessorEstagiario repositorioProfessorEstagiario;
	public ProfessorEstagiario save(ProfessorEstagiario entity) {
		
		return repositorioProfessorEstagiario.save(entity);
	}
	
	public List<ProfessorEstagiario> findAll(){
		
		return repositorioProfessorEstagiario.findAll();
	}
	
	public void deleteById(Long id) {
		repositorioProfessorEstagiario.deleteById(id);
	}

	public void delete(ProfessorEstagiario entity) {
		repositorioProfessorEstagiario.delete(entity);
	}
}
