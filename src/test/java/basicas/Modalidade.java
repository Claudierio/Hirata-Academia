package basicas;

public abstract class Modalidade {
	private String nome;
	private int duracao;
	private String intensidade;

	public Modalidade(String nome, int duracao, String intensidade) {
		super();
		this.nome = nome;
		this.duracao = duracao;
		this.intensidade = intensidade;
	}

}
