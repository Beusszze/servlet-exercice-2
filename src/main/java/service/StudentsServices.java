package service;

import java.util.ArrayList;
import java.util.List;

import models.Student;

/*
 * Service gérant les formations 
 */
public class StudentsServices {
	
	private static StudentsServices instances = null;
	private List<Student> students = new ArrayList<Student>();
	
	
	// creation du singleton
	private StudentsServices() {
		
		// boucle for afin de remplir la liste des etudiants (15)
		for (int i = 1; i <16; i++) {
			students.add(new Student("Etudiant n°" + i, "password", "nom de famille n°" + i,
					"prénom n°" + i, 20 + i, i*20/100+10, "formation " + i/15));		
		}
		
	
}
	
	public static StudentsServices getInstance() {
		if (StudentsServices.instances == null) {
			StudentsServices.instances = new StudentsServices();
		}
		return instances;
	}
	
	
	public List<Student> getStudents() {
		return this.students;
	}
	
	
	

}
