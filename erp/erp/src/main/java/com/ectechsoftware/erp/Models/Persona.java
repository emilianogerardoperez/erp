package com.ectechsoftware.erp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "personas")
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idPersona;
	String apellido;
	String nombre;
	String direccion;
	String telefono;
	String mail;
	String numdocumento;

	@OneToOne
	@JoinColumn(name = "idtiposdocumentos")
	TiposDocumentos documento;

	public int getIdpersona() {
		return idPersona;
	}

	public void setIdpersona(int idpersona) {
		this.idPersona = idpersona;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNumdocumento() {
		return numdocumento;
	}

	public void setNumdocumento(String numdocumento) {
		this.numdocumento = numdocumento;
	}

	public TiposDocumentos getDocumento() {
		return documento;
	}

	public void setDocumento(TiposDocumentos documento) {
		this.documento = documento;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", apellido=" + apellido + ", nombre=" + nombre + ", direccion="
				+ direccion + ", telefono=" + telefono + ", mail=" + mail + ", numdocumento=" + numdocumento
				+ ", documento=" + documento + "]";
	}

}
