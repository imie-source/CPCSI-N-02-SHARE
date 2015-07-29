/**
 * 
 */
package fr.imie.session;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;

import fr.imie.DTO.User;

/**
 * @author imie
 *
 */
@ApplicationScoped
public class DummyUserApplication implements Serializable{

	private static final long serialVersionUID = -7986504645715452418L;
	
	
	/**
	 * 
	 */
	private List<User> users;

	/**
	 * @return the users
	 */
	public List<User> getUsers() {
		return users;
	}

	/**
	 * @param users the users to set
	 */
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
	
}
