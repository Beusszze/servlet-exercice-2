package models;

public class Course {
	
	private String title;
	private String programm;
	private int studentNbr;
	
	
	public Course(String title, String programm, int studentNbr) {
		super();
		this.setTitle( title);
		this.setProgramm(programm);
		this.setStudentNbr(studentNbr);
	}


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
