package fr.banque;

public class CompteRemunere extends Compte {
	
	private double taux;
	
	
	public CompteRemunere() {
		super();
		
	}
	public CompteRemunere(int numero, double solde, double taux) {
		super(numero, solde);
		this.taux=taux;
		
	}
	
	/**
	 * Calcul les int�rets du compte en fonction du solde
	 * @return taux * leSolde du compte
	 */
	public double calculerInterets() {
		double resultat = taux*super.getSolde();
		return resultat;
	}
	
	/**
	 * Permet de mettre � jour le compte en lui versant les int�r�ts 
	 */
	public void verserInter�t() {
		this.ajouter( this.calculerInterets() + super.getSolde() );
	}
	/**
	 * @return the taux
	 */
	public double getTaux() {
		return this.taux;
	}
	/**
	 * @param taux the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}
	@Override
	public String toString() {
		return "CompteRemunere [" + "numero = " + super.getNumero() + ", solde = " + super.getSolde() + "taux=" + this.taux + "]";
	}
	
	

}
