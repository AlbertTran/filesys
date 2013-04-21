package isty.ini1.filesys;

import isty.ini1.filesys.exceptions.FichierTailleIncorrecteException;

// TODO: Auto-generated Javadoc
/**
 * Classe Fichier.
 * 
 * @author (Albert TRAN, Salwan SAIF)
 * @version (21/04/2013)
 *
 * Un fichier herite de la classe element.
 * Il possede une taille et peut etre contenu dans un repertoire.
 */
public class Fichier extends Element {

	// instance variables - replace the example below with your own
	/** Taille du fichier */
	private int taille;

	/**
	 * Constructeur
	 * 
	 * @param parNom
	 *            Chaine de caractere du nom de l'element
	 * @param parTaille
	 *            Taille du fichier
	 * @throws FichierTailleIncorrecteException
	 *             Exception FichierTailleIncorrecteException
	 */
	public Fichier(String parNom, int parTaille)
			throws FichierTailleIncorrecteException {
		super(parNom);
		if (parTaille < 0) {
			throw new FichierTailleIncorrecteException(
					"La taille du fichier est négative");
		}
		taille = parTaille;
	}

	/**
	 * Retourne la taille du fichier.
	 */
	@Override
	public int getTaille() {
		return taille;
	}

}