package br.com.etechoracio.pw2.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.etechoracio.pw2.jpa.entity.Usuario;
import br.com.etechoracio.pw2.jpa.repository.UsuarioRepository;

@SpringBootApplication
public class Pw2JpaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Pw2JpaApplication.class, args);
	}

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Usuario usuario = Usuario.builder().txNome("horario.augusto").
				txSenha("etec123").build();
		usuarioRepository.save(usuario);
	}

}
