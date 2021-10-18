package fr.banque;

public class CompteASeuil extends Compte implements ICompteASeuil {
	private double seuil;
	
	public CompteASeuil() {
		super();
	}
	
	public CompteASeuil(int numero, double solde, double seuil) {
		super(numero, solde);
		this.seuil = seuil;
	}
	
	/**
	 * retire un montant uneValeur du solde si et seulement si le solde du compte ne passe pas en dessous du seuilS
	 * @param uneValeur
	 */
	public void retirer(double uneValeur) throws BanqueException {
		//Je calcul le nouveau solde si la transaction a lieu
		double newSolde = super.getSolde() - uneValeur;
		//je vérifie si le solde moins la valeur sont plus petits que le seuil
		if( newSolde < this.seuil) {
			System.out.println("Votre seuil " + seuil + " ne vous permet pas de faire ce retrait. "
					+ "\nVous n'auriez plus que " + newSolde);
		}else {
			//sinon je fais la transaction
			super.enlever(uneValeur); 
			if(this.getSolde()<this.seuil) throw new BanqueException();
		}
	}

	/**
	 * @return the seuil
	 */
	public double getSeuil() {
		return seuil;
	}

	/**
	 * @param seuil the seuil to set
	 */
	public void setSeuil(double seuil) {
		this.seuil = seuil;
	}

	@Override
	public String toString() {
		return "\nCompteASeuil [ numero = " + getNumero() + ", solde = " + getSolde() + ", seuil= " + this.seuil + " ]";
	}
	
	
}
