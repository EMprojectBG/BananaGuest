package com.EM.modelo;

import java.util.ArrayList;
import java.util.List;


public class Proyecto {

	//Atributos:
	private String nombreProyecto = "";
	private int idProyecto;
	private String descProyecto = "";
	private String fechaFinProyecto = "";
	private boolean estado;
	private List<Tarea> listaDeTareas;

	//Constructor:
	public Proyecto(String nombreProyecto, int idProyecto, String descProyecto, String fechaFinProyecto, boolean estado,
			List<Tarea> listaDeTareas) {
		super();
		this.nombreProyecto = nombreProyecto;
		this.idProyecto = idProyecto;
		this.descProyecto = descProyecto;
		this.fechaFinProyecto = fechaFinProyecto;
		this.estado = estado;
		this.listaDeTareas = new ArrayList<Tarea>();
		
	//Metodos:
		public List <Tarea> mostrarTareas(Tarea unaTarea){
			this.listaDeTareas.add(unaTarea);
			return this.listaDeTareas;
		}
	}
	
}
