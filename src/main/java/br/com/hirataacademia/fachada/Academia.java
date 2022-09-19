package br.com.hirataacademia.fachada;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hirataacademia.basicas.Aluno;
import br.com.hirataacademia.basicas.Contador;
import br.com.hirataacademia.basicas.Despesa;
import br.com.hirataacademia.basicas.Endereco;
import br.com.hirataacademia.basicas.Equipamento;
import br.com.hirataacademia.basicas.Funcionario;
import br.com.hirataacademia.basicas.Matricula;
import br.com.hirataacademia.basicas.Modalidade;
import br.com.hirataacademia.basicas.Pagamento;
import br.com.hirataacademia.basicas.Plano;
import br.com.hirataacademia.basicas.Professor;
import br.com.hirataacademia.basicas.ProfessorEstagiario;
import br.com.hirataacademia.basicas.Sala;
import br.com.hirataacademia.cadastro.CadastroAluno;
import br.com.hirataacademia.cadastro.CadastroContador;
import br.com.hirataacademia.cadastro.CadastroDespesa;
import br.com.hirataacademia.cadastro.CadastroEndereco;
import br.com.hirataacademia.cadastro.CadastroEquipamento;
import br.com.hirataacademia.cadastro.CadastroMatricula;
import br.com.hirataacademia.cadastro.CadastroModalidade;
import br.com.hirataacademia.cadastro.CadastroPagamento;
import br.com.hirataacademia.cadastro.CadastroPlano;
import br.com.hirataacademia.cadastro.CadastroProfessor;
import br.com.hirataacademia.cadastro.CadastroProfessorEstagiario;
import br.com.hirataacademia.cadastro.CadastroSala;

@Service
public class Academia {
	@Autowired
	private CadastroAluno cadastroAluno;
	@Autowired
	private CadastroContador cadastroContador;
	@Autowired
	private CadastroEndereco cadastroEndereco;
	@Autowired
	private CadastroEquipamento cadastroEquipamento;
	@Autowired
	private CadastroMatricula cadastroMatricula;
	@Autowired
	private CadastroModalidade cadastroModalidade;
	@Autowired
	private CadastroPagamento cadastroPagamento;
	@Autowired
	private CadastroPlano cadastroPlano;
	@Autowired
	private CadastroProfessor cadastroProfessor;
	@Autowired
	private CadastroProfessorEstagiario cadastroProfessorEstagiario;
	@Autowired
	private CadastroSala cadastroSala;
	@Autowired
	private CadastroDespesa cadastroDespesa;

	public Aluno saveAluno(Aluno entity) {
		return cadastroAluno.save(entity);
	}

	public List<Aluno> findAllAluno() {

		return cadastroAluno.findAll();
	}

	public void deleteAlunoById(Long id) {
		cadastroAluno.deleteById(id);
	}

	public void deleteAluno(Aluno entity) {
		cadastroAluno.delete(entity);
	}

	public Contador saveContador(Contador entity) {

		return cadastroContador.save(entity);
	}

	public List<Contador> findAllContador() {

		return cadastroContador.findAll();
	}

	public void deleteContadorById(Long id) {
		cadastroContador.deleteById(id);
	}

	public void deleteContador(Contador entity) {
		cadastroContador.delete(entity);
	}

	public Endereco saveEndereco(Endereco entity) {

		return cadastroEndereco.save(entity);
	}

	public List<Endereco> findAllEndereco() {

		return cadastroEndereco.findAll();
	}

	public void deleteEnderecoById(Long id) {
		cadastroEndereco.deleteById(id);
	}

	public void deleteEndereco(Endereco entity) {
		cadastroEndereco.delete(entity);
	}

	public Equipamento saveEquipamento(Equipamento entity) {

		return cadastroEquipamento.save(entity);
	}

	public List<Equipamento> findAllEquipamento() {

		return cadastroEquipamento.findAll();
	}

	public void deleteEquipamentoById(Long id) {
		cadastroEquipamento.deleteById(id);
	}

	public void deleteEquipamento(Equipamento entity) {
		cadastroEquipamento.delete(entity);
	}

	public Matricula saveMatricula(Matricula entity) {

		return cadastroMatricula.save(entity);
	}

	public List<Matricula> findAllMatricula() {

		return cadastroMatricula.findAll();
	}

	public void deleteMatriculaById(Long id) {
		cadastroMatricula.deleteById(id);
	}

	public void deleteMatricula(Matricula entity) {
		cadastroMatricula.delete(entity);
	}

	public Modalidade saveModalidade(Modalidade entity) {

		return cadastroModalidade.save(entity);
	}

	public List<Modalidade> findAllModalidade() {

		return cadastroModalidade.findAll();
	}

	public void deleteModalidadeById(Long id) {
		cadastroModalidade.deleteById(id);
	}

	public void deleteModalidade(Modalidade entity) {
		cadastroModalidade.delete(entity);
	}

	public Pagamento savePagamento(Pagamento entity) {

		return cadastroPagamento.save(entity);
	}

	public List<Pagamento> findAllPagamento() {

		return cadastroPagamento.findAll();
	}

	public void deletePagamentoById(Long id) {
		cadastroPagamento.deleteById(id);
	}

	public void deletePagamento(Pagamento entity) {
		cadastroPagamento.delete(entity);
	}

	public Plano savePlano(Plano entity) {

		return cadastroPlano.save(entity);
	}

	public List<Plano> findAllPlano() {

		return cadastroPlano.findAll();
	}

	public void deletePlanoById(Long id) {
		cadastroPlano.deleteById(id);
	}

	public void deletePlano(Plano entity) {
		cadastroPlano.delete(entity);
	}

	public Professor saveProfessor(Professor entity) {

		return cadastroProfessor.save(entity);
	}

	public List<Professor> findAllProfessor() {

		return cadastroProfessor.findAll();
	}

	public void deleteProfessorById(Long id) {
		cadastroProfessor.deleteById(id);
	}

	public void deleteProfessor(Professor entity) {
		cadastroProfessor.delete(entity);
	}

	public ProfessorEstagiario saveProfessorEstagiario(ProfessorEstagiario entity) {

		return cadastroProfessorEstagiario.save(entity);
	}

	public List<ProfessorEstagiario> findAllProfessorEstagiario() {

		return cadastroProfessorEstagiario.findAll();
	}

	public void deleteProfessorEstagiarioById(Long id) {
		cadastroProfessorEstagiario.deleteById(id);
	}

	public void deleteProfessorEstagiario(ProfessorEstagiario entity) {
		cadastroProfessorEstagiario.delete(entity);
	}

	public Sala saveSala(Sala entity) {

		return cadastroSala.save(entity);
	}

	public List<Sala> findAllSala() {

		return cadastroSala.findAll();
	}

	public void deleteSalaById(Long id) {
		cadastroSala.deleteById(id);
	}

	public void deleteSala(Sala entity) {
		cadastroSala.delete(entity);
	}

	public Despesa saveDespesa(Despesa entity) {

		return cadastroDespesa.save(entity);
	}

	public List<Despesa> findAllDespesa() {

		return cadastroDespesa.findAll();
	}

	public void deleteDespesaById(Long id) {
		cadastroDespesa.deleteById(id);
	}

	public void deleteDespesa(Sala entity) {
		cadastroSala.delete(entity);
	}

	public float calculoLucroAnual() {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		float lucro = 0;
		try {
			List<Despesa> despesas = cadastroDespesa.listarDespesaPorIntervalo(
					sdf.parse(LocalDate.now().getYear() + "-01-01"), sdf.parse(LocalDate.now().getYear() + "-12-31"));
			List<Pagamento> pagamentos = cadastroPagamento.listarPagamentoPorIntervalo(
					sdf.parse(LocalDate.now().getYear() + "-01-01"), sdf.parse(LocalDate.now().getYear() + "-12-31"));

			lucro = (float) (-despesas.stream().mapToDouble(x -> x.getValor()).sum() + pagamentos.stream().mapToDouble(x -> x.getMatricula().getPlano().getPreco()).sum()) ;
			
			
			
		} catch (ParseException e) {
			System.out.println("Erro ao formatar data");
		}

		return lucro;
	}
	
	public void efetivarEstag(Professor entity, Long id) {
		cadastroProfessor.save(entity);
		cadastroProfessorEstagiario.findAll();
		cadastroProfessorEstagiario.deleteById(id);
	}
	
	public void atualizarSalarioContador(Contador entity, Long id) {
		cadastroContador.save(entity);
		cadastroContador.deleteById(id);
	}
	
	public void atualizarSaslarioProfessor(Professor entity, Long id) {
		cadastroProfessor.save(entity);
		cadastroProfessor.deleteById(id);
	}

}
