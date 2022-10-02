package br.com.hirataacademia.fakertests;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.javafaker.Faker;

import br.com.hirataacademia.basicas.ProfessorEstagiario;
import br.com.hirataacademia.cadastro.CadastroProfessorEstagiario;

public class EstagiarioTest {

	@Autowired
	CadastroProfessorEstagiario cpe;

	@Test
	void ProfessorEstagiarioTest() {
		Faker faker = new Faker();

		ProfessorEstagiario estagiario1 = new Estagiario1Factory().generate();
		cpe.save(estagiario1);

		ProfessorEstagiario estagiario2 = new Estagiario2Factory().generate();
		cpe.save(estagiario2);

		ProfessorEstagiario estagiario3 = new Estagiario3Factory().generate();
		cpe.save(estagiario3);
	}

	@Test
	void saveProfessorEstagiario() {

		for (int x = 0; x < 10; x++) {
			cpe.save(Estagiario1Factory.generate());
			cpe.save(Estagiario2Factory.generate());
			cpe.save(Estagiario3Factory.generate());
		}

	}

}
