package br.com.hirataacademia.fakertests;

import com.github.javafaker.Faker;

import br.com.hirataacademia.basicas.Endereco;
import br.com.hirataacademia.basicas.Gerente;

public class Gerente1Factory {

	public static Gerente generate() {
		Faker faker = new Faker();

		return new Gerente(faker.name().fullName(), faker.date().birthday(), faker.number().digits(11),
				new Endereco(faker.number().digits(8), faker.number().digits(3), faker.address().city(),
						faker.address().streetName(), faker.address().cityName(), faker.address().state()),
				faker.number().numberBetween(600, 10000), "Dia", faker.phoneNumber().cellPhone());

	}

}

//String nome, Date dataDeNascimento, String cpf, Endereco endereco, double salario, String turno,
//String contato