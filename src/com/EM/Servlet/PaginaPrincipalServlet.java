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
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession misession = (HttpSession) request.getSession();

		if( misession.getAttribute("idUsuario")!=null ){
			Proyecto[] listaProyectos = {
					new Proyecto("ProyectoRicardoA", 4, "app bancaria", "15/7/2017", true, null),
					new Proyecto("ProyectoRicardoB", 2, "game", "15/7/2017", true, null),
					new Proyecto("ProyectoRicardoC", 3, "app empresa", "15/7/2017", true, null),
					new Proyecto("ProyectoRicardoD", 1, "app empresa", "15/7/2017", false, null),
					new Proyecto("ProyectoRicardoD", 1, "app empresa", "15/7/2017", false, null)
			};
			
			request.setAttribute("listaProyectosAmostrar", listaProyectos);
			
			request.getRequestDispatcher("pagina_principal.jsp").forward(request, response);
		}else{
			misession.invalidate();
			response.sendRedirect("login");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
