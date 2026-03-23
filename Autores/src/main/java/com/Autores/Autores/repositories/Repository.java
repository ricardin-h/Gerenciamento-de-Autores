package com.Autores.Autores.repositories;

import com.Autores.Autores.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Autor, Long> {
}