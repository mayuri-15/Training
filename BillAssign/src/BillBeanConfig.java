import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class BillBeanConfig {
	@Bean
	@Scope("prototype")
	public Bill getBillBean(){
		return new Bill();
	}
	@Bean
	@Scope("prototype")
	public PurchaseD getPurchaseD(){
		return new PurchaseD();
	}
	@Bean
	@Scope("prototype")
	public CustomerD getCustomerD(){
		return new CustomerD();
	}
	

}
