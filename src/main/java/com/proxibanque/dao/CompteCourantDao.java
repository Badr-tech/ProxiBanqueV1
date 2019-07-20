package com.proxibanque.dao;

import java.util.ArrayList;
import java.util.Scanner;

import com.proxibanque.model.Client;
import com.proxibanque.model.CompteCourant;

public class CompteCourantDao {

	ArrayList<CompteCourant> listeCompteCourant;

	// Liste Comptes
	public ArrayList<CompteCourant> listeCompteCourant() {
		listeCompteCourant = new ArrayList<CompteCourant>();
		Client client1 = new Client(1, "baatouti", "badr", 20300, 0634677455, "casa", "particulier");
		Client client2 = new Client(2, "baaziz", "chaimaa", 20400, 063467455, "casa", "particulier");
		Client client3 = new Client(3, "wahabi", "mohamed", 20500, 0634665455, "casa", "particulier");
		CompteCourant compteCourant1 = new CompteCourant(1, 3000, client1, 12 / 06 / 21019, 5000);
		CompteCourant compteCourant2 = new CompteCourant(2, 4000, client2, 16 / 03 / 2019, 5000);
		CompteCourant compteCourant3 = new CompteCourant(3, 5000, client3, 17 / 10 / 2019, 5000);
		listeCompteCourant.add(compteCourant1);
		listeCompteCourant.add(compteCourant2);
		listeCompteCourant.add(compteCourant3);
		return listeCompteCourant;
	}

	// methode de retrait
	public void retraitDao(CompteCourant compte, double montant) {
		ArrayList<CompteCourant> listeCompte = listeCompteCourant();
		CompteCourantDao c = new CompteCourantDao();
		int i = c.RechercherCompte(compte);
		double sold = listeCompte.get(i).getSolde();
		if (montant < sold + listeCompte.get(i).getPlafond()) {
			sold = sold - montant;
		} else {
			System.out.println("Compte insolvable");
			System.exit(0);
		}

		System.out.println(sold);
	}

	// methode virement
	public void virementDao(CompteCourant compte, double montant) {
		ArrayList<CompteCourant> listeCompte = listeCompteCourant();
		CompteCourantDao c = new CompteCourantDao();
		int i = c.RechercherCompte(compte);
		double sold = listeCompte.get(i).getSolde();
		sold = sold + montant;
		listeCompte.get(i).setSolde(sold);

		System.out.println(sold);
	}

	// rechercher compte
	public int RechercherCompte(CompteCourant compte) {
		ArrayList<CompteCourant> listeCompte = listeCompteCourant();
		int i = listeCompte.indexOf(compte);
		return i;
	}

	// methode lister compte
	public void listerComptes() {
		ArrayList<CompteCourant> listeCompte = listeCompteCourant();
		int i = 1;
		for (CompteCourant c : listeCompte) {
			System.out.println(i + " " + c);
			i++;
		}

	}

	// Select Compte
	public CompteCourant selectCompte() {
		ArrayList<CompteCourant> listeCompteCourant = listeCompteCourant();
		Scanner sc = new Scanner(System.in);
		System.out.println("choisissez le compte ->");
		int num = sc.nextInt();
		CompteCourant compteEmetteur = listeCompteCourant.get(num - 1);
		return compteEmetteur;

	}

}
