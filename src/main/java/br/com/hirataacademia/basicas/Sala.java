package br.com.hirataacademia.basicas;

import java.util.ArrayList;
import java.util.List;

public class Sala {
	
	private String categoria;
	private List<Equipamento> arrayDeEquipamentos;
	
	public Sala(String categoria, List<Equipamento> arrayDeEquipamentos) {
		super();
		this.categoria = categoria;
		this.arrayDeEquipamentos = arrayDeEquipamentos;
	}
	
}
