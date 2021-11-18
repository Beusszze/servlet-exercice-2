package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/*
 * Servlet de la page de connexion (login)
 */

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// constructeur vide
	public LoginServlet() {
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// envoie la requête vers login.jsp 
		req.getRequestDispatcher("WEB-INF/login.jsp").forward(req, resp);


	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// username et password récupéré à partir des paramètres de la requête, mis dans des variables 
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		// boucle si afin de définir si mdp et username sont les bons, renvoie vers page accueil si c'est le cas
		if (password.equals("visitorP") && username.equals("visitor")) {
			resp.sendRedirect(req.getContextPath() + "/accueil");
			
			// sinon, reste sur la page de connexion
		} else {
			resp.sendRedirect(req.getContextPath() + "/login");
		}

	}

}
