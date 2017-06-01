package com.EM.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.EM.modelo.Proyecto;

/**
 * Servlet implementation class PaginaPrincipalServlet
 */
@WebServlet("/pagina_principal")
public class PaginaPrincipalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession misession = (HttpSession) request.getSession();

		if (misession.getAttribute("idUsuario") != null) {
			Proyecto[] listaProyectos = null;
			if (misession.getAttribute("idUsuario").equals("ricardo@l.es")) {
				listaProyectos = new Proyecto[] {
						new Proyecto("ProyectoRicardoA", 4, "app bancaria", "15/7/2017", true, null),
						new Proyecto("ProyectoRicardoB", 2, "game", "15/7/2017", true, null),
						new Proyecto("ProyectoRicardoC", 3, "app empresa", "15/7/2017", true, null),
						new Proyecto("ProyectoRicardoD", 1, "app empresa", "15/7/2017", false, null),
						new Proyecto("ProyectoRicardoD", 1, "app empresa", "15/7/2017", false, null) };
			} else if (misession.getAttribute("idUsuario").equals("Juana@l.es")) {
				listaProyectos = new Proyecto[] {
						new Proyecto("ProyectoJuanaA", 4, "app bancaria", "15/7/2017", true, null),
						new Proyecto("ProyectoJuanaB", 2, "game", "15/7/2017", true, null),
						new Proyecto("ProyectoJuanaC", 3, "app empresa", "15/7/2017", true, null),
						new Proyecto("ProyectoJuanaD", 1, "app empresa", "15/7/2017", false, null),
						new Proyecto("ProyectoJuanaD", 1, "app empresa", "15/7/2017", false, null) };

			} else if (misession.getAttribute("idUsuario").equals("Luis@l.es")) {
				listaProyectos = new Proyecto[] {
						new Proyecto("ProyectoLuisA", 4, "app bancaria", "15/7/2017", true, null),
						new Proyecto("ProyectoLuisB", 2, "game", "15/7/2017", true, null),
						new Proyecto("ProyectoLuisC", 3, "app empresa", "15/7/2017", true, null),
						new Proyecto("ProyectoLuisD", 1, "app empresa", "15/7/2017", false, null),
						new Proyecto("ProyectoLuisD", 1, "app empresa", "15/7/2017", false, null) };

			}
			
			System.out.println("listaProyectos:"+listaProyectos);

			request.setAttribute("listaProyectosAmostrar", listaProyectos);
			request.getRequestDispatcher("paginaprincipal.jsp").forward(request, response);
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
