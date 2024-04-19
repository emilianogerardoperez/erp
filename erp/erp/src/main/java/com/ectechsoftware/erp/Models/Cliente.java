package com.ectechsoftware.erp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="clientes")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idcliente;
	
	@OneToOne
	@JoinColumn(name="idPersona")
	Persona persona;
	
	@OneToOne
	@JoinColumn(name="idcondicion")
	CondicionfrenteIva condicion;

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
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
		return "Cliente [idcliente=" + idcliente + ", persona=" + persona + ", condicion=" + condicion + "]";
	}
	
	
	
	
	

	
	
}
