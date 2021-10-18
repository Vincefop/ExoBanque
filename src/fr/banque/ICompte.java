package fr.banque;

public interface ICompte {

	public void ajouter(double montant);
	public void enlever(double montant) throws BanqueException;
	public int getNumero();
	public void setNumero(int numero); //CETTE METHODE EST PRIVEE DANS COMPTE ??
	public double getSolde();
	public void setSolde(double solde);
	
}
