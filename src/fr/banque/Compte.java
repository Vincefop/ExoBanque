package fr.banque;

public class Compte implements ICompte {
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
	public void enlever(double montant) throws BanqueException	{
		this.solde -= montant; 
		//if(this.solde < ) throw new BanqueException();
	}
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return this.numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) { 		// ON A DU PASSER CETTE METHODE EN PUBLIC
		this.numero = numero;
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
	public void setSolde(double solde) {		// ON A DU PASSER CETTE METHODE EN PUBLIC
		this.solde = solde;
	}
	@Override
	public String toString() {
		return "\nCompte [numero=" + numero + ", solde=" + solde + "]";
	}
	
	
	
	
}
