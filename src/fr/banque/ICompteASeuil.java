package fr.banque;

public interface ICompteASeuil extends ICompte {

	public void retirer(double uneValeur) throws BanqueException;
	public double getSeuil();
	public void setSeuil(double seuil);
}
