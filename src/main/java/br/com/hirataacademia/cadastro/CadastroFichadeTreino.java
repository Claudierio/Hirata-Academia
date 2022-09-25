package br.com.hirataacademia.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hirataacademia.basicas.FichadeTreino;
import br.com.hirataacademia.cadastro.exception.FichadeTreinoNaoEncontradaException;
import br.com.hirataacademia.repositorios.RepositorioFichadeTreino;

@Service
public class CadastroFichadeTreino {
	@Autowired
	private RepositorioFichadeTreino repositorioFichadeTreino;
	public FichadeTreino save(FichadeTreino entity) {
		
		return repositorioFichadeTreino.save(entity);
	}
	
	public List<FichadeTreino> findAll(){
		
		return repositorioFichadeTreino.findAll();
	}
	
	public void deleteById(Long id) {
		repositorioFichadeTreino.deleteById(id);
	}

	public void delete(FichadeTreino entity) {
		repositorioFichadeTreino.delete(entity);
	}
	
	public FichadeTreino findFichadeTreinoById(long id) {
		
		return repositorioFichadeTreino.findById(id).orElseThrow(()-> new FichadeTreinoNaoEncontradaException());
	}
	
	public void editarTreino(FichadeTreino entity) {
		FichadeTreino ficha = findFichadeTreinoById(entity.getId());
		ficha.setDuracao(entity.getDuracao());
		ficha.setIntensidade(entity.getIntensidade());
		ficha.setNomeAluno(entity.getNomeAluno());
		ficha.setNumeroExercicios(entity.getNumeroExercicios());
		ficha.setNumeroSeries(entity.getNumeroSeries());
		repositorioFichadeTreino.save(ficha);
		
	}
}
