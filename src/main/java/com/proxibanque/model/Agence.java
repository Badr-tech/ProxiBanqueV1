package com.proxibanque.model;

public class Agence {

	private int numId;
	private int dateDeCreation;
	

	// Getters & setters

	public int getNumId() {
		return numId;
	}

	public void setNumId(int numId) {
		this.numId = numId;
	}

	public int getDateDeCreation() {
		return dateDeCreation;
	}

	public void setDateDeCreation(int dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}

	// Constructeurs

	public Agence(int numId, int dateDeCreation) {
		super();
		this.numId = numId;
		this.dateDeCreation = dateDeCreation;
	}

	public Agence() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Agence [numId=" + numId + ", dateDeCreation=" + dateDeCreation + "]";
	}

	

	
}
