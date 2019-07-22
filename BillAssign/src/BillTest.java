import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BillTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ApplicationContext ctx=new AnnotationConfigApplicationContext(BillBeanConfig.class);
          Bill b1=(Bill) ctx.getBean(Bill.class);
          CustomerD cd1=(CustomerD) ctx.getBean(CustomerD.class);
          b1.setBill_no(1);
          b1.setCust_code(121);
          cd1.setCust_name("Gwen");
          PurchaseD pd1=(PurchaseD) ctx.getBean(PurchaseD.class);
          pd1.setItem_code(10);
         pd1.setQuantity(2);
         int q1= pd1.getQuantity();
          pd1.setCost(100);
          int cost1=pd1.getCost();
          pd1.setAmount(q1*cost1);
          int t1=pd1.getAmount();
        System.out.println("Bill No.: "+b1.getBill_no()+ "                     Customer code: "+b1.getCust_code());  
        System.out.println("Customer name: "+cd1.getCust_name());
        System.out.println();
        System.out.println("Item code"+"       Quantity"+"       Cost per quantity"+"       Amount");
        System.out.println(pd1.getItem_code()+"                 "+pd1.getQuantity()+"                  "+pd1.getCost()+"                "+pd1.getAmount());
        pd1.setItem_code(17);
        pd1.setQuantity(4);
        int q2= pd1.getQuantity();
         pd1.setCost(60);
         int cost2=pd1.getCost();
         pd1.setAmount(q2*cost2);
         int t2=pd1.getAmount();
         System.out.println(pd1.getItem_code()+"                 "+pd1.getQuantity()+"                  "+pd1.getCost()+"                "+pd1.getAmount());
         pd1.setItem_code(25);
         pd1.setQuantity(3);
         int q3= pd1.getQuantity();
          pd1.setCost(70);
          int cost3=pd1.getCost();
          pd1.setAmount(q3*cost3);
          int t3=pd1.getAmount();
          System.out.println(pd1.getItem_code()+"                 "+pd1.getQuantity()+"                  "+pd1.getCost()+"                "+pd1.getAmount());
          
          int total=t1+t2+t3;
          System.out.println("Total amount: "+total);
          
        		  }
}







