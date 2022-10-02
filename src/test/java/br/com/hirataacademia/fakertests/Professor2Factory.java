package br.com.hirataacademia.fakertests;

import java.util.Locale;

import com.github.javafaker.Faker;

import br.com.hirataacademia.basicas.Endereco;
import br.com.hirataacademia.basicas.Professor;

public class Professor2Factory {
	public static Professor generate() {
		Faker faker = new Faker(new Locale("pt-BR"));
		return new Professor(faker.name().fullName(), faker.date().birthday(), faker.number().digits(11),
				new Endereco(faker.number().digits(8), faker.number().digits(3), faker.address().city(),
						faker.address().streetName(), faker.address().cityName(), faker.address().state()),
				faker.number().numberBetween(600, 10000), "Tarde", faker.phoneNumber().cellPhone(),
				faker.number().randomNumber());
	}
}
