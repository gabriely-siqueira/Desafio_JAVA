package com.example.veiculo;

import com.example.veiculo.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VeiculoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(VeiculoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();

	}
}


