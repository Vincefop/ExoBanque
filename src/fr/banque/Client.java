package fr.banque;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Client {
	
	//ATTRIBUTS
	private String nom;
	private String prenom;
	private int numero;
	private int age;
	private Map<Integer, ICompte> tabComptes;
	private static int nbreComptes;
	
	//CONSTRUCTEURS	
	public Client() {
		super();
	}
	public Client(String nom, String prenom, int numero, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numero = numero;
		this.age = age;
	}
	public Client(String nom, String prenom, int numero, int age, Map<Integer, ICompte> tabComptes) {
		super();
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
	public void ajouterCompte(ICompte unCompte) throws BanqueException{
		
		//Je vérifie que le tableau n'est pas plein.
		if(nbreComptes>4) {
			throw new BanqueException("La limite de comptes/pers est de 5. Vous ne pouvez plus ajouter le compte " + unCompte.getNumero());
		}else {
			//Je vérifie que le compte ne se trouve pas déjà dans le tableau/ DANS LA LISTE / DANS LA HASHMAP
			//TABLEAU
//			for(int i = 0; i<nbreComptes; i++) {
//				if(tabComptes[i].getNumero()==unCompte.getNumero()) {
//					System.out.println("Impossible d'ajouter deux fois le même compte :" + unCompte.getNumero());
//					return;
//				}
//			}
			//LIST
//			if(tabComptes.contains(unCompte)) {
//				System.out.println("Impossible d'ajouter deux fois le même compte :" + unCompte.getNumero());
//				return;
//			}
			//HASHMAP
			if(this.tabComptes.containsKey(unCompte.getNumero())) {
				System.out.println("Impossible d'ajouter deux fois le même compte :" + unCompte.getNumero());
				return;
			}
			
			
			
//			//TABLEAU : Sinon j'ajoute le compte dans le tableau à la première case vide 
//			tabComptes[nbreComptes] = unCompte;	
			
			
			//LIST Je modifie en Liste 
//			tabComptes.add(unCompte);
			
			
			//HASHMAP
			tabComptes.put(unCompte.getNumero(), unCompte);
			
			
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
	public ICompte getCompte(int numeroCompte) {
		//Je parcours le tableau de comptes
		//TABLEAU OU LISTE
//		for (ICompte compte : this.tabComptes) {
//			
//			//SI les numeros matchent je renvoie le compte
//			if(compte.getNumero()== numeroCompte) {
//				return compte;
//			}
//		}
		
		//HASHMAP
		ICompte res = null;
		if(tabComptes.containsKey(numeroCompte)) {
			res = tabComptes.get(numeroCompte);
		}
		
		
		
//		//Si je n'ai rien trouvé
		if(res==null)
			System.out.println("Ce compte " + numeroCompte + " n'est pas chez ce client");
//		return null;
		
		return res;
	}
	
	/**
	 * Je vérifie dans le tableau de comptes, les Comptes instanciés CompteRemunere et je modifie leur solde
	 */
	public void verserLesInteretsSurLesComptes() {
		//POUR LES LIST / TABLEAUX
//		ICompteRemunere cr;
//		for (ICompte compte : tabComptes) {
//			if(compte!=null && compte instanceof ICompteRemunere) {
//			//if(compte!=null && compte.getClass().equals(ICompteRemunere.class)) {
//				cr = (ICompteRemunere)compte;
//				//System.out.println("J'affiche le compte dont on verse les intereets ici" + cr);
//				cr.verserInterets();
//			}
//		}
		
		//POUR LES HASHMAP
		for(Map.Entry<Integer, ICompte> mapEntry : tabComptes.entrySet()) {
			if(mapEntry.getValue() instanceof ICompteRemunere) {
				((ICompteRemunere)mapEntry.getValue()).verserInterets();
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
	public ICompte[] getTabComptes() {
		
		//POUR LES TABLEAUX 
//		return tabComptes;
		
		
		//POUR LES LISTES
		//return (ICompte[]) tabComptes.toArray();
		
		//POUR LES HASHMAPS
		//Je crée un nouveau tableau vide
		ICompte[] res = new ICompte[5];
		int i=0;
		//je vais remplir ce tableau avec chaque ICOmpte de la map
		for(Map.Entry<Integer, ICompte> mapEntry : tabComptes.entrySet()) {
			res[i] = mapEntry.getValue();
			i++;
		}
		return res;
	}

	/**
	 * @param tabComptes the tabComptes to set
	 */
	public void setTabComptes(ICompte[] tabComptes) {
		//POUR LES TABLEAUX 
//		if(tabComptes.length!=5) {
//			System.out.println("Le tableau de comptes doit contenur 5 comptes");
//		}else {
//			this.tabComptes = tabComptes;
//		}
		
		//POUR LES MAPS
		//Je vide la map au cas ou
		this.tabComptes.clear();
		//je vais ajouter chaque compte sur la map
		for(int i=0; i<tabComptes.length; i++) {
			this.tabComptes.put(tabComptes[i].getNumero(), tabComptes[i]);
			
		}
	}

	//TO STRING POUR LA LISTE
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", numero=" + numero + ", age=" + age + ", tabComptes="
				+ tabComptes + "]";
	}

	//TO STRING POUR LE TABLEAU
//	@Override
//	public String toString() {
//		return "Client [nom=" + nom + ", prenom=" + prenom + ", numero=" + numero + ", age=" + age + ", \ntabComptes="
//				+ Arrays.toString(tabComptes) + "]\n";
//	}

	
	
	
}
