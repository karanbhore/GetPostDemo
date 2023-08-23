package com.prowings;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mylogin")
public class Login extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String myemail = (String)req.getParameter("name1");
		String password =(String) req.getParameter("pass1");

		if (myemail.equals("karan@gmail.com") && password.equals("123")) {
			System.out.println("successfully logged in....");
		} else {
			System.out.println("failed to login.....");
		
		}

	}
}
