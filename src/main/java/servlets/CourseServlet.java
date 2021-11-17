package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Course;
import service.CoursesServices;

/**
 * Servlet implementation class HomeServlet
 * servlet d'une formation 
 */
@WebServlet("/formation")
public class CourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// récupère le singleton (liste de formations) via le service 
	// instancie un objet course de la classe Course
	private CoursesServices coursesServices = CoursesServices.getInstance();
	private Course course;
	
	
    public CourseServlet() {}

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// récupère le paramètre title de la requête, devient paramètre de la méthode permettant la récupération de la formaiton par nom
		course = this.coursesServices.getCourseByName(request.getParameter("title"));
		
		// si course est null, redirection vers accueil
		if (course == null) {
			response.sendRedirect("/exoServletDeux/accueil");
			return;
		}
		
		
		request.setAttribute("course", course); // donne à la requête la valeur course pour l'attribut "course"
		request.getRequestDispatcher("WEB-INF/course.jsp").forward(request, response); // envoie la requête vers course.jsp
		
	}


}
