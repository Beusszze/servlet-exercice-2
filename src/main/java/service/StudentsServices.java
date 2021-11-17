package service;

import java.util.ArrayList;
import java.util.List;

import models.Student;

/*
 * Service gérant les étudiants 
 * rend la liste des étudiants accessible dans tout le réseau
 */
public class StudentsServices {
	
	// instanciation d'une nouvelle list qui contiendra les students 
	private List<Student> students = new ArrayList<Student>(); 
	// instanciation d'un StudentsServices null pour gérer le singleton
	private static StudentsServices instances = null; 

	
	
	// creation de la liste d'étudiant via un singleton
	private StudentsServices() {
		
		// boucle for afin de remplir la liste des etudiants (15)
		for (int i = 1; i <16; i++) {
			students.add(new Student("Etudiant" + i, "password", "nom de famille" + i,
					"prénom" + i, 20 + i, i*20/100+10, "formation" + i/15));
			System.out.println("etudiant "+i+" créé");
		}
		
	
}
	// gère le singleton, crée l'instance si elle ne l'est pas faite
	// rend le singleton accessible
	public static StudentsServices getInstance() {
		if (StudentsServices.instances == null) {
			StudentsServices.instances = new StudentsServices();
		}
		System.out.println("singleton créé");

		return instances;
	}
	
	// rend la liste des étudiants accessible
	public List<Student> getStudents() {
		return this.students;
	}
	
	// permet de récupérer un étudiant si son username est égal au username demandé
	public Student getStudentByUsername(String username) {
		Student sdt = null;
		for (Student student : students) {
			if (student.getUsername().equals(username)) {
				sdt = student;
				break;
			}
		}
		return sdt;
	}
	
	
	

}
