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
	int id;
	
	@OneToOne
	@JoinColumn(name="id")
	Persona persona;
	
	@OneToOne
	@JoinColumn(name="id")
	CondicionfrenteIva condicion;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public CondicionfrenteIva getCondicion() {
		return condicion;
	}

	public void setCondicion(CondicionfrenteIva condicion) {
		this.condicion = condicion;
	}

	@Override
	public String toString() {
		return "Empresa [id=" + id + ", persona=" + persona + ", condicion=" + condicion + "]";
	}
	
	
	

	
}
