package br.com.hirataacademia.fakertests;

import java.util.Locale;

import com.github.javafaker.Faker;

import br.com.hirataacademia.basicas.Aluno;
import br.com.hirataacademia.basicas.Endereco;

public class Aluno3Factory {
	public static Aluno generate() {

		Faker faker = new Faker(new Locale("pt-BR"));
		return new Aluno(faker.name().fullName(), faker.date().birthday(), faker.number().digits(11),
				new Endereco(faker.number().digits(8), faker.number().digits(3), faker.address().city(),
						faker.address().streetName(), faker.address().cityName(), faker.address().state()),
				faker.number().numberBetween(20, 200), faker.number().numberBetween(140, 200),
				faker.number().numberBetween(5, 40), faker.phoneNumber().cellPhone(), "Anual");

	}
}
