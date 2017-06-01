package com.EM.modelo;

public class Usuario {
	private String email = "";
	private String password = "";
	private String nombreUsuario = "";
	private boolean validUsuario = true;
	private Proyecto[] listaDeProyectos;

	public Usuario(String email, String password, String nombreUsuario, boolean validUsuario,  Proyecto[] listaDeProyectos) {
		this.email = email;
		this.password = password;
		this.nombreUsuario = nombreUsuario;
		this.validUsuario = validUsuario;
		this.listaDeProyectos = listaDeProyectos;
		
	}
	/*public List <Proyecto> mostrarProyectos(Proyecto unProyecto){
		this.listaDeProyectos.add(unProyecto);
		return this.listaDeProyectos;
	}*/

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public boolean isValidUsuario() {
		return validUsuario;
	}

	public void setValidUsuario(boolean validUsuario) {
		this.validUsuario = validUsuario;
	}

	public Proyecto[] getListaDeProyectos() {
		return listaDeProyectos;
	}

	public void setListaDeProyectos(Proyecto[] listaDeProyectos) {
		this.listaDeProyectos = listaDeProyectos;
	}

}
