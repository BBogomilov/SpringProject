import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.bogi.service.CustomerService;
import com.bogi.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.bogi"})
public class AppConfig {

	@Bean(name = "customerService")
	@Scope("singleton")
	public CustomerService getCustomerService() {
		
		CustomerServiceImpl customerService = new CustomerServiceImpl();
	//	customerService.setCustomerRepository(getCustomerRepository());
		
		return customerService;
	}

//	@Bean(name = "customerRepository")
//	public CustomerRepository getCustomerRepository() {
//		return new HibernateCustomerRepositoryImpl();
//	}
}
