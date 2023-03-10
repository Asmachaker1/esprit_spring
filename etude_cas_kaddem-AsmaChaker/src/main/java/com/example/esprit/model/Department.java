package com.example.esprit.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDepart;
	private String nomDepart;
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "department")
	List<Etudiant> etudiants;
}
