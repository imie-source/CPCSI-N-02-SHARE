/**
 * 
 */
package fr.imie.DTO;

/**
 * @author imie
 *
 */
public class Manager extends User {

	/* (non-Javadoc)
	 * @see fr.imie.DTO.Utilisateur#getJob()
	 */
	@Override
	public String getJob() {
		return "Gestionnaire";
	}

}
