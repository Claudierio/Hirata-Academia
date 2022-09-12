package br.com.hirataacademia;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.hirataacademia.basicas.Aluno;
import br.com.hirataacademia.basicas.Endereco;
import br.com.hirataacademia.basicas.Plano;
import br.com.hirataacademia.basicas.Professor;
import br.com.hirataacademia.cadastro.CadastroAluno;
import br.com.hirataacademia.repositorios.RepositorioPessoa;
import br.com.hirataacademia.repositorios.RepositorioPlano;


@SpringBootApplication
public class HirataAcademiaApplication implements CommandLineRunner{
	@Autowired
	private RepositorioPlano rp;
	@Autowired
	private RepositorioPessoa rp2;
	@Autowired
	private CadastroAluno cadastroTeste;
	
	

	
	public static void main(String[] args) {
		SpringApplication.run(HirataAcademiaApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Date hoje = new Date();
		Endereco enderecoAluno = new Endereco(56330700, "356", "Caminho do Sol", "Petrolina", "PE");
		Endereco enderecoProf = new Endereco(6354, "1312", "boa vista", "petrolina", "PE");
		rp.save(new Plano(100, "trimestral", 0));
		//rp2.save(new Aluno("filipe", hoje, 6354534352l, enderecoAluno, 21f, 84f, 1.86f, 14f,"87988848646", 0));
		rp2.save(new Professor("piu", hoje, 11111111, enderecoProf, 0));
		cadastroTeste.save(new Aluno("filipe", new SimpleDateFormat("dd/MM/yyyy").parse("07/08/2003"), 064554l, enderecoAluno, 21f, 84f, 1.86f, 14f,"879888489411", 0));
	}
	
	
	
	
	
	//String nome, Date dataDeNascimento, long cpf, Endereco endereco, float imc, float peso, float altura,
	//double percentualGordura, String contato,  long id)
	
	
}
