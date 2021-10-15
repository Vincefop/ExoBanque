package fr.banque;

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
	public void retirer(double uneValeur) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getSeuil() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSeuil(double seuil) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calculerInterets() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void verserInterets() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getTaux() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTaux(double unTaux) {
		// TODO Auto-generated method stub
	}
	
	
	
}
