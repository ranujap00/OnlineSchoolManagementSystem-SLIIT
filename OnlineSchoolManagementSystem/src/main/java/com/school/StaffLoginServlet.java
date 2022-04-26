package com.school;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StaffLoginServlet
 */
@WebServlet("/StaffLoginServlet")
public class StaffLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String role = null;
		String uname = request.getParameter("username");
		String pass = request.getParameter("password");
		
		try {
			List<Staff> staffDetails = schoolDBUtil.validateStaff(uname, pass);
			request.setAttribute("staffDetails", staffDetails);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher dis = request.getRequestDispatcher("StaffUI.jsp");
		dis.forward(request, response);
		
	}

}
