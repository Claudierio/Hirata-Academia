package br.com.hirataacademia.basicas;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity

public class Sala {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "sala_id")
	private List<Equipamento> arrayDeEquipamentos;
	@OneToOne(cascade = CascadeType.ALL)
	private Modalidade modalidade;

	public Sala( List<Equipamento> arrayDeEquipamentos, Modalidade modalidade) {
		super();
		this.arrayDeEquipamentos = arrayDeEquipamentos;
		this.modalidade = modalidade;
	}

}
