package br.com.hirataacademia.fakertests;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.javafaker.Faker;

import br.com.hirataacademia.basicas.Endereco;
import br.com.hirataacademia.basicas.Professor;
import br.com.hirataacademia.cadastro.CadastroProfessor;

public class ProfessorTest {

	
	@Autowired
	private CadastroProfessor cadastroProfessor;
	
	
	@Test
	void professorFakerTest() {

		Faker faker = new Faker();

		Professor professor1 = new Professor(faker.name().fullName(), faker.date().birthday(),
				faker.number().digits(11),
				new Endereco(faker.number().digits(8), faker.number().digits(3), faker.address().city(),
						faker.address().streetName(), faker.address().cityName(), faker.address().state()),
				faker.number().numberBetween(600, 10000), "Dia", faker.phoneNumber().cellPhone(),
				faker.number().randomNumber());

		cadastroProfessor.save(professor1);

		Professor professor2 = new Professor(faker.name().fullName(), faker.date().birthday(),
				faker.number().digits(11),
				new Endereco(faker.number().digits(8), faker.number().digits(3), faker.address().city(),
						faker.address().streetName(), faker.address().cityName(), faker.address().state()),
				faker.number().numberBetween(600, 10000), "Tarde", faker.phoneNumber().cellPhone(),
				faker.number().randomNumber());

		cadastroProfessor.save(professor2);

		Professor professor3 = new Professor(faker.name().fullName(), faker.date().birthday(),
				faker.number().digits(11),
				new Endereco(faker.number().digits(8), faker.number().digits(3), faker.address().city(),
						faker.address().streetName(), faker.address().cityName(), faker.address().state()),
				faker.number().numberBetween(600, 10000), "Noite", faker.phoneNumber().cellPhone(),
				faker.number().randomNumber());

		cadastroProfessor.save(professor3);
	}
	
	@Test
	void saveProfessor() {
		for(int x = 0; x < 10; x++) {
			cadastroProfessor.save(ProfessorFactory.generate());
		}
	
	
	
}
}
