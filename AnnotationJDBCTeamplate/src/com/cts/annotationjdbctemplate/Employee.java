package com.cts.annotationjdbctemplate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Employee1")
public class Employee{
	
	@Column(name="ecode")
	private int ecode;
	@Column(name="ename")
	private String ename;
	@Column(name="dept")
	private String dept;
	@Column(name="salary")
	private int salary;
	public int getEcode() {
		return ecode;
	}
	public void setEcode(int ecode) {
		this.ecode = ecode;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Employee(){
		super();
	}
	public Employee(int ecode, String ename, String dept, int salary) {
		super();
		this.ecode = ecode;
		this.ename = ename;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [ecode=" + ecode + ", ename=" + ename + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	
	
}