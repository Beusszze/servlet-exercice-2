package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Student;
import service.StudentsServices;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/etudiants")
public class StudentsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Student> students = new ArrayList<Student> (); // liste qui contiendra les formations
	private StudentsServices studentsServices = StudentsServices.getInstance();


    /**
     * Default constructor. 
     */
    public StudentsServlet() {
    	this.students = studentsServices.getStudents();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("students", students); // 
		request.getRequestDispatcher("WEB-INF/students.jsp").forward(request, response);
	}


}
