package in.co.decimal.inheritance.pojo;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
//		Student student = new Student();
//		student.setName("Vikas");
//		student.setEmail("vikash.basant@decimal.co.in");
//
//		Person person = new Person();
//		String value = person.toString();
//		System.out.println(value);
//		System.out.println(person);

		Employee employee = new Employee();
		employee.setName("Vikas");
		employee.setEmail("basantvikash360@gmail.com");
		employee.setPhoneNumber("8789782803");
		employee.setEmployerGrade('A');
		employee.setEmployerName("Vikky");
		employee.setTitle("java developer");
		employee.setSalary(new BigDecimal(32600.900));
//		System.out.println(employee.toString());

//		System.out.println(employee.getSalary());

	}
}
