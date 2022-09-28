package basicas;

public class Endereco {

	private long cep;
	private String numero;
	private String bairro;
	private String municipio;
	private String uf;

	public Endereco(long cep, String numero, String bairro, String municipio, String uf) {
		super();
		this.cep = cep;
		this.numero = numero;
		this.bairro = bairro;
		this.municipio = municipio;
		this.uf = uf;
	}

}
