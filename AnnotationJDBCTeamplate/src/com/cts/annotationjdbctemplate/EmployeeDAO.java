package com.cts.annotationjdbctemplate;

import java.util.List;

public interface EmployeeDAO {
 
	public void save(Employee e);
	
	public List<Employee> list();
}
