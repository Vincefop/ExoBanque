package fr.banque;

import java.util.Arrays;

public class Client {
	
	private String nom;
	private String prenom;
	private int numero;
	private int age;
	private Compte[] tabComptes;
	private static int nbreComptes;
	
	public Client() {}

	public Client(String nom, String prenom, int numero, int age, Compte[] tabComptes) {
		this.nom = nom;
		this.prenom = prenom;
		this.numero = numero;
		this.age = age;
		this.tabComptes = tabComptes;
	}
	
	/**
	 * Cette méthode ajoute unCompte à l'index 0 de tabCompte dans un maximum de 5 comptes par individu
	 * on pourrait ajouter qu'il ne peut pas y avoir 2 comptes avec le même numero dans le tableau
	 * @param unCompte
	 */
	public void ajouterCompte(Compte unCompte) {
		
		//Je vérifie que le tableau n'est pas plein.
		if(nbreComptes>4) {
			System.out.println("La limite de comptes/pers est de 5. Vous ne pouvez plus ajouter le compte " + unCompte.getNumero());
		}else {
			//Je vérifie que le compte ne se trouve pas déjà dans le tableau
			for(int i = 0; i<nbreComptes; i++) {
				if(tabComptes[i].getNumero()==unCompte.getNumero()) {
					System.out.println("Impossible d'ajouter deux fois le même compte :" + unCompte.getNumero());
					return;
				}
			}
			//Sinon j'ajoute le compte dans le tableau à la première case vide
			tabComptes[nbreComptes] = unCompte;	
			System.out.println("Compte " + unCompte.getNumero() + " ajoute");
			//J'incrémente l'index du tableau
			nbreComptes++;
			//System.out.println("l'index du tableau est egal a " + nbreComptes);
		}
	}
	
	/**
	 * Récupération d'un compte du tableau des comptes. Si le numero de compte ne correspond à aucun compte je lance un message
	 * @param numeroCompte
	 * @return un Compte dont le numero correspond au numero en paramètre
	 */
	public Compte getCompte(int numeroCompte) {
		//Je parcours le tableau de comptes
		for (Compte compte : this.tabComptes) {
			
			//SI les numeros matchent je renvoie le compte
			if(compte.getNumero()== numeroCompte) {
				return compte;
			}
		}
		//Si je n'ai rien trouvé
		System.out.println("Ce compte " + numeroCompte + " n'est pas chez ce client");
		return null;
	}
	
	/**
	 * Je vérifie dans le tableau de comptes, les Comptes instanciés CompteRemunere et je modifie leur solde
	 */
	public void verserLesInteretsSurLesComptes() {
		CompteRemunere cr;
		for (Compte compte : tabComptes) {
			if(compte!=null && compte.getClass().equals(CompteRemunere.class)) {
				cr = (CompteRemunere)compte;
				cr.verserInterets();
			}
		}
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the tabComptes
	 */
	public Compte[] getTabComptes() {
		return tabComptes;
	}

	/**
	 * @param tabComptes the tabComptes to set
	 */
	public void setTabComptes(Compte[] tabComptes) {
		this.tabComptes = tabComptes;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", numero=" + numero + ", age=" + age + ", \ntabComptes="
				+ Arrays.toString(tabComptes) + "]";
	}

	
	
}
