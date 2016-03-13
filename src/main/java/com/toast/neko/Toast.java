package com.toast.neko;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/toast")
public class Toast extends HttpServlet {


	public Toast(){
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		this.getServletContext().getRequestDispatcher("/WEB-INF/toast.jsp").forward(req, resp);
	}
	
}
