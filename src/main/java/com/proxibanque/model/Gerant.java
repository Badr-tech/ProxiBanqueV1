package com.proxibanque.model;

public class Gerant extends Personne {

	private String login;
	private String password;

	// Constructeurs
	public Gerant(int id, String nom, String prenom, int codePostal, int telephone, String ville, String login,
			String password) {
		super(id, nom, prenom, codePostal, telephone, ville);
		this.login = login;
		this.password = password;
	}

	// Gettesr & Setters
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Gerant [login=" + login + ", password=" + password + "]";
	}
	

}
