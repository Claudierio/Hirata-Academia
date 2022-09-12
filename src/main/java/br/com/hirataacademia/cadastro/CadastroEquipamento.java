package br.com.hirataacademia.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hirataacademia.basicas.Equipamento;
import br.com.hirataacademia.repositorios.RepositorioEquipamento;
@Service
public class CadastroEquipamento {
	@Autowired
	private RepositorioEquipamento repositorioEquipamento;
	public Equipamento save(Equipamento entity) {
		
		return repositorioEquipamento.save(entity);
	}
	
	public List<Equipamento> findAll(){
		
		return repositorioEquipamento.findAll();
	}
	
	public void deleteById(Long id) {
		repositorioEquipamento.deleteById(id);
	}

	public void delete(Equipamento entity) {
		repositorioEquipamento.delete(entity);
	}
}
