package com.cts.annotationjdbctemplate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringJDBCApp {
	public static void main(String[] args){
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AnnotConfig.class);
		
		
		EmployeeDAO service = context.getBean(EmployeeDAOImpl.class);
		Employee e=new Employee(102,"Pheobe","Technical",33000);
		
		service.save(e);
		
		System.out.println("Display All");
		List <Employee> elist = service.list();
		
		for(Employee emp: elist)
		{
			System.out.println(emp);
		}
	}

}
