package isty.ini1.filesys;

import isty.ini1.filesys.exceptions.AjoutLuiMemeException;
import isty.ini1.filesys.exceptions.AjoutNullException;
import isty.ini1.filesys.exceptions.FichierTailleIncorrecteException;
import isty.ini1.filesys.exceptions.NomExistantException;

// TODO: Auto-generated Javadoc
/**
 * Hello world!.
 */
public class FileSystem {
	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		try {
			Repertoire rep1 = new Repertoire("r1");
			Fichier fic1 = new Fichier("f1", 25);
			Fichier fic2 = new Fichier("f2", 15);
			System.out.println(fic1.getNom() + " a une taille de "
					+ fic1.getTaille() + ".");
			System.out.println(fic2.getNom() + " a une taille de "
					+ fic2.getTaille() + ".");
			rep1.ajout(fic1);
			rep1.ajout(fic2);
			System.out.println(rep1.getNom() + " a une taille de "
					+ rep1.getTaille() + ".");

		} catch (FichierTailleIncorrecteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AjoutNullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NomExistantException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AjoutLuiMemeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
