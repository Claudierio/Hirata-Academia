package br.com.hirataacademia.repositorios;

import java.util.ArrayList;
import java.util.List;

import basicas.Equipamento;



public class RepositorioEquipamentosArrayList implements RepositorioEquipamentos{

	private  List<Equipamento> equipamentos;
	
	public RepositorioEquipamentosArrayList() {
		this.equipamentos = new ArrayList<Equipamento>();
	}
	
	
	@Override
	public void adicionarEquipamento(Equipamento equipamento) {
		this.equipamentos.add(equipamento);
		
	}

	@Override
	public boolean necessidadeManutencao(Equipamento equipamento) {
		
		return equipamento.isNecessidadeManutencao();
	}

	@Override
	public List<Equipamento> listarEquipamentos() {
	
		
		return this.equipamentos;
	}

	@Override
	public Equipamento procurarEquipamento(long numeroRegistro) {
		
		return this.equipamentos.stream()
				.filter(equipamento -> equipamento.getNumeroRegistro()==numeroRegistro)
				.findAny()
				.orElse(null);
		
		
		
	}

	
	
}
	
	
	
	

