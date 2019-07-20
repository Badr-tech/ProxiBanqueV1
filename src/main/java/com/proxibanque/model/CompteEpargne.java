package com.proxibanque.model;



public class CompteEpargne extends Compte{
	
	private int tauxRemuneration;
	private Client client;
	
	//Constructeurs
	public CompteEpargne(int numCompte, int solde, int dateOverture, int tauxRemuneration, Client client) {
		super(numCompte, solde, dateOverture);
		this.tauxRemuneration = tauxRemuneration;
		this.client = client;
	}

	//Getters & setters
	public int getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(int tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "CompteEpargne [tauxRemuneration=" + tauxRemuneration + ", client=" + client + "]";
	}

	
	
}
