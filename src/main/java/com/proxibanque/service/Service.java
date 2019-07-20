package com.proxibanque.service;

import com.proxibanque.dao.ClientDao;
import com.proxibanque.dao.CompteCourantDao;
import com.proxibanque.dao.CompteDao;
import com.proxibanque.model.Client;
import com.proxibanque.model.Compte;
import com.proxibanque.model.CompteCourant;

public class Service {

	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void ajouterClient(Client client) {
		ClientDao c = new ClientDao();
		c.ajouterClient(client);

	}

	public boolean virementCompteCourant(CompteCourant compte1, CompteCourant compte2, double montant) {
		CompteCourantDao d = new CompteCourantDao();
		d.retraitDao(compte1, montant);
		d.virementDao(compte2, montant);
		System.out.println("virement avec succès");
		return true;
	}

	public boolean virementCompte(Compte compte1, Compte compte2, double montant) {
		CompteDao d = new CompteDao();
		d.retraitDao(compte1, montant);
		d.virementDao(compte2, montant);
		System.out.println("virement avec sucsse");
		return true;
	}

}
