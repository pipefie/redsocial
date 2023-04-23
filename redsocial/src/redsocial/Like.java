package redsocial;

import java.util.Date;

public class Like {
	private Date fechaLike;
	private Usuario usuario;
	private Post postLike;
	public Date getFechaLike() {
		return fechaLike;
	}
	public void setFechaLike(Date fechaLike) {
		this.fechaLike = fechaLike;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Post getPostLike() {
		return postLike;
	}
	public void setPostLike(Post postLike) {
		this.postLike = postLike;
	}
	@Override
	public String toString() {
		return "Like [fechaLike=" + fechaLike + ", usuario=" + usuario + ", postLike=" + postLike + "]";
	}
	public Like() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Like(Date fechaLike, Usuario usuario, Post postLike) {
		super();
		this.fechaLike = fechaLike;
		this.usuario = usuario;
		this.postLike = postLike;
	}
	
	

}
