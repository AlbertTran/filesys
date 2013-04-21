package isty.ini1.filesys;

import isty.ini1.filesys.exceptions.AjoutLuiMemeException;
import isty.ini1.filesys.exceptions.AjoutNullException;
import isty.ini1.filesys.exceptions.NomExistantException;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * Classe repertoire.
 * 
 * @author (Albert TRAN, Salwan SAIF)
 * @version (21/04/2013)
 * 
 * Un repertoire herite de la classe element.
 * Il possede une liste d'elements (repertoire ou fichier).
 * 
 */
public class Repertoire extends Element {

	/** Liste des elements contenus dans le repertoire */
	private ArrayList<Element> contenu;

	/**
	 * Constructeur
	 * 
	 * @param parNom
	 *            Chaine de caractere du nom de l'element
	 */
	public Repertoire(String parNom) {
		super(parNom);
		contenu = new ArrayList<Element>(); 
	}

	/**
	 *  
	 * Calcul de la taille d'un repertoire, recursivite.
	 * Taille = Taille de tous les fichiers et repertoires contenus.
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
	 * Ajout d'un element dans le repertoire.
	 * 
	 * @param parElement
	 *            Element ajout�
	 * @throws AjoutNullException
	 *             Exception AjoutNullException
	 * @throws NomExistantException
	 *             Exception AjoutLuiMemeException
	 * @throws AjoutLuiMemeException
	 *             Exception AjoutLuiMemeException
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
	 * Teste si l'element existe.
	 * 
	 * @param parNom
	 *            Le nom de l'element
	 * @return vrai, si il existe
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
	 * Teste si le repertoire se contient lui meme.
	 * 
	 * @param parElement
	 *            Le nom de l'element
	 * @return vrai, s'il se contient
	 */
	public boolean contientLuiMeme(Element parElement) {
		boolean test = false;
		if (parElement instanceof Repertoire) {
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

	/**
	 * Retourne le contenu du repertoire.
	 * 
	 * @return la liste d'elements contenus
	 */
	public ArrayList<Element> getContenu() {
		return contenu;
	}

}