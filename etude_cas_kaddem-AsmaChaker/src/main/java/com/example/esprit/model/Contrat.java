package com.example.esprit.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Contrat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idContrat;
	@Temporal(TemporalType.DATE)
	private Date dateDebutContrat;
	@Temporal(TemporalType.DATE)
	private Date dateFinContrat;
	private Specialite specialite;
	@ManyToOne
	private Etudiant etudiant; 
}
