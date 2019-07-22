package com.cognizant.employeemanagementsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cognizant.employeemanagementsystem.bean.EmployeeBean;
import com.cognizant.employeemanagementsystem.bean.LoginBean;
import com.cognizant.employeemanagementsystem.util.DBUtils;



public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public boolean insertDetails(EmployeeBean bean) {
		Connection con2=null;
		PreparedStatement ps2=null;
		
		try{
			con2=DBUtils.getConnection();
			String query2="insert into employee(empid,fname,lname,designation,password) values(?,?,?,?,?)";
			ps2=con2.prepareStatement(query2);
		     ps2.setString(1, bean.getEmpid());
		     ps2.setString(2, bean.getFname());
		     ps2.setString(3, bean.getLname());
		     ps2.setString(4,  bean.getDesignation());
		     ps2.setString(5, bean.getPassword());
		    ps2.executeUpdate();
		     con2.commit();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally{
			DBUtils.closeConnection(con2);
		}
		return true;
	}

	
	@Override
	public boolean getDetails(EmployeeBean bean2) {
		Connection con3= null;
		
        
        try{
        PreparedStatement ps3 = null;
        	
        ResultSet resultSet1 = null;
        String query4 = "select * from employee where empid=? and fname=? and lname=? and designation=? and password=?";
		con3=DBUtils.getConnection();
		ps3 = con3.prepareStatement(query4);
		ps3.setString(1, bean2.getEmpid());
	    ps3.setString(2, bean2.getFname());
	    ps3.setString(3, bean2.getLname());
	    ps3.setString(4, bean2.getDesignation());
	    ps3.setString(5, bean2.getPassword());
        resultSet1 = ps3.executeQuery();
		 if(resultSet1.next())
		 {
			 return true;
		 }
		 else
			 return false;
        }
        catch(SQLException e2)
        {
        	e2.printStackTrace();
        }
        finally{
			 DBUtils.closeConnection(con3);
		}
		
		return false;

	}

}
