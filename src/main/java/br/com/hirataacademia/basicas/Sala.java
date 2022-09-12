package br.com.hirataacademia.basicas;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity

public class Sala {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String categoria;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "sala_id")
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
