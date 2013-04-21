package isty.ini1.filesys.exceptions;

// TODO: Auto-generated Javadoc
/**
 * Classe AjoutLuiMemeException.
 * 
 * @author (Albert TRAN, Salwan SAIF)
 * @version (21/04/2013)
 * 
 * Hérite de la classe RepertoireException qui gère les exceptions
 * d'un repertoire. Ici l'ajout d'un (sous-)repertoire dans lui meme est géré.
 */
public class AjoutLuiMemeException extends RepertoireException {

	/**
	 * Instantie une nouvelle exception AjoutLuiMeme.
	 * 
	 * @param parMessage
	 *            Chaine de caractere du message d'erreur envoye
	 */
	public AjoutLuiMemeException(String parMessage) {
		super(parMessage);
	}
}