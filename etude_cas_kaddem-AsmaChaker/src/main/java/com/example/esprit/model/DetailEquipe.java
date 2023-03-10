package com.example.esprit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class DetailEquipe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDetailEquipe;
	private int salle;
	private String thematique;
	@OneToOne(mappedBy = "detailEquipe")
	private Equipe equipe;
}
