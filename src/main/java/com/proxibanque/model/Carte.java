package com.proxibanque.model;

public class Carte {

	private int numeroCarte;
	private String typeCarte;
	private boolean activation;

	// Constructeurs
	public Carte(int numeroCarte, String typeCarte, boolean activation) {
		super();
		this.numeroCarte = numeroCarte;
		this.typeCarte = typeCarte;
		this.activation = activation;
	}

	// Getters & Setters
	public int getNumeroCarte() {
		return numeroCarte;
	}

	public void setNumeroCarte(int numeroCarte) {
		this.numeroCarte = numeroCarte;
	}

	public String getTypeCarte() {
		return typeCarte;
	}

	public void setTypeCarte(String typeCarte) {
		this.typeCarte = typeCarte;
	}

	public boolean isActivation() {
		return activation;
	}

	public void setActivation(boolean activation) {
		this.activation = activation;
	}

	@Override
	public String toString() {
		return "Carte [numeroCarte=" + numeroCarte + ", typeCarte=" + typeCarte + ", activation=" + activation + "]";
	}
	

}
