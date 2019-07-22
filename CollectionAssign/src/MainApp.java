import java.util.*;
	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class MainApp {
		public static void main(String[] args)
		{
		ApplicationContext context1=new ClassPathXmlApplicationContext("Beans.xml");
	    College c=(College) context1.getBean("cBean");
	    
	    System.out.println("College reg no. : "+c.getReg());
	    System.out.println("College Name : "+c.getName());
        List <Student> slist=c.getSob();
        System.out.println("Student Details :");
        for(Student s:slist)
        {
        	 System.out.println("Student Name: " +s.getSname());
        	 System.out.println("Student age: "+s.getSage());
        }
	   Set <Teacher> tlist=c.getTob();
	   System.out.println("Teacher Details :");
       for(Teacher t:tlist)
       {
       	 System.out.println("Teacher Name: " +t.getTname());
       	 System.out.println("Teacher id: "+t.getTid());
       }
	   
	    
		
		}

	}

