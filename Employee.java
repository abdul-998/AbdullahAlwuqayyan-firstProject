package company2;

public class Employee {
	
	private String firstName;
	private String lastName;
	private double salary;
	private int id;
	
	public String getFirstName() {
		return firstName;
	}
	public void setfirstname(String fn) {
		firstName = fn;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	public void setlastname(String ln) {
		lastName = ln;
	}
	
	
	public double getSalary() {
		return salary;
	}
	public void setsalary (double sal) {
		salary = sal;
	}
	
	
	public int getId() {
		return id;
	}
	public void setid(int II) {
		id = II;
	}

    public void printingo() {
		System.out.println("first name is : " + firstName);
		System.out.println("last name is : " + ln);
		System.out.println("salary is : " + sal);
		System.out.println("id is : " + II);
    }
}
