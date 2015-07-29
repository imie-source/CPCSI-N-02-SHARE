package fr.imie.listener;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import fr.imie.DTO.Driver;
import fr.imie.DTO.Manager;
import fr.imie.DTO.User;
import fr.imie.session.DummyUserApplication;

/**
 * Application Lifecycle Listener implementation class DummyData
 *
 */
@WebListener
public class DummyData implements ServletContextListener{

    @Inject
    private DummyUserApplication dummyUtilisateur;
	
	/**
     * Default constructor. 
     */
    public DummyData() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		User chauffeur1 = new Driver();
    	chauffeur1.setId(1);
    	chauffeur1.setFirstName("alain");
		chauffeur1.setLastName("proviste");
		chauffeur1.setMail("alain.proviste@gmail.com");
		chauffeur1.setPassword("ap");
		
		
		User manager1 = new Manager();
		manager1.setId(2);
		manager1.setFirstName("alex");
		manager1.setLastName("terieur");
		manager1.setMail("alex.terieur@gmail.com");
		chauffeur1.setPassword("at");
		
		List<User> users = new ArrayList<User>();
		users.add(chauffeur1);
		users.add(manager1);
		
		dummyUtilisateur.setUsers(users);
	
	}


	
}
