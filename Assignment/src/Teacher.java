
public class Teacher {

	
	private String tname;
	private int tid;
	
	public Teacher(){
		super();
	}
	public Teacher(String tname,int tid)
	{
		super();
		this.tname=tname;
		this.tid=tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	
}