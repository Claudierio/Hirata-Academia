package br.com.hirataacademia.fakertests;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.javafaker.Faker;

import br.com.hirataacademia.basicas.Aluno;
import br.com.hirataacademia.basicas.Endereco;
import br.com.hirataacademia.cadastro.CadastroAluno;

public class AlunoTest {

	@Autowired
	private CadastroAluno cadastroAluno;
	
	
	
	@Test
	void alunoFakerTest() {

		Faker faker = new Faker();

		Aluno aluno = new Aluno(faker.name().fullName(), faker.date().birthday(), faker.number().digits(11),
				new Endereco(faker.number().digits(8), faker.number().digits(3), faker.address().city(),
						faker.address().streetName(), faker.address().cityName(), faker.address().state()),
				faker.number().numberBetween(20, 200), faker.number().numberBetween(140, 200),
				faker.number().numberBetween(5, 40), faker.phoneNumber().cellPhone(), "Mensal");

		cadastroAluno.save(aluno);

		Aluno aluno2 = new Aluno(faker.name().fullName(), faker.date().birthday(), faker.number().digits(11),
				new Endereco(faker.number().digits(8), faker.number().digits(3), faker.address().city(),
						faker.address().streetName(), faker.address().cityName(), faker.address().state()),
				faker.number().numberBetween(20, 200), faker.number().numberBetween(140, 200),
				faker.number().numberBetween(5, 40), faker.phoneNumber().cellPhone(), "Trimestral");

		cadastroAluno.save(aluno2);

		Aluno aluno3 = new Aluno(faker.name().fullName(), faker.date().birthday(), faker.number().digits(11),
				new Endereco(faker.number().digits(8), faker.number().digits(3), faker.address().city(),
						faker.address().streetName(), faker.address().cityName(), faker.address().state()),
				faker.number().numberBetween(20, 200), faker.number().numberBetween(140, 200),
				faker.number().numberBetween(5, 40), faker.phoneNumber().cellPhone(), "Anual");

		cadastroAluno.save(aluno3);

	}
	
	
	
	@Test
	void saveAluno() {

		for (int x = 0; x < 10; x++) {
			cadastroAluno.save(AlunoFactory.generate());

		}

	
	
	
}
}
