package com.proxibanque.presentation;

import java.util.Scanner;


import com.proxibanque.dao.ClientDao;
import com.proxibanque.dao.CompteCourantDao;
import com.proxibanque.dao.CompteDao;
import com.proxibanque.model.Agence;
import com.proxibanque.model.Client;
import com.proxibanque.service.Service;

public class MonApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("Bonjour dans notre Application ");
//		com.proxibanque.dao.
//		CompteCourantDao compteCourantDao = new com.proxibanque.dao.CompteCourantDao();
//		Service compte=new Service();
//		
//		compteCourantDao.listerComptes();
//		com.proxibanque.model.CompteCourant compte1=compteCourantDao.selectCompte();
//		com.proxibanque.model.CompteCourant compte2=compteCourantDao.selectCompte();
//		System.out.println(compte1+ " "+compte2);Scanner sc=new Scanner(System.in);
//		System.out.println("Entrer le Montant a verser");
//		double montant=sc.nextDouble();
//		compte.virementCompte(compte1, compte2, montant);
		
		//Déclaration des Agences, Gérants, Conseillers (Faire gaf à l'IdAgence)!
		
		

				// Affiche le menu de départ
						int choix = 11;
						do {
							System.out.println("+------------------- MENU ------------------+");
							System.out.println("| Taper 1 pour voir la liste des Agences    |");
							System.out.println("| Taper 3 pour quitter                      |"); //Toujours un soucis...sortie boucle grace à 3 et non 0...
							System.out.println("+-------------------------------------------+");
							// ENVOYER LA LISTE DES AGENCES AVEC POSSIBILITE DE CHOISIR AGENCE1 OU AGENCE2
							Scanner sc = new Scanner(System.in);
							choix = sc.nextInt();
							if (choix == 1) {
								System.out.println("Vous avez choisi l'Agence n° ");//+IEntite.get(Id)+"*/); ECRIRE LE N° DE L'AGENCE
								sc.nextLine();
								// AFFICHAGE MENU POUR CHOIX EN FONCTION DE L'ACTEUR
								System.out.println("+---------------- MENU CHOIX ---------------+");
								System.out.println("| Taper 1 si vous êtes un gérant d'agence   |");
								System.out.println("| Taper 2 si vous êtes un conseiller        |");
								System.out.println("| Taper 3 pour quitter                      |");
								System.out.println("+-------------------------------------------+");
				
								choix = sc.nextInt();
								
									if (choix == 1) {
										do {
											sc.nextLine();
											System.out.println("+------------------- MENU GERANT ------------------+");
											System.out.println("| Taper 1 pour auditer votre agence                |");
											System.out.println("| Taper 2 pour quitter                             |");
											System.out.println("+--------------------------------------------------+");
											choix = sc.nextInt();
					
											if (choix == 1) {
												sc.nextLine();
												System.out.println("+----------- GESTION DE VOTRE AGENCE -----------+");
												System.out.println("|                                               |");
												System.out.println("|******                                         |");
												System.out.println("|Voici la liste des particuliers de l'agence qui|\n"
																 + "|sont débiteurs de plus de 5000€ :              |");
												// Envoyer la liste des PARTICULIERS débiteurs de plus de 5000€
												System.out.println("|                                               |");
												System.out.println("|******                                         |");
												System.out.println("|Voici la liste des entreprises de l'agence qui |\n"
														         + "|sont débiteurs de plus de 50 000€ :            |");
												// Envoyer la liste des ENTREPRISES débiteurs de plus de 5000€
												System.out.println("|                                               |");
												System.out.println("+-----------------------------------------------+");
												} 
											} while (choix != 2);
											
											System.out.println("A BIENTOT...");
											return;
					
										}
									if (choix == 2) {
										do {
											sc.nextLine();
											System.out.println("+--------------------- MENU CONSEILLER ------------------+");
											System.out.println("| Taper 1 pour créer un client                           |");
											System.out.println("| Taper 2 pour modifier un client                        |");
											System.out.println("| Taper 3 pour lire les informations d'un client         |");
											System.out.println("| Taper 4 pour supprimer un client                       |");
											System.out.println("| Taper 5 pour simuler un crédit                         |");
											System.out.println("| Taper 6 pour effectuer un virement de compte à compte  |");
											System.out.println("| Taper 7 pour quitter                                   |");
											System.out.println("+--------------------------------------------------------+");
											choix = sc.nextInt();
					
											if (choix == 1) {
												sc.nextLine();
												System.out.println("+------ CREATION D'UN CLIENT ------+");
											}
											else if (choix == 2) {
												sc.nextLine();
												System.out.println("+------ MODIFICATION D'UN CLIENT ------+");
											}
											else if (choix == 3) {
												sc.nextLine();
												System.out.println("+------ LECTURE DES INFOS D'UN CLIENT ------+");
											}
											else if (choix == 4) {
												sc.nextLine();
												System.out.println("+------ SUPPRIMER UN CLIENT ------+");
											}
											else if (choix == 5) {
												sc.nextLine();
												System.out.println("+------ EFFECTUER UN CREDIT ------+");
											}
											else if (choix == 6) {
												sc.nextLine();
												System.out.println("+------ EFFECTUER UN VIREMENT ------+");
												CompteCourantDao compteCourantDao = new com.proxibanque.dao.CompteCourantDao();
												Service compte=new Service();
												
												compteCourantDao.listerComptes();
												com.proxibanque.model.CompteCourant compte1=compteCourantDao.selectCompte();
												com.proxibanque.model.CompteCourant compte2=compteCourantDao.selectCompte();
												System.out.println(compte1+ " "+compte2);Scanner sc1=new Scanner(System.in);
												System.out.println("Entrer le Montant a verser");
												double montant=sc.nextDouble();
												compte.virementCompte(compte1, compte2, montant);
											}

										} while (choix != 7);
										System.out.println("A BIENTOT...");
										return;
									}
							} while (choix != 3);
							System.out.println("A BIENTOT...");
							return;
						} while (choix != 3);
						
			}
		
	}


