/**
 * 
 */
package isty.ini1.filesys;

import static org.junit.Assert.assertTrue;
import isty.ini1.filesys.exceptions.FichierTailleIncorrecteException;

import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class FichierTest.
 */
public class FichierTest {

	/**
	 * Test fichier.
	 * 
	 * @throws FichierTailleIncorrecteException
	 *             the fichier taille incorrecte exception
	 */
	@Test(expected = FichierTailleIncorrecteException.class)
	public void testFichier() throws FichierTailleIncorrecteException {
		Fichier fic = new Fichier("Un Fichier", -10);
	}

	/**
	 * Test get taille pos.
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
