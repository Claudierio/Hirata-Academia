package br.com.hirataacademia.fakertests;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.javafaker.Faker;

import br.com.hirataacademia.basicas.Gerente;
import br.com.hirataacademia.cadastro.CadastroGerente;

public class GerenteTest {

	@Autowired
	private CadastroGerente cg ;
	
	@Test
	void GerenteFakerTest() {
		
		Faker faker = new Faker();

		Gerente gerente1 = new Gerente1Factory().generate();

		cg.save(gerente1);

		Gerente gerente2 = new Gerente2Factory().generate();

		cg.save(gerente2);

		Gerente gerente3 = new Gerente3Factory().generate();

		cg.save(gerente3);

	}
	
	
	
	@Test
	
	void saveAluno() {

		for (int x = 0; x < 10; x++) {
			cg.save(Gerente1Factory.generate());
			cg.save(Gerente2Factory.generate());
			cg.save(Gerente3Factory.generate());
		}

	}
	
	
	
	
	
	
	
	
}
