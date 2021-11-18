package models;

// clase Student héritant de User
// permet l'instanciation des objets étudiants

public class Student extends User{
	
	// liste des attributs, tous en accessibilité privé
	private String username;
	private String password;
	private String lastName;
	private String firstName;
	private int age; 
	private double grade;
	private String course;
	//TODO remplacer String course par Course course
	
	// constructeur de User
	public Student(String username, String password) {
		super(username, password);
	}

	// constructeur complet
	public Student(String username, String password, String lastName, String firstName, int age, double grade, String course) {
		super(username, password);
		this.setUsername(username);
		this.setPassword(password);
		this.setLastName(lastName);
		this.setFirstName(firstName);
		this.setAge(age);
		this.setGrade(grade);
		this.setCourse(course);
	}

	// getters et setters 
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getGrade() {
		return grade;
	}


	public void setGrade(double grade) {
		this.grade = grade;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [username=" + username + ", password=" + password + ", lastName=" + lastName + ", firstName="
				+ firstName + ", age=" + age + ", grade=" + grade + ", course=" + course + "]";
	}







	

	


}
