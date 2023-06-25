package automation.testsuite.ThaoNguyen;

public class Development extends Employee {
	public int salary;
	@Override
	public void salary() {
		// TODO Auto-generated constructor stub
		salary = super.getBasic_salary() + (super.getBasic_salary()*2)+(super.getOvertime()*((super.getBasic_salary() + (super.getBasic_salary()*2)/22)/8)) ;
	}
	@Override
	public String print() {
		return super.print() + ", Salary: " + this.salary;
	}
	
}
