package com.ectechsoftware.erp.Models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuariossys")
public class Usuariossys {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String password;
	
	@Column(unique = true)
	private String username;

	@OneToOne
	@JoinColumn(name = "id")
	Persona persona;

	@OneToMany(mappedBy = "usuariossys", cascade = CascadeType.ALL)
	private List<Rol> roles = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public List<Rol> getRoles() {
		return roles;
	}

	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Usuariossys [id=" + id + ", password=" + password + ", username=" + username + ", persona=" + persona
				+ ", roles=" + roles + "]";
	}

	


	

}
