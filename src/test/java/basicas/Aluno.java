package basicas;

import java.util.Date;

public class Aluno extends Pessoa {

	
	
	private float imc;
	private float peso;
	private float altura;
	private double percentualGordura;
	private String contato;
	private long idAluno;
	
	public Aluno(String nome, Date dataDeNascimento, long cpf, Endereco endereco) {
		super(nome, dataDeNascimento, cpf, endereco);
		
	}

	public Aluno(String nome, Date dataDeNascimento, long cpf, Endereco endereco, float imc, float peso, float altura,
			double percentualGordura, String contato,  long idAluno) {
		super(nome, dataDeNascimento, cpf, endereco);
		this.imc = imc;
		this.peso = peso;
		this.altura = altura;
		this.percentualGordura = percentualGordura;
		this.contato = contato;
		this.idAluno = idAluno;
		
	}

	public long getIdAluno() {
		return idAluno;
	}

	
	
	
	
	
}
