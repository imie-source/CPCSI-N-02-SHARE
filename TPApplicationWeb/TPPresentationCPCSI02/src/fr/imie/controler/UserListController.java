package fr.imie.controler;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.javafx.beans.IDProperty;

import fr.imie.DTO.User;
import fr.imie.service.IUserService;

/**
 * Servlet implementation class UserListController
 */
@WebServlet("/userList")
public class UserListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Inject
	IUserService userService;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserListController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("users", userService.findAll());

		request.getRequestDispatcher("/WEB-INF/userList.jsp").forward(request,
				response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String idParameter= request.getParameter("inputId");
		if (request.getParameter("actionSearch") != null) {
			String inputLastNameSearch = request
					.getParameter("inputLastNameSearch");
			inputLastNameSearch = inputLastNameSearch.compareTo("") == 0 ? null
					: inputLastNameSearch;
			String inputFirstNameSearch = request
					.getParameter("inputFirstNameSearch");
			inputFirstNameSearch = inputFirstNameSearch.compareTo("") == 0 ? null
					: inputFirstNameSearch;
			List<User> users = userService.findByNomPrenom(inputLastNameSearch,
					inputFirstNameSearch);
			request.setAttribute("users", users);
			request.getRequestDispatcher("/WEB-INF/userList.jsp").forward(
					request, response);
		} else if (request.getParameter("actionCreateManager") != null) {
			response.sendRedirect("./managerForm");
		} else if (request.getParameter("actionDelete") != null) {
			userService.deleteManagerById(Integer.parseInt(idParameter));
			request.setAttribute("users", userService.findAll());
			request.getRequestDispatcher("/WEB-INF/userList.jsp").forward(request,
					response);

		} else if (request.getParameter("actionEdit") != null) {
			response.sendRedirect("./managerForm?id="+idParameter);
		}
	}

}
