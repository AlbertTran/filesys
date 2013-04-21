package isty.ini1.filesys.exceptions;

// TODO: Auto-generated Javadoc
/**
 * Classe NomExistantException.
 * 
 * @author (Albert TRAN, Salwan SAIF)
 * @version (21/04/2013)
 * 
 * H�rite de la classe RepertoireException qui g�re les exceptions
 * d'un repertoire. Ici l'ajout de 2 elements ayant le meme nom est g�r�.
 */
public class NomExistantException extends RepertoireException {

	/**
	 * Instantie une nouvelle exception NomExistantException.
	 * 
	 * @param parMessage
	 *            Chaine de caractere du message d'erreur envoye
	 */
	public NomExistantException(String parMessage) {
		super(parMessage);
	}

}