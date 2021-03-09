package com.ani.deva.cursomc.repositories;

import com.ani.deva.cursomc.dominio.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
