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

		Contador contador1 = new Contador1Factory().generate();

		cadastroContador.save(contador1);

		Contador contador2 = new Contador2Factory().generate();

		cadastroContador.save(contador2);

		Contador contador3 = new Contador3Factory().generate();

		cadastroContador.save(contador3);
	}

	Faker faker = new Faker(new Locale("pt-BR"));

	@Test
	void saveContador() {
		for (int x = 0; x < 10; x++) {
			cadastroContador.save(Contador1Factory.generate());
			cadastroContador.save(Contador2Factory.generate());
			cadastroContador.save(Contador3Factory.generate());
		}
	}

}
