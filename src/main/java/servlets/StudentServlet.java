package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Student;
import service.StudentsServices;

/**
 * Servlet implementation class HomeServlet
 * servlet d'un étudiant
 */
@WebServlet("/etudiant")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// récupère la liste des étudiants via le service et la méthode .getInstance
	private StudentsServices studentsServices = StudentsServices.getInstance();
	// instancie un objet student
	private Student student;

    
    public StudentServlet() {}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		System.out.println(studentsServices);
//		System.out.println(student);
		
		// récupère dans "student" l'étudiant en fonction de son username
		student = this.studentsServices.getStudentByUsername(request.getParameter("username"));
		
//		System.out.println(student); // affiche dans la console l'instance student
		
		// s'il est nul, redirection vers l'accueil
		if (student == null) {
			response.sendRedirect("/exoServletDeux/accueil");
			return;
		}
		
		// s'il est non nul, ajout de l'attribut student dans la requête
		request.setAttribute("student", student);
		// envoie de la requête vers student.jsp
		request.getRequestDispatcher("WEB-INF/student.jsp").forward(request, response);
		
	}


}
