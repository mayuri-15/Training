import org.springframework.beans.factory.annotation.Value;

public class CustomerD {
	@Value("Cody")
	private String cust_name;
public CustomerD()
{
   super();
}
	public CustomerD(String cust_name) {
		super();
		this.cust_name = cust_name;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	

}
