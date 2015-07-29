package fr.imie.listener;

import javax.ejb.EJB;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import fr.imie.service.IUserService;

/**
 * Application Lifecycle Listener implementation class DummyData
 *
 */
@WebListener
public class DummyData implements ServletContextListener{

    @EJB
    private IUserService service;
	
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
		service.initData();
	}


	
}
