package com.Autores.Autores.controller;

import com.Autores.Autores.entity.Autor;
import com.Autores.Autores.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController {

    private AutorService autorService;

    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    @PostMapping
    public Autor criarAutor(@RequestBody Autor autor){
        return autorService.criarAutor(autor);
    }

    @GetMapping
    public List<Autor> listar(){
        return autorService.listar();
    }

    @GetMapping("/{id}")
    public Autor buscarPorId(@PathVariable Long id){
        return autorService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarPorId(@PathVariable Long id){
        autorService.deletarPorId(id);
    }

}
