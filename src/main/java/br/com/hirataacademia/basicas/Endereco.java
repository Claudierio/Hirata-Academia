package br.com.hirataacademia.basicas;

import javax.persistence.Entity;

@Entity
public class Endereco {

	private long cep;
	private String numero;
	private String bairro;
	private String municipio;
	private String uf;

	public Endereco(long cep, String numero, String bairro, String municipio, String uf) {
		super();
		this.cep = cep;
		this.numero = numero;
		this.bairro = bairro;
		this.municipio = municipio;
		this.uf = uf;
	}

	public long getCep() {
		return cep;
	}

	public void setCep(long cep) {
		this.cep = cep;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
