package br.com.hirataacademia.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hirataacademia.basicas.Aluno;
import br.com.hirataacademia.cadastro.exception.AlunoCadastradoException;
import br.com.hirataacademia.cadastro.exception.AlunoNaoEncontradoExcepetion;
import br.com.hirataacademia.repositorios.RepositorioAluno;

@Service
public class CadastroAluno {
	@Autowired
	private RepositorioAluno repositorioAluno;

	public Aluno save(Aluno entity) throws AlunoCadastradoException{

		if (findAlunoByCpf(entity.getCpf()) != null) {
			throw new AlunoCadastradoException();
		}

		return repositorioAluno.save(entity);
	}

	private Aluno findAlunoByCpf(String cpf) {
		return repositorioAluno.findByCpf(cpf);
	}

	public List<Aluno> findAll() {

		return repositorioAluno.findAll();
	}

	public void deleteById(Long id) {
		repositorioAluno.deleteById(id);
	}

	public void delete(Aluno entity) {
		repositorioAluno.delete(entity);
	}

	public Aluno findAlunoById(Long id) throws AlunoNaoEncontradoExcepetion {

		return repositorioAluno.findById(id).orElseThrow(() -> new AlunoNaoEncontradoExcepetion());
	}
}
