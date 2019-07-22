import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.*;

public class Book {
    @Value("1234")
	private int bcode;
    @Value("Lord of the rings")
	private String bname;
    @Value("256.78")
	private double price;
 
	private Author aut;
	 
	public Author getAut() {
		return aut;
	}  
	@Autowired
	public void setAut(Author aut) {
		this.aut = aut;
	}
	public Book(){
		super();
	}
	
	public Book(int bcode, String bname, double price) {
		super();
		this.bcode = bcode;
		this.bname = bname;
		this.price = price;
	}
	public int getBcode() {
		return bcode;
	}
	public void setBcode(int bcode) {
		this.bcode = bcode;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@PostConstruct
	public void init(){
		System.out.println("Initialising");
	}
	@PreDestroy
	public void destroy(){
		System.out.println("Destroying");
	}
	
	
}
