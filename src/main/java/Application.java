import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kuhn.entity.Customer;
import com.kuhn.enums.CustomerType;
import com.kuhn.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService customerService = appContext.getBean(CustomerService.class);
		
		for (Customer cust : customerService.getAll()) {
			System.out.println(String.format("%s, %s", cust.getName(), cust.getEmail()));
		}
		
		double valeurAvecRabais = customerService.calculerRabais(CustomerType.PLATINUM, 100);
		System.out.printf("%.2f après rabais = %.2f", 100f, valeurAvecRabais);
	}

}
