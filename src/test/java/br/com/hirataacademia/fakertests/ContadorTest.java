package br.com.hirataacademia.fakertests;

import java.util.Locale;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.github.javafaker.Faker;

import br.com.hirataacademia.basicas.Contador;
import br.com.hirataacademia.basicas.Endereco;
import br.com.hirataacademia.cadastro.CadastroContador;

@SpringBootTest
public class ContadorTest {
	@Autowired
	private CadastroContador cadastroContador;


	Faker faker = new Faker(new Locale("pt-BR"));

	@Test
	void saveContador() {
		for (int x = 0; x < 5; x++) {
			cadastroContador.save(Contador1Factory.generate());
			cadastroContador.save(Contador2Factory.generate());
			cadastroContador.save(Contador3Factory.generate());
		}
	}

}
