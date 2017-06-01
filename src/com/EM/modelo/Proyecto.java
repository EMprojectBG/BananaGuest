package com.EM.modelo;

import com.EM.modelo.Tarea;

public class Proyecto {

	// Atributos:
	private String nombreProyecto = "";
	private int idProyecto;
	private String descProyecto = "";
	private String fechaFinProyecto = "";
	private boolean estado;
	private Tarea[] listaDeTareas;

	// Constructor:

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

	public String getNombreProyecto() {
		return nombreProyecto;
	}

	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}

	public int getIdProyecto() {
		return idProyecto;
	}

	public void setIdProyecto(int idProyecto) {
		this.idProyecto = idProyecto;
	}

	public String getDescProyecto() {
		return descProyecto;
	}

	public void setDescProyecto(String descProyecto) {
		this.descProyecto = descProyecto;
	}

	public String getFechaFinProyecto() {
		return fechaFinProyecto;
	}

	public void setFechaFinProyecto(String fechaFinProyecto) {
		this.fechaFinProyecto = fechaFinProyecto;
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Tarea[] getListaDeTareas() {
		return listaDeTareas;
	}

	public void setListaDeTareas(Tarea[] listaDeTareas) {
		this.listaDeTareas = listaDeTareas;
	}

	// setters and getters
	

}
