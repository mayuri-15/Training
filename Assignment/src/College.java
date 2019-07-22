 
public class College {
	
	private int reg;
	private String name;
	private Student sob;
	private Teacher tob;
	
	public College(){
		super();
	}
	public College(int reg, String name,Student sob,Teacher tob)
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
	public Student getSob() {
		return sob;
	}
	public void setSob(Student sob) {
		this.sob = sob;
	}
	public Teacher getTob() {
		return tob;
	}
	public void setTob(Teacher tob) {
		this.tob = tob;
	}
	
	

}
