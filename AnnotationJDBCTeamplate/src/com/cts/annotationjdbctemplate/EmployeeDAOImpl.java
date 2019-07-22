package com.cts.annotationjdbctemplate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
@Qualifier("EmployeeDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	JdbcTemplate jdt;
	
	public EmployeeDAOImpl(){
		super();
	}

	public EmployeeDAOImpl(JdbcTemplate jdt) {
		super();
		this.jdt = jdt;
	}

	@Override
	public void save(Employee e) {
     jdt.update("insert into Employee1 values(?,?,?,?)",e.getEcode(),e.getEname(),e.getDept(),e.getSalary());
     System.out.println("Person Added");

	}

	@Override
	public List<Employee> list() {
		List <Employee> elist=jdt.query("select * from Employee1", new BeanPropertyRowMapper<Employee>(Employee.class));
		return elist;
	}

}
