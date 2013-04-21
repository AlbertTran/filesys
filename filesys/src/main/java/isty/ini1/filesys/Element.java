/**
 *.
 */
package isty.ini1.filesys;

// TODO: Auto-generated Javadoc
/**
 * Classe Element.
 * 
 * @author (Albert TRAN, Salwan SAIF)
 * @version (21/04/2013)
 * 
 * Classe abstraite représentant une element : fichier ou repertoire.
 * Un element est caractérisé par son nom et sa taille.
 * Les elements composent le systeme de fichier.
 */
public abstract class Element {

	// instance variables - replace the example below with your own
	/** The nom. */
	private String nom;

	/**
	 * Constructeur
	 * 
	 * @param parNom
	 *            Chaine de caractere du nom de l'element
	 */
	public Element(String parNom) {
		// initialise instance variables
		nom = parNom;
	}

	/**
	 * Gets the nom.
	 * 
	 * @return the nom
	 * 
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Gets the taille.
	 * 
	 * @return the taille
	 */
	public abstract int getTaille();

}