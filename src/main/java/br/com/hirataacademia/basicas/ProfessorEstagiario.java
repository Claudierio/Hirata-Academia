package br.com.hirataacademia.basicas;

import java.util.Date;

public class ProfessorEstagiario extends Funcionario {
	
	
	private Date inicioEstagio;
	private Date fimEstagio;
	
	public ProfessorEstagiario(String nome, Date dataDeNascimento, long cpf, Endereco endereco) {
		super(nome, dataDeNascimento, cpf, endereco);
		
	}

	public ProfessorEstagiario(String nome, Date dataDeNascimento, long cpf, Endereco endereco, Date inicioEstagio,
			Date fimEstagio) {
		super(nome, dataDeNascimento, cpf, endereco);
		this.inicioEstagio = inicioEstagio;
		this.fimEstagio = fimEstagio;
	}
	
	
	
}
