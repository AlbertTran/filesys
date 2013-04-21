package isty.ini1.filesys.exceptions;

// TODO: Auto-generated Javadoc
/**
 * Classe AjoutNullException.
 * 
 * @author (Albert TRAN, Salwan SAIF)
 * @version (21/04/2013)
 * 
 * Herite de la classe RepertoireException qui gère les exceptions
 * d'un repertoire. Ici l'ajout d'un element avec une reference null est gere.
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