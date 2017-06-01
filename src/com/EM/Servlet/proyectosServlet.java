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
			Proyecto proyectoA=null;
			//USUARIO RICARDO:
			if (request.getParameter("nombreProyecto").equals( "ProyectoRicardoA") ) {
			
				Tarea[] listaTareasR= {
						new Tarea("TareaA", "Brainstorm", "Pepe C."),
						new Tarea("TareaB", "Entrega AI", "Luisa G.") };

				 proyectoA = new Proyecto("ProyectoRicardoA", 4, "app bancaria", "15/7/2017", true,
						listaTareasR);
			}
		
			//USUARIO JUANA:
			if(request.getParameter("nombreProyecto").equals("ProyectoJuanaA")){
				Tarea[] listaTareasJ = {
						new Tarea("TareaA", "Brainstorm", "Pepe C."),
						new Tarea("TareaB", "Entrega AI", "Luisa G.") };

				 proyectoA = new Proyecto("ProyectoJuanaA", 4, "app bancaria", "15/7/2017", true,
						listaTareasJ);
			}
	
			//USUARIO LUIS:
			if (request.getParameter("nombreProyecto").equals("ProyectoLuisA")){
				Tarea[] listaTareasL = {
						new Tarea("TareaA", "Brainstorm", "Pepe C."),
						new Tarea("TareaB", "Entrega AI", "Luisa G.") };

				 proyectoA = new Proyecto("ProyectoLuisA", 4, "app bancaria", "15/7/2017", true,
						listaTareasL);
			}
			
			
			

			request.setAttribute("proyectoAmostrar", proyectoA);

			request.getRequestDispatcher("proyectos.jsp").forward(request, response);
		} else {
			misession.invalidate();
			response.sendRedirect("login");
		}
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
