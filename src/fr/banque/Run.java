package fr.banque;

public class Run {

	public static void main(String[] args) {
		
		//Je crée un client
		Client client = new Client("Debuisson", "Vincent", 222, 38, new Compte[5]);
		System.out.println(client);
		
		//j'ajoute des comptes
		Compte cpt1 = new Compte(12001, 250.00);
		
		client.ajouterCompte(cpt1);
		client.ajouterCompte(cpt1);// j'ajoute 2 fois le meme compte
		
		//Je crée des comptes
		Compte cpt2 = new Compte(12002, 200.00);
		Compte cpt3 = new Compte(43003, 300.00);
		Compte cpt4 = new Compte(52004, 400.00);
		Compte cpt5 = new Compte(65005, 500.00);
		Compte cpt6 = new Compte(12006, 600.00);
		//Je les ajoute
		client.ajouterCompte(cpt2);
		client.ajouterCompte(cpt3);
		client.ajouterCompte(cpt4);
		client.ajouterCompte(cpt5);
		client.ajouterCompte(cpt6);
		System.out.println(client);
		
		//Je récupère un compte chez le client
		Compte cptRecup = client.getCompte(12001);
		System.out.println("J'ai recupere le compte : " +cptRecup);
		//Je récupère un compte pas chez le client
		Compte cptRecupPas = client.getCompte(23000);
		System.out.println(cptRecupPas);
		
	}

}
