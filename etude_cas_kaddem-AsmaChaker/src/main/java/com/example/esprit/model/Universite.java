package com.example.esprit.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Universite {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUniv;
	private String nomUniv;
	@OneToMany
	List<Department> departments;
}
