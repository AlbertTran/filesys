package isty.ini1.filesys.exceptions;

// TODO: Auto-generated Javadoc
/**
 * Classe RepertoireException.
 * 
 * @author (Albert TRAN, Salwan SAIF)
 * @version (21/04/2013)
 * 
 * Hérite de la classe Exception qui gère les exceptions.
 * Classe mère gérant les exceptions liees a un repertoire de AjoutLuiMemeException, AjoutNullException et NomExistantException.
 */
public class RepertoireException extends Exception {

	/**
	 * Instantie une nouvelle exception RepertoireException.
	 * 
	 * @param parMessage
	 *            Chaine de caractere du message d'erreur envoye
	 */
	public RepertoireException(String parMessage) {
		super(parMessage);
		
	}
}