package com.aantivero.eeff;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class EntidadController {

    private EntidadRepository repository;

    public EntidadController(EntidadRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/bancos")
    @CrossOrigin(origins = {"http://localhost:3000", "http://localhost:5000"})
    public Collection<Entidad> bancos() {
        return repository.findAll().stream().filter(this::isBanco).collect(Collectors.toList());
    }

    @GetMapping("/entidades")
    @CrossOrigin(origins = {"http://localhost:3000", "http://localhost:5000"})
    public Collection<Entidad> entidades() {
        return repository.findAll().stream().collect(Collectors.toList());
    }

    private boolean isBanco(Entidad entidad) {
        return entidad.getCodigoNumerico() < 1000;
    }
}
