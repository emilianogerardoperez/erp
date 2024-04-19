package com.ectechsoftware.erp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="condicionfrenteiva")
public class CondicionfrenteIva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idcondicion;
	String nombre;
	
	public int getIdcondicion() {
		return idcondicion;
	}
	public void setIdcondicion(int idcondicion) {
		this.idcondicion = idcondicion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "CondicionfrenteIva [idcondicion=" + idcondicion + ", nombre=" + nombre + "]";
	}
	
	
}
