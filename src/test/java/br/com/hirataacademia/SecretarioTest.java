package br.com.hirataacademia;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hirataacademia.basicas.Plano;
import br.com.hirataacademia.repositorios.RepositorioPlano;
@Service
class SecretarioTest {
	@Autowired
	private RepositorioPlano rp;
	

	@Test

	void testInserirPlano() {

		rp.save(new Plano(100, "mensal", 0));

	}

	/*
	 * @Test void testMatricular() {
	 * 
	 * 
	 * BodyCombat luta = new BodyCombat("BodyCombat", 50, "intenso");
	 * 
	 * PlanoMensal plano1 = new PlanoMensal(100);
	 * 
	 * Endereco endereco1 = new Endereco(6544,"301a", "boa vista", "garanhas",
	 * "pernambuco");
	 * 
	 * Date data = new Date(1995,11,17);
	 * 
	 * Date dataAluno = new Date(200, 12, 18);
	 * 
	 * Matricula matricula1;
	 * 
	 * Secretario secretario = new Secretario("oi", data, 111111, endereco1);
	 * 
	 * Endereco enderecoAluno = new Endereco(6544,"301a", "boa vista", "garanhas",
	 * "pernambuco");
	 * 
	 * Aluno aluno1 = new Aluno("hirata", dataAluno, 65456, endereco1, 42f, 50f,
	 * 60f, 20f, "8765465456", 3123213 );
	 * 
	 * matricula1 = secretario.matricular(aluno1, plano1, luta);
	 * 
	 * assertEquals(matricula1.getId(), 3123213 );
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 * 
	 * @Test void testDesmatricular() {
	 * 
	 * BodyCombat luta = new BodyCombat("BodyCombat", 50, "intenso");
	 * 
	 * PlanoMensal plano1 = new PlanoMensal(100);
	 * 
	 * Endereco endereco1 = new Endereco(6544,"301a", "boa vista", "garanhas",
	 * "pernambuco");
	 * 
	 * Date data = new Date(1995,11,17);
	 * 
	 * Date dataAluno = new Date(200, 12, 18);
	 * 
	 * Matricula matricula1;
	 * 
	 * Secretario secretario = new Secretario("oi", data, 111111, endereco1);
	 * 
	 * Endereco enderecoAluno = new Endereco(6544,"301a", "boa vista", "garanhas",
	 * "pernambuco");
	 * 
	 * Aluno aluno1 = new Aluno("hirata", dataAluno, 65456, endereco1, 42f, 50f,
	 * 60f, 20f, "8765465456", 3123213 );
	 * 
	 * matricula1 = secretario.matricular(aluno1, plano1, luta);
	 * 
	 * secretario.desmatricular(matricula1);
	 * 
	 * assertEquals(matricula1.isAtivo(), false);
	 * 
	 * 
	 * 
	 * }
	 * 
	 * @Test void testEditarMatriculaMatriculaPlano() {
	 * 
	 * BodyCombat luta = new BodyCombat("BodyCombat", 50, "intenso");
	 * 
	 * PlanoMensal plano1 = new PlanoMensal(100);
	 * 
	 * Endereco endereco1 = new Endereco(6544,"301a", "boa vista", "garanhas",
	 * "pernambuco");
	 * 
	 * Date data = new Date(1995,11,17);
	 * 
	 * Date dataAluno = new Date(200, 12, 18);
	 * 
	 * Matricula matricula1;
	 * 
	 * Secretario secretario = new Secretario("oi", data, 111111, endereco1);
	 * 
	 * Endereco enderecoAluno = new Endereco(6544,"301a", "boa vista", "garanhas",
	 * "pernambuco");
	 * 
	 * Aluno aluno1 = new Aluno("hirata", dataAluno, 65456, endereco1, 42f, 50f,
	 * 60f, 20f, "8765465456", 3123213 );
	 * 
	 * matricula1 = secretario.matricular(aluno1, plano1, luta);
	 * 
	 * PlanoAnual plano2 = new PlanoAnual(50);
	 * 
	 * secretario.editarMatricula(matricula1, plano2);
	 * 
	 * assertEquals(matricula1.getPlano(), plano2);
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 * 
	 * @Test void testEditarMatriculaMatriculaModalidade() {
	 * 
	 * BodyCombat luta = new BodyCombat("BodyCombat", 50, "intenso");
	 * 
	 * PlanoMensal plano1 = new PlanoMensal(100);
	 * 
	 * Endereco endereco1 = new Endereco(6544,"301a", "boa vista", "garanhas",
	 * "pernambuco");
	 * 
	 * Date data = new Date(1995,11,17);
	 * 
	 * Date dataAluno = new Date(200, 12, 18);
	 * 
	 * Matricula matricula1;
	 * 
	 * Secretario secretario = new Secretario("oi", data, 111111, endereco1);
	 * 
	 * Endereco enderecoAluno = new Endereco(6544,"301a", "boa vista", "garanhas",
	 * "pernambuco");
	 * 
	 * Aluno aluno1 = new Aluno("hirata", dataAluno, 65456, endereco1, 42f, 50f,
	 * 60f, 20f, "8765465456", 3123213 );
	 * 
	 * matricula1 = secretario.matricular(aluno1, plano1, luta);
	 * 
	 * 
	 * Ginastica ginastica = new Ginastica("ginastica", 30, "facil");
	 * 
	 * Musculacao musculacao = new Musculacao("musculacao", 50, "dificil");
	 * 
	 * 
	 * secretario.editarMatricula(matricula1, ginastica);
	 * 
	 * assertEquals(matricula1.getModalidade(), ginastica);
	 * 
	 * 
	 * }
	 */
}
