import java.util.Scanner;

public class Employee {
	private String name;
	private int age;
	private String ID;
	private String email;
	private String phone;
	protected double salary;

	Scanner sc = new Scanner(System.in);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return "Name: " + name + ", Age: " + age + ", ID: " + ID + ", Email: " + email + ", Phone: " + phone
				+ ", Salary: " + salary;
	}

	public void inputData() {
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Age: ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.print("ID: ");
		ID = sc.nextLine();
		System.out.print("Email: ");
		email = sc.nextLine();
		System.out.print("Phone: ");
		phone = sc.nextLine();
		System.out.print("Salary: ");
		salary = sc.nextDouble();
		setSalary(salary);
		sc.nextLine();
	}
	
	public double tinhLuong() {
		return 0;
	}
}
