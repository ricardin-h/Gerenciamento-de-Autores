package com.Autores.Autores.service;

import com.Autores.Autores.entity.Autor;
import com.Autores.Autores.repositories.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    @Autowired
    private Repository repository;

    public Autor criarAutor(Autor autor){
        return repository.save(autor);
    }

    public List<Autor> listar(){
        return repository.findAll();
    }

    public Autor buscarPorId(Long id){
        return repository.findById(id).get();
    }

    public void deletarPorId(Long id){
        repository.deleteById(id);
    }

}
