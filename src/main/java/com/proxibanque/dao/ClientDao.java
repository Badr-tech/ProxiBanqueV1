package com.proxibanque.dao;

import java.util.ArrayList;

import com.proxibanque.model.Client;

public class ClientDao {

	public ClientDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	ArrayList<Client> listeClient = new ArrayList<Client>();

	// Lister client
	public ArrayList<Client> listeClient() {

		Client clt1 = new Client(1, "baatouti", "badr", 20300, 0634677455, "casa", "particulier");
		Client clt2 = new Client(2, "baaziz", "chaimaa", 20400, 063467455, "casa", "particulier");
		Client clt3 = new Client(3, "wahabi", "mohamed", 20500, 0634665455, "casa", "particulier");
		listeClient.add(clt1);
		listeClient.add(clt2);
		listeClient.add(clt3);
		return listeClient;

	}

	// Ajouter client
	public void ajouterClient(Client client) {
		listeClient.add(client);
		System.out.println("Ajouter");
		for (Client c : listeClient)
			System.out.println(c);
	}
}
