package com.ectechsoftware.erp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="empresa")
public class Empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idempresa;
	
	@OneToOne
	@JoinColumn(name="idPersona")
	Persona persona;
	
	@OneToOne
	@JoinColumn(name="idcondicion")
	CondicionfrenteIva condicion;
	
	
	

	
}
