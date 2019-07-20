package com.proxibanque.dao;

import java.util.ArrayList;
import java.util.Scanner;

import com.proxibanque.model.Compte;

public class CompteDao {
	ArrayList<Compte> listeCompte = new ArrayList<Compte>();

	// Liste comptes
	public ArrayList<Compte> listeCompte() {
		Compte compte1 = new Compte(1, 3000, 12 / 06 / 21019);
		Compte compte2 = new Compte(2, 4000, 16 / 03 / 2019);
		Compte compte3 = new Compte(3, 5000, 17 / 10 / 2019);
		listeCompte.add(compte1);
		listeCompte.add(compte2);
		listeCompte.add(compte3);
		return listeCompte;

	}

	// Mthode trouver compte
	public int trouverCompte(Compte compte) {
		ArrayList<Compte> listComptes = listeCompte();
		int i = listComptes.indexOf(compte);
		return i;

	}

	// Methode retrait
	public void retraitDao(Compte compte, double montant) {
		ArrayList<Compte> listeCompte = listeCompte();
		CompteDao cpt = new CompteDao();
		int i = cpt.trouverCompte(compte);
		double solde = listeCompte.get(i).getSolde();
		solde = solde - montant;
		System.out.println(solde);
	}
	// Methode virement
	public void virementDao(Compte compte, double montant) {
		ArrayList<Compte> listeCompte = listeCompte();
		CompteDao cpt = new CompteDao();
		int i = cpt.trouverCompte(compte);
		double solde = listeCompte.get(i).getSolde();
		solde = solde + montant;
		System.out.println(solde);
		
	}
	//Methode lister compte
	public void listerCompte() {
		ArrayList<Compte>listeCompte= listeCompte();
		int i = 1;
		for(Compte c : listeCompte)
			System.out.println(i+" "+c);
			i++;
	}

	//Selectionner compte emetteur
	public Compte selectCompteEmetteur() {
		ArrayList<Compte> listeCompte= listeCompte();
		Scanner sc = new Scanner(System.in);
		System.out.println("Selectionner compte emetteur->");
		int i = sc.nextInt();
		Compte compteEmetteur = listeCompte.get(i -1);
		return compteEmetteur;
	}
	
	//Selectionner compte recepteur
		public Compte selectCompteRecepteur() {
			ArrayList<Compte> listeCompte= listeCompte();
			Scanner sc = new Scanner(System.in);
			System.out.println("Selectionner compte recepteur->");
			int i = sc.nextInt();
			Compte compteRecepteur = listeCompte.get(i -1);
			return compteRecepteur;
		}
}
