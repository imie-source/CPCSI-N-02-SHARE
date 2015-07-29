package fr.imie.controler;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.imie.DTO.Manager;
import fr.imie.service.IUserService;

/**
 * Servlet implementation class ManagerFormController
 */
@WebServlet("/managerForm")
public class ManagerFormController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Inject
	IUserService userService;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ManagerFormController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String idParmeter = request.getParameter("id");
		if (idParmeter != null) {
			Integer id = Integer.parseInt(idParmeter);
			request.setAttribute("manager", userService.findManagerById(id));
		}

		request.getRequestDispatcher("/WEB-INF/managerForm.jsp").forward(
				request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Manager manager = new Manager();
		String lastName = request.getParameter("inputNom");
		manager.setLastName(lastName);
		String firstName = request.getParameter("inputPrenom");
		manager.setFirstName(firstName);
		String mail = request.getParameter("inputMail");
		manager.setMail(mail);
		String password = request.getParameter("inputPassword");
		manager.setPassword(password);
		if (request.getParameter("actionEdit") != null) {
			
			String idParameter = request.getParameter("id");
			manager.setId(Integer.parseInt(idParameter));
			userService.updateManager(manager);
			
		} else if (request.getParameter("actionCreate") != null) {
			userService.createManager(manager);
		}

		response.sendRedirect("./userList");
	}

}
