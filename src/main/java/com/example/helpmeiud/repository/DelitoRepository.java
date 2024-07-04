package com.example.helpmeiud.repository;

import com.example.helpmeiud.model.Delito;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional; // Importa Optional desde java.util

public interface DelitoRepository extends JpaRepository<Delito, Long> {
    // Método para buscar un delito por ID
    Optional<Delito> findById(Long id);
}
