package br.com.hirataacademia.basicas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.hirataacademia.basicas.exception.EnderecoException;

@Entity
public class Endereco {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String cep;
	private String numero;
	private String bairro;
	private String rua;
	private String municipio;
	private String uf;

	public Endereco(String cep, String numero, String bairro, String rua, String municipio, String uf) {
		super();
		if(rua == bairro) {
			throw new EnderecoException("Seu bairro e rua são iguais.");
		}
		this.cep = cep;
		this.numero = numero;
		this.bairro = bairro;
		this.rua = rua;
		this.municipio = municipio;
		this.uf = uf;

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		if (rua == bairro) {
			throw new EnderecoException("Seu bairro e rua são iguais.");
		}
		this.rua = rua;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
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
		if (bairro == rua) {
			throw new EnderecoException("Seu bairro é igual a sua rua.");
		}
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
