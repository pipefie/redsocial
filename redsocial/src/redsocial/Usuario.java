package redsocial;

import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;

public class Usuario {
	private String email;
	private String contrasenia;
	private ArrayList<Post> listaposts;
	private TreeMap<Date, Integer> mapaLikesUsuario;
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
	public TreeMap<Date, Integer> getMapaLikesUsuario() {
		return mapaLikesUsuario;
	}
	public void setMapaLikesUsuario(TreeMap<Date, Integer> mapaLikesUsuario) {
		this.mapaLikesUsuario = mapaLikesUsuario;
	}
	@Override
	public String toString() {
		return "Usuario [email=" + email + ", contrasenia=" + contrasenia + ", listaposts=" + listaposts
				+ ", mapaLikesUsuario=" + mapaLikesUsuario + "]";
	}
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Usuario(String email, String contrasenia, ArrayList<Post> listaposts,
			TreeMap<Date, Integer> mapaLikesUsuario) {
		super();
		this.email = email;
		this.contrasenia = contrasenia;
		this.listaposts = listaposts;
		this.mapaLikesUsuario = mapaLikesUsuario;
	}
	

}
