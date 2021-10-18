package fr.banque;

import java.util.ArrayList;
import java.util.HashMap;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Je crée un client
//		Client client = new Client("Debuisson", "Vincent", 222, 38, new Compte[5]);
//		System.out.println(client);
//		
//		//j'ajoute des comptes
//		Compte cpt1 = new Compte(12001, 250.00);
//		
//		client.ajouterCompte(cpt1);
//		client.ajouterCompte(cpt1);// j'ajoute 2 fois le meme compte
//		
//		//Je crée des comptes
//		Compte cpt2 = new Compte(12002, 200.00);
//		Compte cpt3 = new Compte(43003, 300.00);
//		Compte cpt4 = new Compte(52004, 400.00);
//		Compte cpt5 = new Compte(65005, 500.00);
//		Compte cpt6 = new Compte(12006, 600.00);
//		//Je les ajoute
//		client.ajouterCompte(cpt2);
//		client.ajouterCompte(cpt3);
//		client.ajouterCompte(cpt4);
//		client.ajouterCompte(cpt5);
//		client.ajouterCompte(cpt6);
//		System.out.println(client);
//		
//		//Je récupère un compte chez le client
//		Compte cptRecup = client.getCompte(12001);
//		System.out.println("J'ai recupere le compte : " +cptRecup);
//		//Je récupère un compte pas chez le client
//		Compte cptRecupPas = client.getCompte(23000);
//		System.out.println(cptRecupPas);
		
		
		
		
		
		
		
		
		
		//EXERCICE 7
//		//Je crée un compte CompteRemunere pour les tests
//		CompteRemunere cr = new CompteRemunere(12345, 200.00, 2.4);
////		System.out.println("Avec un taux a " + cr.getTaux() + "%, et un solde de " + cr.getSolde() + " les interets sont de :" + cr.calculerInterets());
////		//je change le solde du compte en ajoutant les interets de fin d'année
////		cr.verserInterets();
////		System.out.println("Le solde du compte est passe à " + cr.getSolde());
//		
//		//Je crée un compte à seuil limite
//		CompteASeuil cas = new CompteASeuil(54321, 100.00, 25);
////		cas.retirer(50);
////		System.out.println(cas);
////		cas.retirer(26);
////		System.out.println(cas);
//		
//		//Je rajoute ces comptes à un Client
//		Client cli = new Client("Debuisson", "Vincent", 22022, 38, new Compte[5]);
//		cli.ajouterCompte(cr);
//		cli.ajouterCompte(cas);
//		cli.ajouterCompte(new Compte(999, 120.00));
//		System.out.println(cli);
//		//Je verse les intérets sur les comptes qui peuvent être rémunérés
//		System.out.println("Je verse les interets sur les comptes :");
//		cli.verserLesInteretsSurLesComptes();
//		System.out.println(cli);
		
		
		
		
		
		
		
		
		
		
		
		//EXERCICE 8 : Ajout COmpteASeuilRémunere
//		
//		//Je crée un client 
//		Client cli2 = new Client("Debuisson", "Vincent", 22022, 38, new Compte[5]);
//		//Je crée un compte CompteRemunere pour les tests
//		ICompteRemunere cr2 = new CompteRemunere(12345, 200.00, 2.4);
//		//Je crée un compte à seuil limite
//		ICompteASeuil cas2 = new CompteASeuil(54321, 100.00, 25);
//		//Je crée un compte à seuil limite rémunere
//		ICompteASeuil casr2 = new CompteASeuilRemunere(0121212, 150, 25, 2.2);
//		
//		//J'ajoute les comptes à mon client
//		try {
//			cli2.ajouterCompte(cr2);
//			cli2.ajouterCompte(cas2);
//			cli2.ajouterCompte(new Compte(999, 120.00));
//			cli2.ajouterCompte(casr2);
//		}catch(BanqueException e) {
//			System.out.println("Le tableau de compte est plein");
//			e.printStackTrace();
//		}
//		
//		//J'affice ce client
//		System.out.println(cli2);
//		
//		//Je verse les intérets sur les comptes qui peuvent être rémunérés
//		System.out.println("Je verse les interets sur les comptes :");
//		cli2.verserLesInteretsSurLesComptes();
//		System.out.println(cli2);
		
		//J'enlève de l'argent des comptes à Seuil
		//PAS DEMANDE
		
		
		
		
		
		
		
		
		
		
		//EXERCICE 9 AJOUT DE L'EXCEPTION BANQUEEXCEPTION
//		//Je crée un client 
//		Client cli3 = new Client("Debuisson", "Vincent", 22022, 38, new Compte[5]);
//		//Je crée un compte CompteRemunere pour les tests
//		ICompteRemunere cr3 = new CompteRemunere(12345, 200.00, 2.4);
//		//Je crée un compte à seuil limite
//		ICompteASeuil cas3 = new CompteASeuil(54321, 100.00, 25);
//		//Je crée un compte à seuil limite rémunere
//		ICompteASeuil casr3 = new CompteASeuilRemunere(0121212, 150, 25, 2.2);
//		
//		//J'ajoute les comptes à mon client
//		try {
//			cli3.ajouterCompte(cr3);
//			cli3.ajouterCompte(cas3);
//			cli3.ajouterCompte(new Compte(999, 120.00));
//			cli3.ajouterCompte(casr3);
//			cli3.ajouterCompte(new Compte(10001, 300.00));
//			cli3.ajouterCompte(new Compte(10002, 300.00));
//		}catch(BanqueException e) {
//			System.out.println("Le tableau de compte est plein");
//			e.printStackTrace();
//		}
//		System.out.println("Apres l'exception");
//		
//		//Je retire plus que ce qu'il faut sur le compteASeuil
//		try {
//		for (ICompte compte : cli3.getTabComptes()) {
//			if(compte instanceof CompteASeuil) {
//				((CompteASeuil) compte).retirer(100);
//			}
//		}
//		}catch(BanqueException e) {
//			e.printStackTrace();
//		}
//		System.out.println(cli3);

		
		
		
		
		
		
		
		
		
		
		
		//EXERCICE 10 REMPLACER UNE LISTE A LA PLACE DU TABLEAU
//		Client clientList = new Client("Debuisson", "Vincent", 222, 38, new ArrayList<>());
//		System.out.println(clientList);
//		
//		//j'ajoute des comptes
//		Compte cpt1 = new Compte(12001, 250.00);
//		
//		try {
//			clientList.ajouterCompte(cpt1);
//			clientList.ajouterCompte(cpt1);// j'ajoute 2 fois le meme compte
//			
//			//Je crée des comptes
//			Compte cpt2 = new Compte(12002, 200.00);
//			Compte cpt3 = new Compte(43003, 300.00);
//			Compte cpt4 = new Compte(52004, 400.00);
//			Compte cpt5 = new Compte(65005, 500.00);
//			//Je les ajoute
//			clientList.ajouterCompte(cpt2);
//			clientList.ajouterCompte(cpt3);
////			clientList.ajouterCompte(cpt4);
////			clientList.ajouterCompte(cpt5);
//		}catch(BanqueException e)	{
//			e.printStackTrace();
//		}
////		System.out.println(clientList);
//		
//		
//		
////		try {
////			//J'ajoute le compte de trop
////			Compte cpt6 = new Compte(12006, 600.00);
////			clientList.ajouterCompte(cpt6);
////		}catch(BanqueException e)	{
////			e.printStackTrace();
////		}
////		System.out.println();
////		System.out.println(clientList);
//		
//		
//		//Je retire deux comptes sur CLient pour les tests suivants
//		//((ArrayList<ICompte>)clientList.getTabComptes()).removeAll(null); // JE NE PEUX PAS RETIRER DE COMPTES
//		
//		//Je crée un compte CompteRemunere pour les tests
//		CompteRemunere cr = new CompteRemunere(12345, 200.00, 2.4);
////		System.out.println("Avec un taux a " + cr.getTaux() + "%, et un solde de " + cr.getSolde() + " les interets sont de :" + cr.calculerInterets());
////		//je change le solde du compte en ajoutant les interets de fin d'année
////		cr.verserInterets();
////		System.out.println("Le solde du compte est passe à " + cr.getSolde());
//		
//		//Je crée un compte à seuil limite
//		CompteASeuil cas = new CompteASeuil(54321, 100.00, 25);
//		try {
//			cas.retirer(50);
//			System.out.println(cas);
//			cas.retirer(26);
//			System.out.println(cas);
//		}catch(BanqueException e) {
//			e.printStackTrace();
//		}
//		
//		//Je rajoute ces comptes à un Client
//		try {
//			clientList.ajouterCompte(cr);
//			clientList.ajouterCompte(cas);
//		}catch(BanqueException e)	{
//			e.printStackTrace();
//		}
//		System.out.println(clientList);
//		//Je verse les intérets sur les comptes qui peuvent être rémunérés
//		System.out.println("Je verse les interets sur les comptes :");
//		clientList.verserLesInteretsSurLesComptes();
//		System.out.println(clientList);
		
		
		
		
		
		
		
		
		
		
		
		
		//REMPLACEMENT PAR UNE MAP
		Client clientList = new Client("Debuisson", "Vincent", 222, 38, new HashMap<>());
		System.out.println(clientList);
		
		//j'ajoute des comptes
		Compte cpt1 = new Compte(12001, 250.00);
		
		try {
			clientList.ajouterCompte(cpt1);
			clientList.ajouterCompte(cpt1);// j'ajoute 2 fois le meme compte
			
			//Je crée des comptes
			Compte cpt2 = new Compte(12002, 200.00);
			Compte cpt3 = new Compte(43003, 300.00);
			Compte cpt4 = new Compte(52004, 400.00);
			Compte cpt5 = new Compte(65005, 500.00);
			//Je les ajoute
			clientList.ajouterCompte(cpt2);
			clientList.ajouterCompte(cpt3);
//			clientList.ajouterCompte(cpt4);
//			clientList.ajouterCompte(cpt5);
		}catch(BanqueException e)	{
			e.printStackTrace();
		}
//		System.out.println(clientList);
		
		
		
//		try {
//			//J'ajoute le compte de trop
//			Compte cpt6 = new Compte(12006, 600.00);
//			clientList.ajouterCompte(cpt6);
//		}catch(BanqueException e)	{
//			e.printStackTrace();
//		}
//		System.out.println();
//		System.out.println(clientList);
		
		
		//Je retire deux comptes sur CLient pour les tests suivants
		//((ArrayList<ICompte>)clientList.getTabComptes()).removeAll(null); // JE NE PEUX PAS RETIRER DE COMPTES
		
		//Je crée un compte CompteRemunere pour les tests
		CompteRemunere cr = new CompteRemunere(12345, 200.00, 2.4);
//		System.out.println("Avec un taux a " + cr.getTaux() + "%, et un solde de " + cr.getSolde() + " les interets sont de :" + cr.calculerInterets());
//		//je change le solde du compte en ajoutant les interets de fin d'année
//		cr.verserInterets();
//		System.out.println("Le solde du compte est passe à " + cr.getSolde());
		
		//Je crée un compte à seuil limite
		CompteASeuil cas = new CompteASeuil(54321, 100.00, 25);
		try {
			cas.retirer(50);
			System.out.println(cas);
			cas.retirer(26);
			System.out.println(cas);
		}catch(BanqueException e) {
			e.printStackTrace();
		}
		
		//Je rajoute ces comptes à un Client
		try {
			clientList.ajouterCompte(cr);
			clientList.ajouterCompte(cas);
		}catch(BanqueException e)	{
			e.printStackTrace();
		}
		System.out.println(clientList);
		//Je verse les intérets sur les comptes qui peuvent être rémunérés
		System.out.println("Je verse les interets sur les comptes :");
		clientList.verserLesInteretsSurLesComptes();
		System.out.println(clientList);
		
	}

}
