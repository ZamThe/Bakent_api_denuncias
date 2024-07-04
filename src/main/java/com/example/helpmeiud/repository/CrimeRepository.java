package com.example.helpmeiud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.helpmeiud.model.Crime;

public interface CrimeRepository extends JpaRepository<Crime, Long> {
    // Métodos de repositorio para Crime
}
