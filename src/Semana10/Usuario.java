package Semana10;

public class Usuario {
	private String user;
	private String email;
	private String nombre;
	private Integer dni;
	
	public Usuario() {
	}
	
	public Usuario(String user, String email, String nombre, Integer dni) {
		this.user = user;
		this.email = email;
		this.nombre = nombre;
		this.setDni(dni);
	}
	
	public String getEmail() {
		return email;
	}
	
	
	public String getUser() {
		return user;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setUser(String user) {
		this.user = user;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}
}
