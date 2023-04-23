package redsocial;

import java.util.Date;


public class Post {
	private Date fechaPublicacion;
	private String descripcionPost;
	private Usuario usuario;
	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}
	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	public String getDescripcionPost() {
		return descripcionPost;
	}
	public void setDescripcionPost(String descripcionPost) {
		this.descripcionPost = descripcionPost;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	@Override
	public String toString() {
		return "Post [fechaPublicacion=" + fechaPublicacion + ", descripcionPost=" + descripcionPost + ", usuario="
				+ usuario + "]";
	}
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Post(Date fechaPublicacion, String descripcionPost, Usuario usuario) {
		super();
		this.fechaPublicacion = fechaPublicacion;
		this.descripcionPost = descripcionPost;
		this.usuario = usuario;
	}
	

}
