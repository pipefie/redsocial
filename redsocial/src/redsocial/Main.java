package redsocial;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Date;
import java.util.HashMap;


public class Main {

	public static void main(String[] args) {
		
		ArrayList<Post> listaPostusuario1 = new ArrayList<>();
		ArrayList<Post> listaPostusuario2 = new ArrayList<>();
			
		Usuario usuario1 = new Usuario("email-1","contraseña",listaPostusuario1);
		Usuario usuario2 = new Usuario("email-2","contraseña",listaPostusuario2);

		Post post1 = new Post(new Date(), "descripcion-1",usuario1);
		Post post2 = new Post(new Date(), "descripcion-2",usuario2);
		Post post3 = new Post(new Date(), "descripcion-3",usuario1);
		Post post4 = new Post(new Date(), "descripcion-4",usuario2);
		Post post5 = new Post(new Date(), "descripcion-5",usuario1);
		
		listaPostusuario1.add(post1);
		listaPostusuario1.add(post2);

		listaPostusuario2.add(post3);
		listaPostusuario2.add(post4);
		listaPostusuario2.add(post5);
		
		Like like1 = new Like(new Date(), usuario1, post1);
		Like like2 = new Like(new Date(), usuario2, post2);
		Like like3 = new Like(new Date(), usuario1, post3);
		Like like4 = new Like(new Date(), usuario2, post4);
		
		TreeSet<Like> listaLikesUsuario1 = new TreeSet<>(new ComparatorDates());
		listaLikesUsuario1.add(like1);
		listaLikesUsuario1.add(like3);
		TreeSet<Like> listaLikesUsuario2 = new TreeSet<>(new ComparatorDates());
		listaLikesUsuario2.add(like2);
		listaLikesUsuario2.add(like4);
		
		
		
		ArrayList<Usuario> usuariosRedSocial = new ArrayList<Usuario>(Arrays.asList(usuario1,usuario2));
		ArrayList<Post> postsRedSocial = new ArrayList<Post>(Arrays.asList(post1,post2,post3,post4,post5));
		HashMap<Post, ArrayList<Like>> mapaPostsRedSocial = new HashMap<>();
		TreeMap<String, TreeSet<Like>> mapaLikesUsuarios = new TreeMap<>();
		
		mapaPostsRedSocial.put(post1, new ArrayList<>(Arrays.asList(like1)));
		mapaPostsRedSocial.put(post2, new ArrayList<>(Arrays.asList(like2)));
		mapaPostsRedSocial.put(post3, new ArrayList<>(Arrays.asList(like3)));
		mapaPostsRedSocial.put(post4, new ArrayList<>(Arrays.asList(like4)));
		mapaPostsRedSocial.put(post5, new ArrayList<>());
		
		mapaLikesUsuarios.put(usuario1.getEmail(), listaLikesUsuario1);
		mapaLikesUsuarios.put(usuario2.getEmail(), listaLikesUsuario2);
		
		
		System.out.println("Usuarios de la Red Social: ");
		for (Usuario usuario:usuariosRedSocial) {
			System.out.println(usuario.getEmail()+" con: "+usuario.getListaposts().size()+" posts");
			System.out.println("cantidad de likes del usuario: "+mapaLikesUsuarios.get(usuario.getEmail()).size());
		}
		System.out.println("-----------------------------");
		System.out.println("Posts en la Red Social: ");
		for (Post post:postsRedSocial) {
			System.out.println("Subido por: "+post.getUsuario().getEmail()+" el: "+post.getFechaPublicacion());
			System.out.println("Descripcion: "+post.getDescripcionPost());
			System.out.println("cantidad de likes: "+mapaPostsRedSocial.get(post).size());
		}
		
			
		
		RedSocial redsocial = new RedSocial(usuariosRedSocial, postsRedSocial, mapaPostsRedSocial,mapaLikesUsuarios);
		
		redsocial.saveFileAll(redsocial);
		
		RedSocial redSocialFichero = redsocial.readandLoadFileAll("dataRedSocial(copia1).txt");
		
		
		
		
		
		
	
		
		
		

	}

}
