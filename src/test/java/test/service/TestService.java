package test.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.proxibanque.model.Compte;


class TestService {


	
	@Test
	void test() {
		ArrayList<Compte> listeCompte=new ArrayList<Compte>();
		Compte compte1=new Compte(1,3000,11/07/2018);
		Compte compte2=new Compte(2,2000,1/07/2018);
		Compte compte3=new Compte(3,2000,11/06/2018);
		Compte compte4=new Compte(4,5000,11/07/2019);
		Compte compte5=new Compte(5,7000,11/12/2018);
		listeCompte.add(compte1);
		listeCompte.add(compte2);
		listeCompte.add(compte3);
		listeCompte.add(compte4);
		listeCompte.add(compte5);
		for(Compte c:listeCompte)
		{
			System.out.println(c);
		}
		} 
	}


