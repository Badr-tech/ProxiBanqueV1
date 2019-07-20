package com.proxibanque.model;

public class ConseilleClient extends Personne {

	private String login;
	private String password;

	// Constructeurs

	public ConseilleClient(int id, String nom, String prenom, int codePostal, int telephone, String ville) {
		super(id, nom, prenom, codePostal, telephone, ville);
		// TODO Auto-generated constructor stub
	}

	// Getters & Setters

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
		return "ConseilleClient [login=" + login + ", password=" + password + "]";
	}

}
