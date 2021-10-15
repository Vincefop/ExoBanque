package fr.banque;

public interface ICompteASeuil extends ICompte {

	public void retirer(double uneValeur);
	public double getSeuil();
	public void setSeuil(double seuil);
}
