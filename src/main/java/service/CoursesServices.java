package service;

import java.util.ArrayList;
import java.util.List;

import models.Course;

/*
 * Service gérant les formations 
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
	
	public static CoursesServices getInstance() {
		if (CoursesServices.instances == null) {
			CoursesServices.instances = new CoursesServices();
		}
		return instances;
	}
	
	
	public List<Course> getCourses() {
		return this.courses;
	}
	
	public Course getCourseByName(String title) {
		Course courseName = null;
		for (Course course : courses ) {
			if (course.getTitle().equals(title)) {
				courseName = course;
				break;
			}
		}
		return courseName;
	}
	
	

}
