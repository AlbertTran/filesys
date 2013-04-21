package isty.ini1.filesys.exceptions;

// TODO: Auto-generated Javadoc
/**
 * Classe AjoutNullException.
 * 
 * @author (Albert TRAN, Salwan SAIF)
 * @version (21/04/2013)
 * 
 * Hérite de la classe RepertoireException qui gère les exceptions
 * d'un repertoire. Ici l'ajout d'un element avec une reference null est géré.
 */
public class AjoutNullException extends RepertoireException {

	/**
	 * Instantie une nouvelle exception AjoutNullException.
	 * 
	 * @param parMessage
	 *            Chaine de caractere du message d'erreur envoye
	 */
	public AjoutNullException(String parMessage) {
		super(parMessage);
	}

}