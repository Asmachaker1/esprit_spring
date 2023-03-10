package com.example.esprit.service;

import com.example.esprit.model.Etudiant;

import java.util.List;

public interface EtudiantService {

    Etudiant addEtudiant(Etudiant etudiant);


    Etudiant updateEtudiant(Etudiant etudiant);


    void deleteEtudiant(int id);

    List<Etudiant> findAllEtudiants();
}
