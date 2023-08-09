package com.api.cadastrocrud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.api.cadastrocrud.model.CadastroModel;
import com.api.cadastrocrud.repository.CadastroRepository;

@SpringBootApplication
public class CadastroCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroCrudApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(CadastroRepository cadastroRepository) {
		return args -> {
			cadastroRepository.deleteAll();

			CadastroModel c = new CadastroModel();
			c.setCity("Barreiras");
			c.setState("Bahia");
			c.setNeighborhood("Barreirinhas");
			c.setStreet("Rua senhor dos Aflitos");
			c.setNumber("582");
			c.setZipCode("47810716");
			cadastroRepository.save(c);
		};
	}
}
