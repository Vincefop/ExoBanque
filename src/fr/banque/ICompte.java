package fr.banque;

public interface ICompte {

	public void ajouter(double montant);
	public void enlever(double montant) throws BanqueException;
	public int getNumero();
	public double getSolde();
	public void setSolde(double solde);
	
}
