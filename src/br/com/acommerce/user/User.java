package br.com.acommerce.user;

public class User {

	private Long id;
	private final String email;
	private final String password;

	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
		
	}
	
	

}
