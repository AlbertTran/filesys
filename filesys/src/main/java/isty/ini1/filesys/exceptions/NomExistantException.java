package isty.ini1.filesys.exceptions;

// TODO: Auto-generated Javadoc
/**
 * Classe NomExistantException.
 * 
 * @author (Albert TRAN, Salwan SAIF)
 * @version (21/04/2013)
 * 
 * Herite de la classe RepertoireException qui gère les exceptions
 * d'un repertoire. Ici l'ajout de 2 elements ayant le meme nom est gere.
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