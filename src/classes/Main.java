package classes;

import classes.business.CreditManager;
import classes.business.CustomerManager;
import classes.business.MilitaryCreditManager;
import classes.business.TeacherCreditManager;
import classes.entities.Company;
import classes.entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		CreditManager creditManager = new CreditManager();
		creditManager.Calculate();
		creditManager.Calculate();
		creditManager.Save();
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setCity("Ankara");
		
		CustomerManager customerManager = new CustomerManager(customer, new TeacherCreditManager());
		customerManager.Save();
		customerManager.Delete();
		customerManager.GiveCredit();
		
		Company company =new Company();
		company.setCompanyName("Şirket");
		company.setTaxNumber("12345");
		company.setId(100);
		
		
	}

}
