package com.ectechsoftware.erp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="roles")
public class Rol {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idrol;
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "idusuariossys")
	private Usuariossys usuariossys;
	
	
	public int getIdrol() {
		return idrol;
	}
	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Usuariossys getUsuariossys() {
		return usuariossys;
	}
	public void setUsuariossys(Usuariossys usuariossys) {
		this.usuariossys = usuariossys;
	}
	@Override
	public String toString() {
		return "Rol [idrol=" + idrol + ", nombre=" + nombre + ", usuariossys=" + usuariossys + "]";
	}
	
}
