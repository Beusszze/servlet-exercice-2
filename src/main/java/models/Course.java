package models;

// classe modèle Course pour instancier les formations

public class Course {
	
	// déclaration des attributs
	private String title;
	private String programm;
	private int studentNbr;
	
	// constructeur vide
	public Course () {}
	
	// constructeur complet
	public Course(String title, String programm, int studentNbr) {
		super();
		this.setTitle( title);
		this.setProgramm(programm);
		this.setStudentNbr(studentNbr);
	}

	// getter et setters
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getProgramm() {
		return programm;
	}


	public void setProgramm(String programm) {
		this.programm = programm;
	}


	public int getStudentNbr() {
		return studentNbr;
	}


	public void setStudentNbr(int studentNbr) {
		this.studentNbr = studentNbr;
	}
	
	
	

}
