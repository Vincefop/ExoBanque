package fr.banque.module;

public class CompteASeuilRemunere extends CompteASeuil implements ICompteRemunere, ICompteASeuil{

	private double taux;
	
	public CompteASeuilRemunere() {
		super();
	}
	public CompteASeuilRemunere(int numero, double solde, double seuil, double taux) {
		super(numero, solde, seuil);
		this.taux=taux;
	}
	
	
	@Override
	public void retirer(double uneValeur) throws BanqueException{
		super.retirer(uneValeur);
	}

	@Override
	public double getSeuil() {
		return super.getSeuil();
	}

	@Override
	public void setSeuil(double seuil) {
		super.setSeuil(seuil);
		
	}

	@Override
	public double calculerInterets() {
		double resultat = taux*super.getSolde()/100;
		return resultat;
	}

	@Override
	public void verserInterets() {
		this.ajouter( this.calculerInterets());
	}

	@Override
	public double getTaux() {
		return this.taux;
	}

	@Override
	public void setTaux(double unTaux) {
		this.taux = unTaux;
	}
	@Override
	public String toString() {
		return "\nCompteASeuilRemunere [Numero=" + super.getNumero() 
			+ ", Solde=" + super.getSolde() 
			+ ", Seuil()=" + this.getSeuil() 
			+ ", taux()=" + this.taux + "]";
	}
	
	
	
	
	
}
