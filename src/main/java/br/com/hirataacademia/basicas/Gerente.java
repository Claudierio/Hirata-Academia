package br.com.hirataacademia.basicas;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Gerente extends Funcionario {

	public Gerente(String nome, Date dataDeNascimento, String cpf, Endereco endereco, double salario, String turno) {
		super(nome, dataDeNascimento, cpf, endereco, salario, turno);

	}

}
