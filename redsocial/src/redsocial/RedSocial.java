package redsocial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;


public class RedSocial {
	private ArrayList<Usuario> listaUsuarios;
	private ArrayList<Post> listaPosts;
	private HashMap<Post, ArrayList<Like>> mapPost;
	public ArrayList<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}
	public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}
	public ArrayList<Post> getListaPosts() {
		return listaPosts;
	}
	public void setListaPosts(ArrayList<Post> listaPosts) {
		this.listaPosts = listaPosts;
	}
	public HashMap<Post, ArrayList<Like>> getMapPost() {
		return mapPost;
	}
	public void setMapPost(HashMap<Post, ArrayList<Like>> mapPost) {
		this.mapPost = mapPost;
	}
	@Override
	public int hashCode() {
		return Objects.hash(listaPosts, listaUsuarios, mapPost);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RedSocial other = (RedSocial) obj;
		return Objects.equals(listaPosts, other.listaPosts) && Objects.equals(listaUsuarios, other.listaUsuarios)
				&& Objects.equals(mapPost, other.mapPost);
	}
	public RedSocial() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RedSocial(ArrayList<Usuario> listaUsuarios, ArrayList<Post> listaPosts,
			HashMap<Post, ArrayList<Like>> mapPost) {
		super();
		this.listaUsuarios = listaUsuarios;
		this.listaPosts = listaPosts;
		this.mapPost = mapPost;
	}
	
	
	

}
