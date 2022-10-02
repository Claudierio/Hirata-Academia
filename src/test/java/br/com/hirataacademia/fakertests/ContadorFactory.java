package br.com.hirataacademia.fakertests;

import com.github.javafaker.Faker;

import br.com.hirataacademia.basicas.Contador;
import br.com.hirataacademia.basicas.Endereco;

public class ContadorFactory {

	public static Contador generate() {
		
		Faker faker = new Faker();
		
		return new Contador(faker.name().fullName(), faker.date().birthday(), faker.number().digits(11),
				new Endereco(faker.number().digits(8), faker.number().digits(3), faker.address().city(),
						faker.address().streetName(), faker.address().cityName(), faker.address().state()),
				faker.number().numberBetween(600, 10000), "Dia", faker.phoneNumber().cellPhone(),
				faker.number().randomNumber());
	}
}
