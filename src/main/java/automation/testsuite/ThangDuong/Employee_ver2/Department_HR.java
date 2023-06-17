
public class Department_HR extends Employee {
	public String departmentHR;

	public String getDepartmentHR() {
		return departmentHR;
	}

	public void setDepartmentHR(String departmentHR) {
		this.departmentHR = departmentHR;
	}

	@Override
	public double tinhLuong() {
		return (this.salary + (0.1) * (this.salary));
	}

	@Override
	public String toString() {
		return super.toString() + ", Department: HR" + ", All Salary: " + tinhLuong();
	}
}
