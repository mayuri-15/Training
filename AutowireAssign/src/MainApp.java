
	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class MainApp {
		public static void main(String[] args)
		{
		ApplicationContext context1=new ClassPathXmlApplicationContext("Beans.xml");
	    College c=(College) context1.getBean("cBean");
	    
	    System.out.println("College reg no. : "+c.getReg());
	    System.out.println("College Name : "+c.getName());
	    System.out.println("Student Details : ");
	    System.out.println("Student Name : "+c.getSob().getSname());
	    System.out.println("Student Age : "+c.getSob().getSage());
	    System.out.println("Teacher Details : ");
	    System.out.println("Teacher Name : "+c.getTob().getTname());
	    System.out.println("Teacher id : "+c.getTob().getTid());
	    
	    
		
		}

	}

