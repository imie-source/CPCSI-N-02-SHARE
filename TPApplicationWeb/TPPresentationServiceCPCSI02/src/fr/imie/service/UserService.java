/**
 * 
 */
package fr.imie.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import fr.imie.DTO.Manager;
import fr.imie.DTO.User;
import fr.imie.session.DummyUserApplication;

/**
 * @author imie
 *
 */
public class UserService implements IUserService {

	@Inject
	private DummyUserApplication dummyUsers;

	/* (non-Javadoc)
	 * @see fr.imie.service.IUserService#findAll()
	 */
	@Override
	public List<User> findAll() {
		return dummyUsers.getUsers();
	}

	/* (non-Javadoc)
	 * @see fr.imie.service.IUserService#findByNomPrenom(java.lang.String, java.lang.String)
	 */
	@Override
	public List<User> findByNomPrenom(String nom, String prenom) {
		List<User> users = dummyUsers.getUsers();
		List<User> result = new ArrayList<User>();
		for (User user : users) {
			if ((nom == null || user.getLastName().contains(nom))
					&& (prenom == null || user.getFirstName().contains(prenom))) {
				result.add(user);
			}
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see fr.imie.service.IUserService#createManager(fr.imie.DTO.Manager)
	 */
	@Override
	public void createManager(Manager manager) {
		dummyUsers.getUsers().add(manager);
	}

	/* (non-Javadoc)
	 * @see fr.imie.service.IUserService#deleteManagerById(int)
	 */
	@Override
	public void deleteManagerById(int idUser) {
		List<User> users = dummyUsers.getUsers();
		User userToDelete = getUserById(idUser, users);
		users.remove(userToDelete);
	}

	/* (non-Javadoc)
	 * @see fr.imie.service.IUserService#findById(java.lang.Integer)
	 */
	@Override
	public User findById(Integer idUser) {
		List<User> users = dummyUsers.getUsers();
		User user = getUserById(idUser, users);
		return user;
	}

	/* (non-Javadoc)
	 * @see fr.imie.service.IUserService#findManagerById(java.lang.Integer)
	 */
	@Override
	public Manager findManagerById(Integer idUser) {
		List<User> users = dummyUsers.getUsers();
		User user = getUserById(idUser, users);
		Manager manager = null;
		try {
			manager = (Manager) user;
		} catch (Exception e) {
			// downcast impossible
			// return null
		}
		return manager;
	}

	private User getUserById(Integer idUser, List<User> users) {
		User user = null;
		for (User userInspect : users) {
			if (userInspect.getId() == idUser) {
				user = userInspect;
			}
		}
		return user;
	}

	/* (non-Javadoc)
	 * @see fr.imie.service.IUserService#updateManager(fr.imie.DTO.Manager)
	 */
	@Override
	public void updateManager(Manager manager) {
		List<User> users = dummyUsers.getUsers(); 
		User user = getUserById(manager.getId(), users);
		user.setMail(manager.getMail());
		user.setFirstName(manager.getFirstName());
		user.setLastName(manager.getLastName());
		user.setPassword(manager.getPassword());
	}

}
