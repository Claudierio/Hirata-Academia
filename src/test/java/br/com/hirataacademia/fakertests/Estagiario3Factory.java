package br.com.hirataacademia.fakertests;

import java.util.Date;
import java.util.Locale;

import com.github.javafaker.Faker;

import br.com.hirataacademia.basicas.Endereco;
import br.com.hirataacademia.basicas.ProfessorEstagiario;

public class Estagiario3Factory {
	public static ProfessorEstagiario generate() {

		Faker faker = new Faker(new Locale("pt-BR"));

		Date fimEstagio = new Date(2024, 10, 03);
		Date inicioEstagio = new Faker().date().between(new Date(), fimEstagio);

		return new ProfessorEstagiario(faker.name().fullName(), faker.date().birthday(), faker.number().digits(11),
				new Endereco(faker.number().digits(8), faker.number().digits(3), faker.address().city(),
						faker.address().streetName(), faker.address().cityName(), faker.address().state()),
				faker.number().numberBetween(600, 10000), faker.phoneNumber().cellPhone(), inicioEstagio, fimEstagio,
				"tarde");

	}
}