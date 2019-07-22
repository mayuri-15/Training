import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Bill {

	private int bill_no;
	private int cust_code;
	@Autowired
	private List<PurchaseD> pd;
	@Autowired
	private CustomerD cd;
	
	public CustomerD getCd() {
		return cd;
	}
	public void setCd(CustomerD cd) {
		this.cd = cd;
	}
	public int getBill_no() {
		return bill_no;
	}
	public void setBill_no(int bill_no) {
		this.bill_no = bill_no;
	}
	public int getCust_code() {
		return cust_code;
	}
	public void setCust_code(int cust_code) {
		this.cust_code = cust_code;
	}
	public List<PurchaseD> getPd() {
		return pd;
	}
 
	public void setPd(List<PurchaseD> pd) {
		this.pd = pd;
	}
	public Bill(){
		super();
	}
	
	public Bill(int bill_no, int cust_code, List<PurchaseD> pd, CustomerD cd) {
		super();
		this.bill_no = bill_no;
		this.cust_code = cust_code;
		this.pd = pd;
		this.cd = cd;
	}
	

}
