package com.example.esprit.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Equipe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEquipe;
	private String nomEquipe;
	private Niveau niveau;
	@OneToOne
	private DetailEquipe detailEquipe;
	@ManyToMany(mappedBy = "equipes")
	private List<Etudiant> etudiants;  
}
