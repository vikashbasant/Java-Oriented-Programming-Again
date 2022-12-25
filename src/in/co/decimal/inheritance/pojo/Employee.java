package in.co.decimal.inheritance.pojo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Employee extends Person {
	private String title;
	private String employerName;
	private char employerGrade;
	private BigDecimal salary;

	public Employee() {
		// default constructor:
		System.out.println("employee constructor");
	}

	public Employee(String title, String employerName, char employerGrade, BigDecimal salary) {
		this.title = title;
		this.employerName = employerName;
		this.employerGrade = employerGrade;
		this.salary = salary.setScale(3, RoundingMode.UP);
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the employerName
	 */
	public String getEmployerName() {
		return employerName;
	}

	/**
	 * @param employerName the employerName to set
	 */
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	/**
	 * @return the employerGrade
	 */
	public char getEmployerGrade() {
		return employerGrade;
	}

	/**
	 * @param employerGrade the employerGrade to set
	 */
	public void setEmployerGrade(char employerGrade) {
		this.employerGrade = employerGrade;
	}

	/**
	 * @return the salary
	 */
	public BigDecimal getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(BigDecimal salary) {
		this.salary = salary.setScale(3, RoundingMode.UP);
	}

	@Override
	public String toString() {
		return super.toString() + "Employee [title=" + title + ", employerName=" + employerName + ", employerGrade="
				+ employerGrade + ", salary=" + salary + "]";
	}

}
