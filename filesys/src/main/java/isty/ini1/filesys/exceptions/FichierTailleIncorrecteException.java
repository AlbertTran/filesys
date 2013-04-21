package isty.ini1.filesys.exceptions;

// TODO: Auto-generated Javadoc
/**
 * Classe FichierTailleIncorrecteException.
 * 
 * @author (Albert TRAN, Salwan SAIF)
 * @version (21/04/2013)
 * 
 * Hérite de la classe Exception qui gère les exceptions.
 * Ici l'ajout d'un fichier de taille incorrecte est géré.
 */
public class FichierTailleIncorrecteException extends Exception {

	/**
	 * Instantie une nouvelle exception FichierTailleIncorrecteException.
	 * 
	 * @param parMessage
	 *            Chaine de caractere du message d'erreur envoye
	 */
	public FichierTailleIncorrecteException(String parMessage) {
		super(parMessage);
	}
}