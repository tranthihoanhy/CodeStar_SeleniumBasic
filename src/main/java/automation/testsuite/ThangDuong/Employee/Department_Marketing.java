
public class Department_Marketing extends Employee {
	private String departmentMarketing;

	public String getDepartmentMarketing() {
		return departmentMarketing;
	}

	public void setDepartmentMarketing(String departmentMarketing) {
		this.departmentMarketing = departmentMarketing;
	}

	@Override
	public double tinhLuong() {
		return (this.salary + (0.1) * (this.salary));
	}

	@Override
	public String toString() {
		return super.toString() + ", Department: Marketing" + ", All Salary: " + tinhLuong();
	}
}
