package isty.ini1.filesys;

import isty.ini1.filesys.exceptions.AjoutLuiMemeException;
import isty.ini1.filesys.exceptions.AjoutNullException;
import isty.ini1.filesys.exceptions.NomExistantException;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * Write a description of class Repertoire here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Repertoire extends Element {

	/** The contenu. */
	private final ArrayList<Element> contenu;

	/**
	 * Constructor for objects of class Repertoire.
	 * 
	 * @param parNom
	 *            the par nom
	 */
	public Repertoire(String parNom) {
		super(parNom);
		contenu = new ArrayList<Element>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ini1.filesys.Element#getTaille()
	 */
	@Override
	public int getTaille() {
		int taille = 0;
		// parcours contenu
		for (Element e : contenu) {
			taille += e.getTaille();
		}
		return taille;
	}

	/**
	 * Ajout.
	 * 
	 * @param parElement
	 *            the par element
	 * @throws AjoutNullException
	 *             the ajout null exception
	 * @throws NomExistantException
	 *             the nom existant exception
	 * @throws AjoutLuiMemeException
	 *             the ajout lui meme exception
	 */
	public void ajout(Element parElement) throws AjoutNullException,
			NomExistantException, AjoutLuiMemeException {
		if (parElement == null) {
			throw new AjoutNullException("Référence nulle lors de l'ajout.");
		}
		if (nomExiste(parElement.getNom())) {
			throw new NomExistantException("Le nom existe déjà.");
		}
		if (contientLuiMeme(parElement)) {
			throw new AjoutLuiMemeException(
					"Le répertoire ne peut pas s'ajouter à lui même.");
		}
		contenu.add(parElement);
	}

	/**
	 * Nom existe.
	 * 
	 * @param parNom
	 *            the par nom
	 * @return true, if successful
	 */
	public boolean nomExiste(String parNom) {
		for (Element e : contenu) {
			if (e.getNom().equals(parNom)) {
				return true;
			}
		}
		// nom non trouvé dans la liste
		return false;
	}

	/**
	 * Contient lui meme.
	 * 
	 * @param parElement
	 *            the par element
	 * @return true, if successful
	 */
	public boolean contientLuiMeme(Element parElement) {
		boolean test = false;
		if (parElement.estRepertoire()) {
			Repertoire rep = (Repertoire) parElement;
			if (rep == this) {
				// les répertoires sont identiques
				test = true;
			} else {
				// parcours du contenu du répertoire
				for (Element e : rep.getContenu()) {
					test = test || contientLuiMeme(e);
				}
			}
		}
		// répertoires non identiques ou est un fichier
		return test;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ini1.filesys.Element#estRepertoire()
	 */
	@Override
	public boolean estRepertoire() {
		return true;
	}

	/**
	 * Gets the contenu.
	 * 
	 * @return the contenu
	 */
	public ArrayList<Element> getContenu() {
		return contenu;
	}

}
