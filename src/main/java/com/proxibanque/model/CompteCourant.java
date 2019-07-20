package com.proxibanque.model;

public class CompteCourant extends Compte {

	private Client Client;
	private double plafond;

	// Contructeurs

	public CompteCourant(int numCompte, int solde,  com.proxibanque.model.Client client,int dateOverture,
			double plafond) {
		super(numCompte, solde, dateOverture);
		Client = client;
		this.plafond = plafond;
	}

	// Getters & setters
	public Client getClient() {
		return Client;
	}

	public void setClient(Client client) {
		Client = client;
	}

	public double getPlafond() {
		return plafond;
	}

	public void setPlafond(double plafond) {
		this.plafond = plafond;
	}

	@Override
	public String toString() {
		return "CompteCourant [Client=" + Client + ", plafond=" + plafond + ", getNumCompte()=" + getNumCompte()
				+ ", getSolde()=" + getSolde() + ", getDateOverture()=" + getDateOverture() + "]";
	}
//	@Override
//	public boolean equals(Object compteCourant) {
//		if(compteCourant instanceof CompteCourant) {
//				CompteCourant compteCaste=(CompteCourant) compteCourant;
//				if(this.getNumero()== compteCaste.getNumero())
//				{
//					return true;
//				}
//				else 
//				{
//					return false;
//				}
//		}
//		else {
//			return false;
//			}
//		
//	}

}
