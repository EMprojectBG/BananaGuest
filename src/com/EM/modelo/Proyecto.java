package com.EM.modelo;


import com.EM.modelo.Tarea;



public class Proyecto {

	//Atributos:
	private String nombreProyecto = "";
	private int idProyecto;
	private String descProyecto = "";
	private String fechaFinProyecto = "";
	private boolean estado;
	private Tarea[] listaDeTareas;

	//Constructor:

	public Proyecto(String nombreProyecto, int idProyecto, String descProyecto, String fechaFinProyecto, boolean estado,
			Tarea[] listaDeTareas) {
		super();
		this.nombreProyecto = nombreProyecto;
		this.idProyecto = idProyecto;
		this.descProyecto = descProyecto;
		this.fechaFinProyecto = fechaFinProyecto;
		this.estado = estado;
		this.listaDeTareas = listaDeTareas;
	}
	//Metodos:
	//	public List <Tarea> mostrarTareas(Tarea unaTarea){
	//	this.listaDeTareas.add(unaTarea);
		//	return this.listaDeTareas;

	public String nombreProyecto() {
		return nombreProyecto;
	}

	public void nombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}

	public int idProyecto() {
		return idProyecto;
	}

	public void idProyecto(int idProyecto) {
		this.idProyecto = idProyecto;
	}

	public String descProyecto() {
		return descProyecto;
	}

	public void descProyecto(String descProyecto) {
		this.descProyecto = descProyecto;
	}

	public String fechaFinProyecto() {
		return fechaFinProyecto;
	}

	public void fechaFinProyecto(String fechaFinProyecto) {
		this.fechaFinProyecto = fechaFinProyecto;
	}

	public boolean estado() {
		return estado;
	}

	public void estado(boolean estado) {
		this.estado = estado;
	}

	public Tarea[] listaDeTareas() {
		return listaDeTareas;
	}

	public void listaDeTareas(Tarea[] listaDeTareas) {
		this.listaDeTareas = listaDeTareas;
	}
		

	}
	
