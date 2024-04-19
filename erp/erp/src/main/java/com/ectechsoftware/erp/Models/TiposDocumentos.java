package com.ectechsoftware.erp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tiposdocumentos")
public class TiposDocumentos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idtiposdocumentos;
	String nombre;
	public int getIdtipodocumento() {
		return idtiposdocumentos;
	}
	public void setIdtipodocumento(int idtipodocumento) {
		this.idtiposdocumentos = idtipodocumento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "TipDocumento [idtipodocumento=" + idtiposdocumentos + ", nombre=" + nombre + "]";
	}
	
	
}
