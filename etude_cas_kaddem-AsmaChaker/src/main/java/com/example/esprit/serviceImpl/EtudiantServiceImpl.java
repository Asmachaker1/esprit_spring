package com.example.esprit.serviceImpl;

import com.example.esprit.model.Etudiant;
import com.example.esprit.repository.EtudiantRepository;
import com.example.esprit.service.EtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements EtudiantService {

    private final EtudiantRepository etudiantRepository;

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public void deleteEtudiant(int id) {
        etudiantRepository.deleteById(id);
    }

    @Override
    public List<Etudiant> findAllEtudiants() {
        return etudiantRepository.findAll();
    }
}
