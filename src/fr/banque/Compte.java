package fr.banque;

public class Compte {
	private int numero;
	private double solde;
	
	public Compte() {
		
	}
	public Compte(int numero, double solde) {
		this.numero=numero;
		this.solde=solde;
	}
	
	/**
	 * Methode qui ajoute de l'argent au solde
	 * @param montant le montant ajouté
	 */
	public void ajouter(double montant) {
		this.solde += montant;
	}
	
	/**
	 * Mthode qui enlève un montant au solde
	 * @param montant le montant à enlever
	 */
	public void enlever(double montant) {
		this.solde -= montant;
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
	private void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	/**
	 * @param solde the solde to set
	 */
	private void setSolde(double solde) {
		this.solde = solde;
	}
	@Override
	public String toString() {
		return "Compte [numero=" + numero + ", solde=" + solde + "]";
	}
	
	
	
	
}
