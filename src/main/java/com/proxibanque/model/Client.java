package com.proxibanque.model;



public class Client extends Personne {

	private String typeClient;
	private CompteCourant compteCourant;
	private CompteEpargne compteEpargne;
	
	//Getters & setters
	public String getTypeClient() {
		return typeClient;
	}
	public void setTypeClient(String typeClient) {
		this.typeClient = typeClient;
	}
	public CompteCourant getCompteCourant() {
		return compteCourant;
	}
	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}
	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}
	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
	}
	
	// Constructeurs
	public Client(int id, String nom, String prenom, int codePostal, int telephone, String ville, String typeClient,
			CompteCourant compteCourant, CompteEpargne compteEpargne) {
		super(id, nom, prenom, codePostal, telephone, ville);
		this.typeClient = typeClient;
		this.compteCourant = compteCourant;
		this.compteEpargne = compteEpargne;
	}
	
	public Client(int id, String nom, String prenom, int codePostal, int telephone, String ville, String typeClient) {
		super(id, nom, prenom, codePostal, telephone, ville);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return super.getId()+" "+super.getNom()+" "+super.getPrenom()+" "+super.getCodePostal()+" "+super.getTelephone()+" "+super.getVille()+ " "+typeClient;
	}
	
	

	
	
}
