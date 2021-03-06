package com.ani.deva.cursomc;

import com.ani.deva.cursomc.dominio.Categoria;
import com.ani.deva.cursomc.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Artes");
		Categoria cat3 = new Categoria(null, "Comércio");
		Categoria cat4 = new Categoria(null, "Jornalismo");


		categoriaRepository.saveAll(Arrays.asList(cat1,cat2, cat3, cat4));
	}
}
