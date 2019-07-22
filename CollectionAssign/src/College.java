 import java.util.*;
public class College {
	
	private int reg;
	private String name;
	private List<Student> sob;
	private Set<Teacher> tob;
	
	public College(){
		super();
	}
	public College(int reg, String name,List<Student> sob,Set<Teacher> tob)
	{
		super();
		this.reg=reg;
		this.name=name;
		this.sob=sob;
		this.tob=tob;
	}
	public int getReg() {
		return reg;
	}
	public void setReg(int reg) {
		this.reg = reg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List <Student> getSob() {
		return sob;
	}
	public void setSob(List<Student> sob) {
		this.sob = sob;
	}
	public  Set <Teacher> getTob() {
		return tob;
	}
	public void setTob( Set <Teacher> tob) {
		this.tob = tob;
	}
	
	

}
