package br.com.hirataacademia.repositorios;

import java.util.Date;

import basicas.Aluno;
import basicas.Endereco;
import basicas.Matricula;
import basicas.Modalidade;
import basicas.Plano;

public interface RepositorioMatriculas {
	
	public Secretario(String nome, Date dataDeNascimento, long cpf, Endereco endereco) {
		super(nome, dataDeNascimento, cpf, endereco);
		
	}
	
	
	public Secretario(String nome, Date dataDeNascimento, long cpf, Endereco endereco, long idSecretario) {
		super(nome, dataDeNascimento, cpf, endereco);
		this.idSecretario = idSecretario;
	}
	
	
	public Matricula matricular(Aluno aluno, Plano plano, Modalidade modalidade) {
	
		Matricula matricula1 = new Matricula(aluno.getIdAluno(), plano, aluno, modalidade); //a id do aluno será a id da matrícula.

		return matricula1;
	}
	
	public void desmatricular(Matricula matricula) {
		
		matricula.setAtivo(false);
	}
	
	
	public void editarMatricula(Matricula matricula, Plano novoPlano) {
		
		matricula.setPlano(novoPlano);
		
	}
	
	public void editarMatricula(Matricula matricula, Modalidade novaModalidade) {
		
		matricula.setModalidade(novaModalidade);
		
	}
	
	
}