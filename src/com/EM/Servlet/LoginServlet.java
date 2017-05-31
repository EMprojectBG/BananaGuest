package com.EM.Servlet;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession misession = (HttpSession) request.getSession();

		if (misession.getAttribute("idUsuario") != null) {
			request.getRequestDispatcher("/pagina_principal").forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("pagina2.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String contrasena = request.getParameter("password");

		Pattern pat = Pattern.compile("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b");
		Matcher matcher = pat.matcher(email);

		if (email.equals("ricardo@l.es") && contrasena.equals("ricardo") && matcher.matches() || email.equals("juana@l.es") && contrasena.equals("juana") && matcher.matches() || email.equals("luis@l.es") && contrasena.equals("luis") && matcher.matches()) {
			request.getRequestDispatcher("/pagina_principal").forward(request, response);
		} else {
			request.setAttribute("mierror", "Email y contraseña erroneos");
			doGet(request, response);

		}

	}
}
