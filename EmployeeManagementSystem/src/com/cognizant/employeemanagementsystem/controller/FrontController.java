package com.cognizant.employeemanagementsystem.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FrontController
 */
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String action=request.getQueryString();
	System.out.println(action);
	if("registration".equals(action)){
		EmployeeRegistrationController erc=new EmployeeRegistrationController();
		erc.dispatch(request, response);
	}
	else if("login".equals(action))
	{
		LoginController erc1=new LoginController();
		erc1.dispatch(request, response);
	} 
	}

}
