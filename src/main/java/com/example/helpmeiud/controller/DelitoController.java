package com.example.helpmeiud.controller;

import com.example.helpmeiud.model.Delito;
import com.example.helpmeiud.repository.DelitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/delitos")
public class DelitoController {

    @Autowired
    private DelitoRepository delitoRepository;

    @GetMapping("/{id}")
    public ResponseEntity<?> getDelitoById(@PathVariable Long id) {
        Optional<Delito> delito = delitoRepository.findById(id);
        if (delito.isPresent()) {
            return ResponseEntity.ok(delito.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/reportar")
    public ResponseEntity<?> reportarDelito(@RequestBody Delito delito) {
        Delito nuevoDelito = delitoRepository.save(delito);
        return ResponseEntity.ok(nuevoDelito);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> actualizarDelito(@PathVariable Long id, @RequestBody Delito delitoData) {
        Optional<Delito> optionalDelito = delitoRepository.findById(id);
        if (optionalDelito.isPresent()) {
            Delito existingDelito = optionalDelito.get();
            existingDelito.setDescripcion(delitoData.getDescripcion());
            // Actualizar otros campos según sea necesario
            delitoRepository.save(existingDelito);
            return ResponseEntity.ok(existingDelito);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarDelito(@PathVariable Long id) {
        Optional<Delito> optionalDelito = delitoRepository.findById(id);
        if (optionalDelito.isPresent()) {
            delitoRepository.deleteById(id);
            return ResponseEntity.ok("Delito eliminado correctamente");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
