package java_practice;

public class Employee {
	int roll_no;
	String name;
	Address address;

	public Employee(int roll_no, String name, Address address) {
		this.roll_no = roll_no;
		this.name = name;
		this.address = address;
	}

	public void display() {
		System.out.println(roll_no + " " + name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}

	public static void main(String[] args) {
		Address add1 = new Address("gno", "UP", "IND");
		Address add2 = new Address("Noi", "UPW", "INdia");

		Employee emp1 = new Employee(123, "Nitin", add2);
		Employee emp2 = new Employee(456, "Agrawal", add1);
		
		emp1.display();
		emp2.display();

	}

}
