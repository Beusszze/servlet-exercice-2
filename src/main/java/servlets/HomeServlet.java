package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet de la page d'accueil
 */
//TODO rendre accessible ce servlet uniqueemnt quand l'utilisateur est loggé
@WebServlet("/accueil")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public HomeServlet() {
    }

    // envoie la requête vers le jsp de la page d'accueil
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/home.jsp").forward(req, resp);

	
	}


}
