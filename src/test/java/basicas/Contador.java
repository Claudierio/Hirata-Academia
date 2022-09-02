package basicas;

import java.util.Date;

public class Contador extends Funcionario {

	

	private String crc; //crc eh o conselho de um contador.
	
	public Contador(String nome, Date dataDeNascimento, long cpf, Endereco endereco) {
		super(nome, dataDeNascimento, cpf, endereco);
		
	}

	public Contador(String nome, Date dataDeNascimento, long cpf, Endereco endereco, String crc) {
		super(nome, dataDeNascimento, cpf, endereco);
		this.crc = crc;
	}
	
	
	
}
