package com.example.esprit.repository;

import com.example.esprit.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository <Etudiant , Integer>{
}
