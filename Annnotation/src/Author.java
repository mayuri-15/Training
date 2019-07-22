import org.springframework.beans.factory.annotation.Value;

public class Author {

	@Value("fin")
	private String aname;
	@Value("43")
	private int age;
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Author(){
		super();
	}
	public Author(String aname, int age) {
		super();
		this.aname = aname;
		this.age = age;
	}
	
	
}
