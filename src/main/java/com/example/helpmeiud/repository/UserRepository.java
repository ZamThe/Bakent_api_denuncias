package com.example.helpmeiud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.helpmeiud.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // Métodos de repositorio para User
}
