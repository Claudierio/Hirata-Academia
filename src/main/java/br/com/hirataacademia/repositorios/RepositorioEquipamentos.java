package br.com.hirataacademia.repositorios;

import java.util.List;

import basicas.Equipamento;
import basicas.Sala;

public interface RepositorioEquipamentos {

	void adicionarEquipamento(Equipamento equipamento);
	boolean necessidadeManutencao(Equipamento equipamento);
	List<Equipamento>  listarEquipamentos();
	Equipamento procurarEquipamento(long numeroRegistro);
}
