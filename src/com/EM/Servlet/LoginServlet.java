package com.EM.Servlet;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.EM.modelo.Usuario;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// creamos db objetos usuarios
	Usuario ricardo = new Usuario("ricardo@l.es", "ricardo", "Ricardo", false, null);
	Usuario juana = new Usuario("juana@l.es", "juana", "Juana", false, null);
	Usuario luis = new Usuario("luis@l.es", "luis", "Luis", false, null);

	private String email = null;
	private String password = null;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("pagina2.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		email = request.getParameter("email");
		password = request.getParameter("password");
		
		Pattern pat = Pattern.compile("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b");
		Matcher matcher = pat.matcher(email);
		
		if( email.equals(ricardo.getEmail()) && password.equals(ricardo.getPassword()) && matcher.matches() || email.equals(juana.getEmail()) && password.equals(juana.getPassword()) && matcher.matches() || email.equals(luis.getEmail()) && password.equals(luis.getPassword()) && matcher.matches() ){
			HttpSession misession= (HttpSession)request.getSession();
			misession.setAttribute("idUsuario", email);
			
			request.getRequestDispatcher("/pagina_principal").forward(request, response);
		}else{
			request.setAttribute("mierror", "Email y contraseña erroneos");
			doGet(request, response);
		}
		
	}
}
