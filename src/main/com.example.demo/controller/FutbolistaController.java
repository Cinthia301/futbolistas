package com.example.demo.controller;

import com.example.demo.entity.Futbolista;
import com.example.demo.repository.FutbolistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/futbolista")
public class FutbolistaController {

    @Autowired
    private FutbolistaRepository futbolistaRepository;

    @GetMapping
    public List<Futbolista> getAllFutbolistas() {
        return futbolistaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Futbolista> getFutbolistaById(@PathVariable Long id) {
        return futbolistaRepository.findById(id);
    }
}
