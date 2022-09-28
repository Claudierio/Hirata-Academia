package br.com.hirataacademia.basicas;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Equipamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long numeroRegistro;

	private boolean necessidadeManutencao;
	private Date dataAquisicao;

	public Equipamento() {
		
	}
	
	public Equipamento(boolean necessidadeManutencao, Date dataAquisicao, long numeroRegistro) {
		super();
		this.necessidadeManutencao = necessidadeManutencao;
		this.dataAquisicao = dataAquisicao;
		this.numeroRegistro = numeroRegistro;
	}

	public long getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(long numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public boolean isNecessidadeManutencao() {
		return necessidadeManutencao;
	}

	public void setNecessidadeManutencao(boolean necessidadeManutencao) {
		this.necessidadeManutencao = necessidadeManutencao;
	}

	public Date getDataAquisicao() {
		return dataAquisicao;
	}

	public void setDataAquisicao(Date dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}

}
