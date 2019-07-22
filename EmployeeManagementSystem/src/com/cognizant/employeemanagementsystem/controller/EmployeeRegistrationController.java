package com.cognizant.employeemanagementsystem.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cognizant.employeemanagementsystem.bean.EmployeeBean;
import com.cognizant.employeemanagementsystem.bean.LoginBean;
import com.cognizant.employeemanagementsystem.service.EmployeeService;
import com.cognizant.employeemanagementsystem.service.EmployeeServiceImpl;
import com.cognizant.employeemanagementsystem.service.LoginService;
import com.cognizant.employeemanagementsystem.service.LoginServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class EmployeeRegistrationController {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeRegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void dispatch(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userId = request.getParameter("empid");
        String firstName= request.getParameter("fname");
        String lastName= request.getParameter("lname");
        String designation1=request.getParameter("designation");
        String Password=request.getParameter("password");
        EmployeeBean bean= new EmployeeBean();
        bean.setEmpid(userId);
        bean.setFname(firstName);
        bean.setLname(lastName);
        bean.setDesignation(designation1);
        bean.setPassword(Password);

       EmployeeService employeeService=new EmployeeServiceImpl();
        if(employeeService.insertDetails(bean))
        {
        	System.out.println("Record Inserted");
        }
        else
        {
        	System.out.println("Error");
        }
	 if(employeeService.getDetails(bean)) {
         System.out.println(bean);
         }
         else 
         
        	 System.out.println("Failed");	
	}
}

