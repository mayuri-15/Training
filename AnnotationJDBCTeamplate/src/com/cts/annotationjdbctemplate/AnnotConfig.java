package com.cts.annotationjdbctemplate;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AnnotConfig {

@Bean
public DataSource dataSource(){
	
	
	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	dataSource.setUrl("jdbc:mysql://localhost:3306/test");
	dataSource.setUsername("root");
	dataSource.setPassword("root");
	return dataSource;
	
}

@Bean
public JdbcTemplate jdbcTemplate(DataSource dataSource){
	JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
	return jdbcTemplate;
	
}

@Bean
public EmployeeDAOImpl employeeDaoImpl(){
	EmployeeDAOImpl edao=new EmployeeDAOImpl();
	return edao;
	
}
}
