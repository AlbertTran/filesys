package isty.ini1.filesys;

import isty.ini1.filesys.exceptions.FichierTailleIncorrecteException;

// TODO: Auto-generated Javadoc
/**
 * Write a description of class Fichier here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fichier extends Element {

	// instance variables - replace the example below with your own
	/** The taille. */
	private final int taille;

	/**
	 * Constructor for objects of class Fichier.
	 * 
	 * @param parNom
	 *            the par nom
	 * @param parTaille
	 *            the par taille
	 * @throws FichierTailleIncorrecteException
	 *             the fichier taille incorrecte exception
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see ini1.filesys.Element#getTaille()
	 */
	@Override
	public int getTaille() {
		return taille;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ini1.filesys.Element#estRepertoire()
	 */
	@Override
	public boolean estRepertoire() {
		return false;
	}

}
