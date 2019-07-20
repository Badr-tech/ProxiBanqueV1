package com.proxibanque.model;

public class Personne {

	private int id;
	private String nom;
	private String prenom;
	private int codePostal;
	private int telephone;
	private String ville;

	// Getters et setters


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	// Constructeurs
	public Personne(int id, String nom, String prenom, int codePostal, int telephone, String ville) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.codePostal = codePostal;
		this.telephone = telephone;
		this.ville = ville;
	}


	// Methode toString
	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", codePostal=" + codePostal
				+ ", telephone=" + telephone + ", ville=" + ville + "]";
	}
	

}
