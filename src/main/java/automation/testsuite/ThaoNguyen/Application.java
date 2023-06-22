package automation.testsuite.ThaoNguyen;
import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	     System.out.print("Enter the company's employee number: ");
	     int n = scanner.nextInt();
	     Employee[] Employee = new Employee[n];
	     
	     System.out.println("Enter imformation for employee:");
	        for (int i = 0; i < n; i++) {
	            System.out.println("Enter employee imformation:" + (i + 1));
	            System.out.print("Select rmployee (1 - Development, 2 -KT): ");
	            int choose = scanner.nextInt();
	             
	            if (choose == 1) {
	            	Employee[i] = new Development();
	            } else if (choose == 2) {
	            	Employee[i] = new KT();
	            }
	            Employee[i].inputData();
	            Employee[i].salary();
	        }
	        System.out.println("Thông tin của các nhân viên trong công ty: ");
	        for (int i = 0; i < n; i++) {
	        	System.out.println(Employee[i].print());
	        }
	}

}
