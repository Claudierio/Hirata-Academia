package br.com.hirataacademia.fakertests;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.github.javafaker.Faker;

import br.com.hirataacademia.basicas.Aluno;
import br.com.hirataacademia.basicas.Endereco;
import br.com.hirataacademia.cadastro.CadastroAluno;

@SpringBootTest
public class AlunoTest {

	@Autowired
	private CadastroAluno cadastroAluno;

	@Test
	void saveAluno() {

		for (int x = 0; x < 10; x++) {
			cadastroAluno.save(Aluno1Factory.generate());
			cadastroAluno.save(Aluno2Factory.generate());
			cadastroAluno.save(Aluno3Factory.generate());
		}

	}
}
