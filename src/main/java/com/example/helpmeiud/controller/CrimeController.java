package com.example.helpmeiud.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CrimeController {
    
    @GetMapping("/casos/{id}")
    public String getCase(@PathVariable Long id) {
        return "Obtener caso de inseguridad con ID: " + id;
    }
    
    @PostMapping("/casos/reportar")
    public String reportCase(@RequestBody String caseData) {
        return "Reportar nuevo caso de inseguridad";
    }
    
    @PutMapping("/casos/{id}")
    public String updateCase(@PathVariable Long id, @RequestBody String caseData) {
        return "Actualizar caso de inseguridad con ID: " + id;
    }
    
    @DeleteMapping("/casos/{id}")
    public String deleteCase(@PathVariable Long id) {
        return "Eliminar caso de inseguridad con ID: " + id;
    }
}
