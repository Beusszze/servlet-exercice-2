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

		
		// récupération d'un étudiant grâce à  l'attribut username de ma requête et la méthode getStudentByUsername du service
		// stockage dans l'instance student
		student = this.studentsServices.getStudentByUsername(request.getParameter("username"));
		
		
		// s'il est nul, redirection vers l'accueil
		//TODO erreur à ce niveau, redirection systématique vers accueil (student est donc nul à chaque fois)
		if (student == null) {
			response.sendRedirect("/exoServletDeux/accueil");
			return;
		}
		
		// s'il est non nul, ajout de l'attribut student dans la requête
		request.setAttribute("student", student);
		// envoie la requête vers student.jsp
		request.getRequestDispatcher("WEB-INF/student.jsp").forward(request, response);
		
	}


}
