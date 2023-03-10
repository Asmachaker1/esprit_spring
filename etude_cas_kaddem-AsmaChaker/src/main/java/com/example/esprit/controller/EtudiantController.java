package com.example.esprit.controller;

import com.example.esprit.model.Etudiant;
import com.example.esprit.service.EtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/etudiants")
@AllArgsConstructor
public class EtudiantController {

    private final EtudiantService etudiantService;

    @PostMapping
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant){
        return etudiantService.addEtudiant(etudiant);
    }

    @PutMapping
    public Etudiant updateEtudiant(@RequestBody Etudiant etudiant){
        return etudiantService.updateEtudiant(etudiant);
    }

    @GetMapping
    public List<Etudiant> findAllEtudiants(){
        return etudiantService.findAllEtudiants();
    }

    @DeleteMapping("/{id}")
    public void deleteEtudiants(@PathVariable int id){
        etudiantService.deleteEtudiant(id);
    }

}
