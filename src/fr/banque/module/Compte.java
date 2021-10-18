package fr.banque.module;

import java.util.Objects;

public class Compte implements ICompte {
	
	//ATTRIBUTS
	private int numero;
	private double solde;
	
	//CONSTRUCTEURS
	public Compte() {
		super();
	}
	public Compte(int numero, double solde) {
		super();	
		this.numero=numero;
		this.solde=solde;
	}
	
	
	//METHODES
	/**
	 * Methode qui ajoute de l'argent au solde
	 * @param montant le montant ajouté
	 */
	public void ajouter(double montant) {
		this.setSolde(this.getSolde() + montant); //utiliser les getters et les setters un maximum
	}
	
	/**
	 * Mthode qui enlève un montant au solde
	 * @param montant le montant à enlever
	 */
	public void enlever(double montant) throws BanqueException	{
		
		this.setSolde(this.getSolde() - montant);   
	}
	
	
	//GETTERS SETTERS OU ACCESSEURS
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return this.numero;
	}
	/**
	 * @return the solde
	 */
	public double getSolde() {
		return this.solde;
	}
	/**
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	//TOSTRING
	@Override
	public String toString() {
		return "\nCompte [numero=" + this.getNumero() + ", solde=" + this.getSolde() + "]";
	}
	
	//Fonction de hashage qui permet de coder la classe de manière aléatoire. 
	//Si la meême classe est hachées 2 fois on aura le meme résultat
	@Override
	public int hashCode() {
		return Objects.hash(numero, solde);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compte other = (Compte) obj;
		return numero == other.numero && Double.doubleToLongBits(solde) == Double.doubleToLongBits(other.solde);
	}
	
	
	
	
}
