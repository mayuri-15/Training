package com.cognizant.employeemanagementsystem.dao;

import com.cognizant.employeemanagementsystem.bean.EmployeeBean;
public interface EmployeeDAO {
	
	public boolean insertDetails(EmployeeBean bean);
	public boolean getDetails(EmployeeBean bean2);
	
	
}
