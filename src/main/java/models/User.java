package models;

// classe modèle User 
// permet l'instanciation d'utilisateurs qui auront comme attributs un nom d'utilisateur et un mot de passe
// utilisé pour l'authentification

public class User {
	// attributs, en privé
	private String username;
	private String password;
	
	// constructeur vide
	public User () {}
	
	// constructeur plein
	public User(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
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
	
	
	
	
	

}


