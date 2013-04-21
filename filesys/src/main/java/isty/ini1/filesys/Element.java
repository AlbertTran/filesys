/**
 *.
 */
package isty.ini1.filesys;

// TODO: Auto-generated Javadoc
/**
 * The Class Element.
 * 
 * @author (Albert TRAN, Salwan SAIF)
 * @version (24/04/2013)
 */
public abstract class Element {

	// instance variables - replace the example below with your own
	/** The nom. */
	private final String nom;

	/**
	 * Constructor for objects of class Entite.
	 * 
	 * @param parNom
	 *            the par nom
	 */
	public Element(String parNom) {
		// initialise instance variables
		nom = parNom;
	}

	/**
	 * Gets the nom.
	 * 
	 * @return the nom
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

	/**
	 * Est repertoire.
	 * 
	 * @return true, si l'élément est un répertoire (utilisé d
	 */
	public abstract boolean estRepertoire();

}
