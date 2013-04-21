package isty.ini1.filesys.exceptions;

// TODO: Auto-generated Javadoc
/**
 * Classe AjoutNullException.
 * 
 * @author (Albert TRAN, Salwan SAIF)
 * @version (21/04/2013)
 * 
 * H�rite de la classe RepertoireException qui g�re les exceptions
 * d'un repertoire. Ici l'ajout d'un element avec une reference null est g�r�.
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