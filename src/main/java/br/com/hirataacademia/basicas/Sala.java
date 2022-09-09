package br.com.hirataacademia.basicas;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
@Entity

public class Sala {
	
	private String categoria;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Equipamento> arrayDeEquipamentos;
	
	public Sala(String categoria, List<Equipamento> arrayDeEquipamentos) {
		super();
		this.categoria = categoria;
		this.arrayDeEquipamentos = arrayDeEquipamentos;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public List<Equipamento> getArrayDeEquipamentos() {
		return arrayDeEquipamentos;
	}

	public void setArrayDeEquipamentos(List<Equipamento> arrayDeEquipamentos) {
		this.arrayDeEquipamentos = arrayDeEquipamentos;
	}
	
}
