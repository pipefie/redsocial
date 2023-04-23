package redsocial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;


public class RedSocial implements Serializable{

	private static final long serialVersionUID = 1L;
	private ArrayList<Usuario> listaUsuarios;
	private ArrayList<Post> listaPosts;
	private HashMap<Post, ArrayList<Like>> mapPost;
	private TreeMap<String, TreeSet<Like>> mapaLikesUsuario;
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
	public TreeMap<String, TreeSet<Like>> getMapaLikesUsuario() {
		return mapaLikesUsuario;
	}
	public void setMapaLikesUsuario(TreeMap<String, TreeSet<Like>> mapaLikesUsuario) {
		this.mapaLikesUsuario = mapaLikesUsuario;
	}
	
	public void anyadirUsuario (Usuario user) {
		getListaUsuarios().add(user);
	}
	public void anyadirPost (Post post) {
		getListaPosts().add(post);
	}
	public void anyadirLikePost (Like like) {
		if ( getMapPost().containsKey(like.getPostLike()) ){
			getMapPost().get(like.getPostLike()).add(like);
		}
		else {
			getMapPost().put(like.getPostLike(), new ArrayList<Like>(Arrays.asList(like)));
		}
	}
	public void anyadirLikeUsuario (Like like) {
		if (getMapaLikesUsuario().containsKey(like.getUsuario().getEmail())) {
			getMapaLikesUsuario().get(like.getUsuario().getEmail()).add(like);
		}
		else {
			TreeSet<Like> listaLikes = new TreeSet<>(new ComparatorDates());
			listaLikes.add(like);
			getMapaLikesUsuario().put(like.getUsuario().getEmail(), listaLikes);
		}
	}
	@Override
	public String toString() {
		return "RedSocial [listaUsuarios=" + listaUsuarios + ", listaPosts=" + listaPosts + ", mapPost=" + mapPost
				+ "]";
	}

	public RedSocial() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RedSocial(ArrayList<Usuario> listaUsuarios, ArrayList<Post> listaPosts,
			HashMap<Post, ArrayList<Like>> mapPost,TreeMap<String, TreeSet<Like>> mapaLikesUsuario) {
		super();
		this.listaUsuarios = listaUsuarios;
		this.listaPosts = listaPosts;
		this.mapPost = mapPost;
		this.mapaLikesUsuario = mapaLikesUsuario;
	}
	
	public void saveFileAll(RedSocial datos) {
		try {
			FileOutputStream file = new FileOutputStream("datosRedSocial.txt");
			ObjectOutputStream fileRed = new ObjectOutputStream(file);
			fileRed.writeObject(datos); //se guardan todas las estructuras de la red social en un solo .txt
			fileRed.close();
			System.out.println("se ha guardado la informacion en el fichero: datosRedsocial");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public RedSocial readandLoadFileAll (String fileData) {
		try {
			FileInputStream file = new FileInputStream(fileData);
			ObjectInputStream fileRed = new ObjectInputStream(file);
			RedSocial dataRedSocial = (RedSocial) fileRed.readObject();
			fileRed.close();
			System.out.println("se ha leido y cargado la informacion del fichero "+fileData);
			return dataRedSocial;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	/* 
	 * en los siguientes métodos se guarda y lee cada estructura de datos en .txt por separado para mejorar el acceso a los datos ya que con 
	 * el anterior para añadir un dato a cualquier estructura habria que tratar a todas a la vez
	 */
	
	public void saveUsers (ArrayList<Usuario> listaUsuarios) {
		try {
			FileOutputStream file = new FileOutputStream("usuariosRedSocial.txt");
			ObjectOutputStream fileUsers = new ObjectOutputStream(file);
			fileUsers.writeObject(listaUsuarios);
			fileUsers.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<Usuario> readandLoadUsers(String fileUsers){
		try {
			FileInputStream file= new FileInputStream(fileUsers);
			ObjectInputStream fileUsersLoad = new ObjectInputStream(file);
			@SuppressWarnings("unchecked")
			ArrayList<Usuario> listaUsuariosRedSocial = (ArrayList<Usuario>) fileUsersLoad.readObject();
			fileUsersLoad.close();
			return listaUsuariosRedSocial;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	public void savePosts (ArrayList<Post> listaPosts) {
		try {
			FileOutputStream file = new FileOutputStream("postsRedSocial.txt");
			ObjectOutputStream filePosts = new ObjectOutputStream(file);
			filePosts.writeObject(listaPosts);
			filePosts.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public ArrayList<Post> readandLoadPosts(String filePosts){
		try {
			FileInputStream file= new FileInputStream(filePosts);
			ObjectInputStream filePostsLoad = new ObjectInputStream(file);
			@SuppressWarnings("unchecked")
			ArrayList<Post> listaPostsRedSocial = (ArrayList<Post>) filePostsLoad.readObject();
			filePostsLoad.close();
			return listaPostsRedSocial;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	public void saveMapPosts(HashMap<Post, ArrayList<Like>> mapPost) {
		try {
			FileOutputStream file = new FileOutputStream("mapPostsRedSocial.txt");
			ObjectOutputStream fileMapPosts = new ObjectOutputStream(file);
			fileMapPosts.writeObject(mapPost);
			fileMapPosts.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void saveMapLikesUSers(TreeMap<String, TreeSet<Like>> mapaLikesUsuario) {
		
		try {
			FileOutputStream file = new FileOutputStream("mapLikesUserRedSocial.txt");
			ObjectOutputStream fileMapLikes = new ObjectOutputStream(file);
			fileMapLikes.writeObject(mapaLikesUsuario);
			fileMapLikes.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
