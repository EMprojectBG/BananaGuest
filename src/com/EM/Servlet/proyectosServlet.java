package com.EM.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.EM.modelo.Proyecto;

@WebServlet("/proyectosServlet")
public class proyectosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession misession= (HttpSession) request.getSession();
		
			if(misession.getAttribute("idUsuario")!=null){	
				switch () {
				
				case email=="ricardo@l.es":
					
					Proyecto[] listaProyectos1={
							new Proyecto = ("ProyectoRicardoA", 1, "app bancaria", "15/7/2017", true, ),
							new Proyecto = ("ProyectoRicardoB", 2, "game", "15/7/2017", true, ),
							new Proyecto = ("ProyectoRicardoC", 3, "app empresa", "15/7/2017", true, ),
							new Proyecto = ("ProyectoRicardoD", 4, "app bancaria", "15/7/2017", true, )			
					};
						
					break;
				case email=="juana@l.es":
					Proyecto[] listaProyectos2={
							new Proyecto = ("ProyectoJuanaA", 1, "app empresa", "15/7/2017", true, ),
							new Proyecto = ("ProyectoJuanaB", 2, "app empresa", "15/7/2017", true, ),
							new Proyecto = ("ProyectoJuanaC", 3, "app bancaria", "15/7/2017", true, ),
							new Proyecto = ("ProyectoJuanaD", 4, "app empresa", "15/7/2017", true, )			
					};
						
					break;
				case email=="luis@l.es":
					Proyecto[] listaProyectos3={
							new Proyecto = ("ProyectoLuisA", 1, "app empresa", "15/7/2017", true, ),
							new Proyecto = ("ProyectoLuisB", 1, "game", "15/7/2017", true, ),
							new Proyecto = ("ProyectoLuisC", 1, "app bancaria", "15/7/2017", true, ),
							new Proyecto = ("ProyectoLuisD", 1, "app empresa", "15/7/2017", true, )			
					};
						
					break;

				default:
					break;
				}
			
			}
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
