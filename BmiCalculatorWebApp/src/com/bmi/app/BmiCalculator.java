package com.bmi.app;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BmiCalculator
 */
@WebServlet("/BmiCalculator")
public class BmiCalculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String username = request.getParameter("username");
		Double height = Double.valueOf(request.getParameter("height"));
		Double weight = Double.valueOf(request.getParameter("weight"));
		//07011199006
		request.getRequestDispatcher("login.jsp").forward(request, response);;
		
		Double bmi = weight / (height * height);
		response.getWriter().append("Your BMI value is : "+bmi);
		response.getWriter().append("<h1> Dear "+username+", your BMI value is : "+bmi +"</h1>");
		/*response.getWriter().append("Served at: ").append(request.getContextPath()).append(height).append(weight);*/
	}

}
