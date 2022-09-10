package br.com.hirataacademia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.hirataacademia.basicas.Plano;
import br.com.hirataacademia.repositorios.RepositorioPlano;

@SpringBootApplication
public class HirataAcademiaApplication implements CommandLineRunner{
	@Autowired
	private RepositorioPlano rp;
	public static void main(String[] args) {
		SpringApplication.run(HirataAcademiaApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		rp.deleteById(Long.valueOf(1));
	}
}
