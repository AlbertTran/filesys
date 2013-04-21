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
 * Classe RepertoireTest.
 * 
 * @author (Albert TRAN, Salwan SAIF)
 * @version (21/04/2013)
 * 
 * Classe implementant les tests JUNIT 4 d'un repertoire.
 * Exceptions gerees : AjoutNullException, NomExistantException; AjoutLuiMemeException.
 */

public class RepertoireTest {

	/** Les fichiers contenus */
	private Fichier f1, f2, f3;

	/** Les repertoires */
	private Repertoire r1, r2, r3;

	/**
	 * Instanciation des fichiers et repertoire.
	 * setUp est une methode effectuee avant chaque test.
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
	 * Rend null tous les objets instancies (non-obligatoire)
	 * tearDown est une methode effectuee apres chaque test.
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
	 * Test de calculs de taille de repertoires valides.
	 * 
	 * @throws AjoutNullException
	 *             Exception AjoutNullException
	 * @throws NomExistantException
	 *             Exception NomExistantException
	 * @throws AjoutLuiMemeException
	 *             Exception AjoutLuiMemeException
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
	 * Test d'ajout d'un element de reference null dans un repertoire.
	 * Exception attendue : AjoutNullException
	 * 
	 * @throws AjoutNullException
	 *             Exception AjoutNullException
	 * @throws NomExistantException
	 *             Exception NomExistantException
	 * @throws AjoutLuiMemeException
	 *             Exception AjoutLuiMemeException
	 */
	@Test(expected = AjoutNullException.class)
	public void testAjoutReferenceNulle() throws AjoutNullException,
			NomExistantException, AjoutLuiMemeException {
		r1.ajout(null);
	}

	/**
	 * Test d'ajout d'un repertoire ayant le meme nom qu'un fichier dans un meme repertoire.
	 * Exception attendue : NomExistantException
	 * 
	 * @throws AjoutNullException
	 *             Exception AjoutNullException
	 * @throws NomExistantException
	 *             Exception NomExistantException
	 * @throws AjoutLuiMemeException
	 *             Exception AjoutLuiMemeException
	 */
	@Test(expected = NomExistantException.class)
	public void testAjoutMemeNomElt() throws AjoutNullException,
			NomExistantException, AjoutLuiMemeException {
		assertTrue(f1.getNom().equals(r2.getNom()));
		r1.ajout(f1);
		r1.ajout(r2);
	}

	/**
	 * Test d'ajout d'un fichier ayant le meme nom qu'un autre fichier dans un meme repertoire.
	 * Exception attendue : NomExistantException
	 * 
	 * @throws AjoutNullException
	 *             Exception AjoutNullException
	 * @throws NomExistantException
	 *             Exception NomExistantException
	 * @throws AjoutLuiMemeException
	 *             Exception AjoutLuiMemeException
	 */
	@Test(expected = NomExistantException.class)
	public void testAjoutMemeNomFic() throws AjoutNullException,
			NomExistantException, AjoutLuiMemeException {
		r1.ajout(f1);
		r1.ajout(f1);
	}

	/**
	 * Test d'ajout d'un repertoire ayant le meme nom qu'un autre repertoire dans un meme repertoire.
	 * Exception attendue : NomExistantException
	 * 
	 * @throws AjoutNullException
	 *             Exception AjoutNullException
	 * @throws NomExistantException
	 *             Exception NomExistantException
	 * @throws AjoutLuiMemeException
	 *             Exception AjoutLuiMemeException
	 */
	@Test(expected = NomExistantException.class)
	public void testAjoutMemeNomRep() throws AjoutNullException,
			NomExistantException, AjoutLuiMemeException {
		r1.ajout(r2);
		r1.ajout(r2);
	}

	/**
	 * Test d'ajout d'un repertoire dans lui meme.
	 * Exception attendue : AjoutLuiMemeException
	 * 
	 * @throws AjoutNullException
	 *             Exception AjoutNullException
	 * @throws NomExistantException
	 *             Exception NomExistantException
	 * @throws AjoutLuiMemeException
	 *             Exception AjoutLuiMemeException
	 */
	@Test(expected = AjoutLuiMemeException.class)
	public void testAjoutLuiMeme() throws AjoutNullException,
			NomExistantException, AjoutLuiMemeException {
		r1.ajout(r1);
	}

	/**
	 * Test d'ajout d'un repertoire dans lui-même (indirectement)
	 * Exception attendue : AjoutLuiMemeException
	 * 
	 * @throws AjoutNullException
	 *             Exception AjoutNullException
	 * @throws NomExistantException
	 *             Exception NomExistantException
	 * @throws AjoutLuiMemeException
	 *             Exception AjoutLuiMemeException
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