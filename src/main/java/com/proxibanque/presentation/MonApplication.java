package com.proxibanque.presentation;

import java.util.Scanner;


import com.proxibanque.dao.ClientDao;
import com.proxibanque.dao.CompteDao;
import com.proxibanque.model.Agence;
import com.proxibanque.model.Client;
import com.proxibanque.service.Service;

public class MonApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Bonjour dans notre Application ");
		com.proxibanque.dao.
		CompteCourantDao compteCourantDao = new com.proxibanque.dao.CompteCourantDao();
		Service compte=new Service();
		
		compteCourantDao.listerComptes();
		com.proxibanque.model.CompteCourant compte1=compteCourantDao.selectCompte();
		com.proxibanque.model.CompteCourant compte2=compteCourantDao.selectCompte();
		System.out.println(compte1+ " "+compte2);Scanner sc=new Scanner(System.in);
		System.out.println("Entrer le Montant a verser");
		double montant=sc.nextDouble();
		compte.virementCompte(compte1, compte2, montant);
		
	}

}
