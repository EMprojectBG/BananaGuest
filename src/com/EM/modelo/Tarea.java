package com.EM.modelo;

public class Tarea {



	//Atributos:
	private String nombreTarea;
	private String descTarea;
	private String responsable;
	
	//Consructor:
	public Tarea(String nombreTarea, String descTarea, String responsable) {
		super();
		this.nombreTarea = nombreTarea;
		this.descTarea = descTarea;
		this.responsable = responsable;
	}
	//Setters and Getters
	public String getNombreTarea() {
		return nombreTarea;
	}

	public void setNombreTarea(String nombreTarea) {
		this.nombreTarea = nombreTarea;
	}

	public String getDescTarea() {
		return descTarea;
	}

	public void setDescTarea(String descTarea) {
		this.descTarea = descTarea;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
}
