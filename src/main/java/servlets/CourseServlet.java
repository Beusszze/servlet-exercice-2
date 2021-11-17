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
 */
@WebServlet("/formation")
public class CourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CoursesServices coursesServices = CoursesServices.getInstance();
	private Course course;
	/**
     * Default constructor. 
     */
    public CourseServlet() {}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		course = this.coursesServices.getCourseByName(request.getParameter("title"));
		
		if (course == null) {
			response.sendRedirect("/accueil");
			return;
		}
		
		
		request.setAttribute("course", course); // donne à la requête la valeur course pour l'attribut "course"
		request.getRequestDispatcher("WEB-INF/course.jsp").forward(request, response);
		
	}


}
