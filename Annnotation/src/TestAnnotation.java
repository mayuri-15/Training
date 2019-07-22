import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ApplicationContext ctx=new AnnotationConfigApplicationContext(BookBeanConfig.class);
          Book b=(Book) ctx.getBean(Book.class);
          Book b1=(Book) ctx.getBean(Book.class);
          //Author a=(Author) ctx.getBean(Author.class);
          System.out.println("Book code: " +b.getBcode());
          System.out.println("Book Name: "  +b.getBname());
          System.out.println("Book Price: " +b.getPrice());
          b1.setBcode(167);
          b1.setBname("Greg");
          b1.setPrice(247.78);
          System.out.println("Book code: " +b1.getBcode());
          System.out.println("Book Name: "  +b1.getBname());
          System.out.println("Book Price: " +b1.getPrice());
          System.out.println("Author Name: " +b.getAut().getAname());
          System.out.println("Author's age: "  +b.getAut().getAge());
	}

}
