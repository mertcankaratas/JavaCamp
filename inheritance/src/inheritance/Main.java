package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.customerNumber="12345";
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.customerNumber="78910";
		
		SyndicateCustomer syndicateCustomer = new SyndicateCustomer();
		syndicateCustomer.customerNumber="25801";
		
		CustomerManager customerManager = new CustomerManager();
		//customerManager.add(corporateCustomer);
		//customerManager.add(individualCustomer);
		
		Customer[] customers= {individualCustomer,corporateCustomer,syndicateCustomer};
		
		customerManager.addMultiple(customers);
	}

}
