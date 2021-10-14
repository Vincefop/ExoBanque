package fr.banque;

import java.util.Arrays;

public class Client {
	
	private String nom;
	private String prenom;
	private int numero;
	private int age;
	private Compte[] tabComptes;
	private static int nbreComptes = 0;
	
	public Client() {}

	public Client(String nom, String prenom, int numero, int age, Compte[] tabComptes) {
		this.nom = nom;
		this.prenom = prenom;
		this.numero = numero;
		this.age = age;
		this.tabComptes = tabComptes;
	}
	
	/**
	 * Cette m�thode ajoute unCompte � l'index 0 de tabCompte dans un maximum de 5 comptes par individu
	 * on pourrait ajouter qu'il ne peut pas y avoir 2 comptes avec le m�me numero dans le tableau
	 * @param unCompte
	 */
	public void ajouterCompte(Compte unCompte) {
		//Je v�rifie que le compte ne se trouve pas d�j� dans le tableau
		for (Compte compte : tabComptes) {
			if(compte.getNumero()==unCompte.getNumero()) {
				System.out.println("Impossible d'ajouter deux fois le m�me compte");
				return;
			}
		}
		
		//Je v�rifie que le tableau n'est pas plein.
		if(nbreComptes>4) {
			System.out.println("La limite de comptes/pers est de 5. Vous ne pouvez pas ajouter ce compte");
		}else {
			//j'ajoute le compte dans le tableau � la premi�re case vide
			tabComptes[nbreComptes] = unCompte;	
			//J'incr�mente l'index du tableau
			nbreComptes++;
		}
	}
	
	/**
	 * R�cup�ration d'un compte du tableau des comptes. Si le numero de compte ne correspond � aucun compte je lance un message
	 * @param numeroCompte
	 * @return un Compte dont le numero correspond au numero en param�tre
	 */
	public Compte getCompte(int numeroCompte) {
		//Je parcours le tableau de comptes
		for (Compte compte : tabComptes) {
			//SI les numeros matchent je renvoie le compte
			if(compte.getNumero()==numeroCompte) {
				return compte;
			}
		}
		//Si je n'ai rien trouv�
		System.out.println("Ce compte n'est pas chez ce clients");
		return null;
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
		return "Client [nom=" + nom + ", prenom=" + prenom + ", numero=" + numero + ", age=" + age + ", tabComptes="
				+ Arrays.toString(tabComptes) + "]";
	}

	
	
}
