package in.co.decimal.classObject.pojo;

public class CustomerRunner {
	public static void main(String[] args) {
		Customer customer = new Customer("Vikash", new Address("bhagwatpur", "Samastipur", "818127"));
		System.out.println(customer);

		Address workdAddress = new Address("Grugaon", "hariyana", "110023");
		customer.setWorkAddress(workdAddress);
		System.out.println(customer);
	}
}
