package br.com.hirataacademia.cadastro;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hirataacademia.basicas.Despesa;
import br.com.hirataacademia.basicas.Pagamento;
import br.com.hirataacademia.cadastro.exception.DespesaNaoEncontradaException;
import br.com.hirataacademia.repositorios.RepositorioDespesa;

@Service
public class CadastroDespesa {
	@Autowired
	private RepositorioDespesa repositorioDespesa;

	public Despesa save(Despesa entity) {

		return repositorioDespesa.save(entity);
	}

	public List<Despesa> findAll() {

		return repositorioDespesa.findAll();
	}

	public void deleteById(Long id) {
		repositorioDespesa.deleteById(id);
	}

	public void delete(Despesa entity) {
		repositorioDespesa.delete(entity);
	}

	public List<Despesa> listarDespesaPorIntervalo(Date inicio, Date fim) {

		return repositorioDespesa.listarDespesaPorIntervalo(inicio, fim);
	}

	public Despesa findDespesaById(Long id) throws DespesaNaoEncontradaException {

		return repositorioDespesa.findById(id).orElseThrow(() -> new DespesaNaoEncontradaException());
	}
}

