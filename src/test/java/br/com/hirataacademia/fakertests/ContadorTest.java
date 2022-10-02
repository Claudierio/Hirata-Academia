package br.com.hirataacademia.fakertests;

import java.util.Locale;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.javafaker.Faker;

import br.com.hirataacademia.basicas.Contador;
import br.com.hirataacademia.basicas.Endereco;
import br.com.hirataacademia.cadastro.CadastroContador;

public class ContadorTest {
	@Autowired
	private CadastroContador cadastroContador;

	@Test
	void contadorFakerTest() {

		Faker faker = new Faker();

		Contador contador1 = new Contador(faker.name().fullName(), faker.date().birthday(), faker.number().digits(11),
				new Endereco(faker.number().digits(8), faker.number().digits(3), faker.address().city(),
						faker.address().streetName(), faker.address().cityName(), faker.address().state()),
				faker.number().numberBetween(600, 10000), "Dia", faker.phoneNumber().cellPhone(),
				faker.number().randomNumber());

		cadastroContador.save(contador1);

		Contador contador2 = new Contador(faker.name().fullName(), faker.date().birthday(), faker.number().digits(11),
				new Endereco(faker.number().digits(8), faker.number().digits(3), faker.address().city(),
						faker.address().streetName(), faker.address().cityName(), faker.address().state()),
				faker.number().numberBetween(600, 10000), "Tarde", faker.phoneNumber().cellPhone(),
				faker.number().randomNumber());

		cadastroContador.save(contador2);

		Contador contador3 = new Contador(faker.name().fullName(), faker.date().birthday(), faker.number().digits(11),
				new Endereco(faker.number().digits(8), faker.number().digits(3), faker.address().city(),
						faker.address().streetName(), faker.address().cityName(), faker.address().state()),
				faker.number().numberBetween(600, 10000), "Noite", faker.phoneNumber().cellPhone(),
				faker.number().randomNumber());

		cadastroContador.save(contador3);
	}

	Faker faker = new Faker(new Locale("pt-BR"));

	@Test
	void saveContador() {
		for (int x = 0; x < 10; x++) {
			cadastroContador.save(ContadorFactory.generate());
		}
	}

}
