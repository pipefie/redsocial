package redsocial;

import java.util.ArrayList;


public class Usuario {
	private String email;
	private String contrasenia;
	private ArrayList<Post> listaposts;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public ArrayList<Post> getListaposts() {
		return listaposts;
	}
	public void setListaposts(ArrayList<Post> listaposts) {
		this.listaposts = listaposts;
	}

	@Override
	public String toString() {
		return "Usuario [email=" + email + ", contrasenia=" + contrasenia + ", listaposts=" + listaposts
				+ "]";
	}
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Usuario(String email, String contrasenia, ArrayList<Post> listaposts) {
		super();
		this.email = email;
		this.contrasenia = contrasenia;
		this.listaposts = listaposts;
	
	}
	

}
