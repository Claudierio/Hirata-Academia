package br.com.hirataacademia.basicas;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Funcionario extends Pessoa {

	private double salario;
	private String turno;
	private String contato;

	public Funcionario() {
		super();

	}

	public Funcionario(String nome, Date dataDeNascimento, String cpf, Endereco endereco, double salario,
			String turno,String contato ) {
		super(nome, dataDeNascimento, cpf, endereco);
		this.salario = salario;
		this.turno = turno;
		this.contato = contato;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

}