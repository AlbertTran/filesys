/**
 * 
 */
package isty.ini1.filesys;

import static org.junit.Assert.assertTrue;
import isty.ini1.filesys.exceptions.FichierTailleIncorrecteException;

import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * Classe FichierTest.
 * 
 * @author (Albert TRAN, Salwan SAIF)
 * @version (21/04/2013)
 * 
 * Classe implementant les tests JUNIT 4 d'un fichier.
 * Exception geree : FichierTailleIncorrecteException.
 */

public class FichierTest {

	/**
	 * Test d'instanciation d'un fichier de taille negative.
	 * Exception attendue : FichierTailleIncorrecteException
	 * 
	 * @throws FichierTailleIncorrecteException
	 *             the fichier taille incorrecte exception
	 */
	@Test(expected = FichierTailleIncorrecteException.class)
	public void testFichier() throws FichierTailleIncorrecteException {
		Fichier fic = new Fichier("Un Fichier", -10);
	}

	/**
	 * Test d'instanciation d'un fichier de taille positive.
	 * 
	 * @throws FichierTailleIncorrecteException
	 *             the fichier taille incorrecte exception
	 */
	@Test
	public void testGetTaillePos() throws FichierTailleIncorrecteException {
		Fichier fic = new Fichier("Un Fichier", 17);
		assertTrue(fic.getTaille() == 17);
	}

}