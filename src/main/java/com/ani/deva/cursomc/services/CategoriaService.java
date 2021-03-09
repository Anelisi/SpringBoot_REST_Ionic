package com.ani.deva.cursomc.services;

import com.ani.deva.cursomc.dominio.Categoria;
import com.ani.deva.cursomc.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria buscarId(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElse(null);
    }
}
