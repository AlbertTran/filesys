package isty.ini1.filesys;

import static org.junit.Assert.assertTrue;
import isty.ini1.filesys.exceptions.AjoutLuiMemeException;
import isty.ini1.filesys.exceptions.AjoutNullException;
import isty.ini1.filesys.exceptions.FichierTailleIncorrecteException;
import isty.ini1.filesys.exceptions.NomExistantException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class RepertoireTest.
 */
public class RepertoireTest {

	/** The f3. */
	private Fichier f1, f2, f3;

	/** The r3. */
	private Repertoire r1, r2, r3;

	/**
	 * Sets the up.
	 */

	@Before
	public void setUp() {
		try {
			f1 = new Fichier("toto", 20);
			f2 = new Fichier("un fichier", 15);
			f3 = new Fichier("tata", 107);
			r1 = new Repertoire("Dossier");
			r2 = new Repertoire("toto");
			r3 = new Repertoire("un autre dossier");
		} catch (FichierTailleIncorrecteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Tear down.
	 */
	@After
	public void tearDown() {
		r1 = null;
		r2 = null;
		r3 = null;
		f1 = null;
		f2 = null;
		f3 = null;
	}

	/**
	 * Test get taille.
	 * 
	 * @throws AjoutNullException
	 *             the ajout null exception
	 * @throws NomExistantException
	 *             the nom existant exception
	 * @throws AjoutLuiMemeException
	 *             the ajout lui meme exception
	 */
	@Test
	public void testGetTaille() throws AjoutNullException,
			NomExistantException, AjoutLuiMemeException {
		assertTrue(r1.getTaille() == 0);
		r1.ajout(f1);
		r1.ajout(f2);
		assertTrue(r1.getTaille() == 35);

		r3.ajout(f3);
		assertTrue(r3.getTaille() == 107);

		r1.ajout(r3);
		assertTrue(r1.getTaille() == 142);
	}

	/**
	 * Test ajout reference nulle.
	 * 
	 * @throws AjoutNullException
	 *             the ajout null exception
	 * @throws NomExistantException
	 *             the nom existant exception
	 * @throws AjoutLuiMemeException
	 *             the ajout lui meme exception
	 */
	@Test(expected = AjoutNullException.class)
	public void testAjoutReferenceNulle() throws AjoutNullException,
			NomExistantException, AjoutLuiMemeException {
		r1.ajout(null);
	}

	/**
	 * Test ajout meme nom d'element.
	 * 
	 * @throws AjoutNullException
	 *             the ajout null exception
	 * @throws NomExistantException
	 *             the nom existant exception
	 * @throws AjoutLuiMemeException
	 *             the ajout lui meme exception
	 */
	@Test(expected = NomExistantException.class)
	public void testAjoutMemeNomElt() throws AjoutNullException,
			NomExistantException, AjoutLuiMemeException {
		assertTrue(f1.getNom().equals(r2.getNom()));
		r1.ajout(f1);
		r1.ajout(r2);
	}

	/**
	 * Test ajout meme nom de repertoire.
	 * 
	 * @throws AjoutNullException
	 *             the ajout null exception
	 * @throws NomExistantException
	 *             the nom existant exception
	 * @throws AjoutLuiMemeException
	 *             the ajout lui meme exception
	 */
	@Test(expected = NomExistantException.class)
	public void testAjoutMemeNomFic() throws AjoutNullException,
			NomExistantException, AjoutLuiMemeException {
		r1.ajout(f1);
		r1.ajout(f1);
	}

	/**
	 * Test ajout meme nom fichier.
	 * 
	 * @throws AjoutNullException
	 *             the ajout null exception
	 * @throws NomExistantException
	 *             the nom existant exception
	 * @throws AjoutLuiMemeException
	 *             the ajout lui meme exception
	 */
	@Test(expected = NomExistantException.class)
	public void testAjoutMemeNomRep() throws AjoutNullException,
			NomExistantException, AjoutLuiMemeException {
		r1.ajout(r2);
		r1.ajout(r2);
	}

	/**
	 * Test ajout lui meme.
	 * 
	 * @throws AjoutNullException
	 *             the ajout null exception
	 * @throws NomExistantException
	 *             the nom existant exception
	 * @throws AjoutLuiMemeException
	 *             the ajout lui meme exception
	 */
	@Test(expected = AjoutLuiMemeException.class)
	public void testAjoutLuiMeme() throws AjoutNullException,
			NomExistantException, AjoutLuiMemeException {
		r1.ajout(r1);
	}

	/**
	 * Test ajout sous rep lui meme.
	 * 
	 * @throws AjoutNullException
	 *             the ajout null exception
	 * @throws NomExistantException
	 *             the nom existant exception
	 * @throws AjoutLuiMemeException
	 *             the ajout lui meme exception
	 */
	@Test(expected = AjoutLuiMemeException.class)
	public void testAjoutSousRepLuiMeme() throws AjoutNullException,
			NomExistantException, AjoutLuiMemeException {
		r1.ajout(r2);
		assertTrue(r1.getContenu().contains(r2));
		r2.ajout(f2);
		r2.ajout(f3);
		r2.ajout(r3);
		assertTrue(r2.getContenu().contains(r3));
		r3.ajout(f1);
		r3.ajout(r1);
	}

}
