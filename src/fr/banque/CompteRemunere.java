package fr.banque;

public class CompteRemunere extends Compte implements ICompteRemunere{
	
	private double taux;
	
	
	public CompteRemunere() {
		super();
		
	}
	public CompteRemunere(int numero, double solde, double taux) {
		super(numero, solde);
		this.taux=taux;
		
	}
	
	/**
	 * Calcul les intérets du compte en fonction du solde
	 * @return taux * leSolde du compte
	 */
	public double calculerInterets() {
		double resultat = taux*super.getSolde()/100;
		return resultat;
	}
	
	/**
	 * Permet de mettre à jour le compte en lui versant les intérêts 
	 */
	public void verserInterets() {
		this.ajouter( this.calculerInterets());
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
		return "\nCompteRemunere [" + "numero = " + super.getNumero() + ", solde = " + super.getSolde() + "taux=" + this.taux + "]";
	}
	
	

}
