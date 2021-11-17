package service;

import java.util.ArrayList;
import java.util.List;

import models.Course;

/*
 * Service gérant les formations 
 * rend la liste de formations accessible dans tout le réseau
 */
public class CoursesServices {
	
	private static CoursesServices instances = null;
	private List<Course> courses = new ArrayList<Course>();
	
	
	// creation du singleton
	private CoursesServices() {
		
		// boucle for afin de remplir la liste des formations (5)
		for (int i = 1; i <6; i++) {
			courses.add(new Course("Formation" + i, "blablabla---" + i, 15));
		}
		
	}
	// gère le singleton, s'assure de le créé s'il ne l'est pas fait, si déjà instancié, ne rien faire
	public static CoursesServices getInstance() {
		if (CoursesServices.instances == null) {
			CoursesServices.instances = new CoursesServices();
		}
		return instances;
	}
	
	// rend la liste des formations accessibles (getter)
	public List<Course> getCourses() {
		return this.courses;
	}
	
	// rend les formations trouvables par leur nom (getter)
	public Course getCourseByName(String title) {
		Course courseName = null;
		
		// boucle pour chaque objet course dans la liste courses
		// si le titre du course (formation) est le même que celui mit en paramètre, il est renvoyé sinon il reste à null
		for (Course course : courses ) { 
			if (course.getTitle().equals(title)) {
				courseName = course;
				break;
			}
		}
		return courseName;
	}
	
	

}
