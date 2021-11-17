package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Course;
import service.CoursesServices;

/**
 * Servlet implementation class HomeServlet
 * Servlet des formations (liste)
 */
@WebServlet("/formations")
public class CoursesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Course> courses = new ArrayList<Course> (); // liste qui contiendra les formations
	private CoursesServices coursesServices = CoursesServices.getInstance(); // récupère l'instance (singleton) via le service 


    // constructeur qui prend en paramètre la liste des formations (courses) obtenue via le service
    public CoursesServlet() {
    	this.courses = coursesServices.getCourses();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		request.setAttribute("courses", courses); // ajoute la liste courses comme attribut de la requête
		request.getRequestDispatcher("WEB-INF/courses.jsp").forward(request, response); // envoie la requête vers le courses.jsp 
	
		
	}


}
