package fr.banque;

public class Run {

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
		//Je crée un compte CompteRemunere pour les tests
		CompteRemunere cr = new CompteRemunere(12345, 200.00, 2.4);
		System.out.println("Avec un taux a " + cr.getTaux() + "%, et un solde de " + cr.getSolde() + " les interets sont de :" + cr.calculerInterets());
		//je change le solde du compte en ajoutant les interets de fin d'année
		cr.verserInterets();
		System.out.println("Le solde du compte est passe à " + cr.getSolde());
		
		//Je crée un compte à seuil limite
		CompteASeuil cas = new CompteASeuil(54321, 100.00, 25);
		cas.retirer(50);
		System.out.println(cas);
		cas.retirer(26);
		System.out.println(cas);
		
		//Je rajoute ces comptes à un Client
		Client cli = new Client("Debuisson", "Vincent", 22022, 38, new Compte[5]);
		cli.ajouterCompte(cr);
		cli.ajouterCompte(cas);
		cli.ajouterCompte(new Compte(999, 120.00));
		System.out.println(cli);
		
		cli.verserLesInteretsSurLesComptes();
		System.out.println(cli);
		
	}

}
