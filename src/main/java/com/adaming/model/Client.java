package com.adaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

@Entity
public class Client {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_client")
	private int idClient;
	
	private String nom;
	
	private String prenom;
	
	private String email;
	
	private String password;
	
	private String login;
	
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Client(int idClient) {
		super();
		this.idClient = idClient;
	}


	public Client(int idClient, String nom, String prenom, String email, int dateAller, int dateRetour,
			String password, String login) {
		super();
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;	
		this.password = password;
		this.login = login;
	}


	public int getIdClient() {
		return idClient;
	}


	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogin() {
		return login;
	}
	

	public void setLogin(String login) {
		this.login = login;
	}


	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email
				+  ", password=" + password + ", login="
				+ login + "]";
	}
	
	
}
