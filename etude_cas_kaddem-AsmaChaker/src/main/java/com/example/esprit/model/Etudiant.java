package com.example.esprit.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Etudiant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idEtudiant;
	String prenomE;
	String nomE;
	@Enumerated(EnumType.STRING)
	Option op;
	@Temporal(TemporalType.DATE)
	Date dateNaissance;
	@ManyToOne
	Department department;
	@ManyToMany
	private List<Equipe> equipes;
	@OneToMany(mappedBy = "etudiant")
	private List<Contrat> contrats;
}
