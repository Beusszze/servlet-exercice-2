package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import models.User;

/*
 * Servlet de la page de connexion
 */

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	public LoginServlet() {
	}

	User visitor = new User("visitor", "visitorP");

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession ();
		session.setAttribute("user", visitor);
		req.getRequestDispatcher("WEB-INF/login.jsp").forward(req, resp);


	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String username = req.getParameter("username");
		String password = req.getParameter("password");

		if (password.equals("visitorP") && username.equals("visitor")) {
			resp.sendRedirect(req.getContextPath() + "/accueil");

		} else {
			resp.sendRedirect(req.getContextPath() + "/login");
		}

	}

}
