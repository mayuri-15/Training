

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args)
	{
	ApplicationContext context1=new ClassPathXmlApplicationContext("Beans.xml");
    Product np=(Product) context1.getBean("proBean");
    
    System.out.println("Product code : "+np.getPcode());
    System.out.println("Name : "+np.getPname());
    System.out.println("Supplier Details : ");
    System.out.println("Supplier Name : "+np.getSob().getSname());
    System.out.println("Mobile : "+np.getSob().getMobile());
    System.out.println("Supplier Address : "+np.getSob().getSadd());
    
    
	
	}

}