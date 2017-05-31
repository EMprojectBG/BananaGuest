package com.EM.modelo;

public class Usuario {
	private String email = "";
	private String password = "";
	private String nombreUsuario = "";
	private Proyecto[] listaDeProyectos;

	public Usuario(String email, String password, String nombreUsuario,  Proyecto[] listaDeProyectos) {
		this.email = email;
		this.password=password;
		this.nombreUsuario = nombreUsuario;
		this.listaDeProyectos = listaDeProyectos;
		
	}
	/*public List <Proyecto> mostrarProyectos(Proyecto unProyecto){
		this.listaDeProyectos.add(unProyecto);
		return this.listaDeProyectos;
	}*/
}
