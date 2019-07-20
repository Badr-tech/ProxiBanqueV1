package com.proxibanque.model;

public class Compte {

	
	private int numCompte;
	private double solde;
	private int dateOverture;
	
	//Getters & setters
	
	public int getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public int getDateOverture() {
		return dateOverture;
	}
	public void setDateOverture(int dateOverture) {
		this.dateOverture = dateOverture;
	}
	
	//Constructeurs
	
	public Compte(int numCompte, int solde, int dateOverture) {
		super();
		this.numCompte = numCompte;
		this.solde = solde;
		this.dateOverture = dateOverture;
	}
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Compte [numCompte=" + numCompte + ", solde=" + solde + ", dateOverture=" + dateOverture + "]";
	}
	
	
	
	
	
}
