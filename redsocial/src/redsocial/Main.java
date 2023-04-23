package redsocial;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Date;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		ArrayList<Post> listaPostusuario1 = new ArrayList<>();
		ArrayList<Post> listaPostusuario2 = new ArrayList<>();
		
		TreeMap<Date, Integer> mapaLikesUsuario1 = new TreeMap<>();
		mapaLikesUsuario1.put(new Date(2006,10,06), 2);
		
		TreeMap<Date, Integer> mapaLikesUsuario2 = new TreeMap<>();
		mapaLikesUsuario2.put(new Date(2010,11,11), 6);
		
		
		RedSocial redsocial = new RedSocial();
		Usuario usuario1 = new Usuario("email-1","contraseña",listaPostusuario1,mapaLikesUsuario1);
		Usuario usuario2 = new Usuario("email-2","contraseña",listaPostusuario2,mapaLikesUsuario2);

		Post post1 = new Post(new Date(), "descripcion-1",usuario1);
		Post post2 = new Post(new Date(), "descripcion-1",usuario2);
		Post post3 = new Post(new Date(), "descripcion-1",usuario1);
		Post post4 = new Post(new Date(), "descripcion-1",usuario2);
		Post post5 = new Post(new Date(), "descripcion-1",usuario1);
		
		listaPostusuario1.add(post1);
		listaPostusuario1.add(post2);

		listaPostusuario2.add(post3);
		listaPostusuario2.add(post4);
		listaPostusuario2.add(post5);
		
		
		Like like1 = new Like(new Date(), usuario1, post1);
		Like like2 = new Like(new Date(), usuario2, post2);
		Like like3 = new Like(new Date(), usuario1, post3);
		Like like4 = new Like(new Date(), usuario2, post4);
		

	}

}
