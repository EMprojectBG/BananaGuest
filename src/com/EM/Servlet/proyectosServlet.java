package com.EM.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.EM.modelo.Proyecto;
import com.EM.modelo.Tarea;


@WebServlet("/proyectosServlet")
public class proyectosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession misession = (HttpSession) request.getSession();

		if (misession.getAttribute("idUsuario") != null) {

			//if(email==ricardo@l.es) {
				// Tareas:
				Tarea[] listaTareasA = { new Tarea("TareaA", "Brainstorm", "Pepe C."),
						new Tarea("TareaB", "Entrega AI", "Luisa G.") };
				Tarea[] listaTareasB = { new Tarea("TareaA", "Brainstorm", "Luisa G."),
						new Tarea("TareaB", "Entregas", "Pepe C.") };
				Tarea[] listaTareasC = { new Tarea("TareaA", "Entrega AI", "Pepe C."),
						new Tarea("TareaB", "Brainstorm", "Luisa G.") };
				// Proyectos:
				Proyecto[] listaProyectos = {
						new Proyecto("ProyectoRicardoA", 4, "app bancaria", "15/7/2017", true, listaTareasA),
						new Proyecto("ProyectoRicardoB", 2, "game", "15/7/2017", true, listaTareasB),
						new Proyecto("ProyectoRicardoC", 3, "app empresa", "15/7/2017", true, listaTareasC),
						new Proyecto("ProyectoRicardoD", 1, "app empresa", "15/7/2017", false, null),
						new Proyecto("ProyectoRicardoD", 1, "app empresa", "15/7/2017", false, null)
				
					};
			//}
		

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
