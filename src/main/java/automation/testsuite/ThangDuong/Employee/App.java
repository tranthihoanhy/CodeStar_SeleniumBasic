import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so luong nhan vien: ");
		int soLuongNhanVien = scanner.nextInt();
		double tongLuong = 0, luongTrungBinh = 0, tongLuongHR = 0, tongLuongMarketing = 0;

		/*
		 * Bài toán: từ thông tin lương của nhân viên (kết quả của bài trên). Tìm kiếm
		 * và in ra nhân viên có mức lương cao hơn mức lương trung bình của phòng ban và
		 * tính tổng chi phí trả lương cho nhân viên biết rằng có thêm khoản thưởng
		 * trung bình hàng tháng = 10% lương.
		 */

		double countDepartment_HR = 0, countDepartment_Marketing = 0;

		Employee emp[] = new Employee[soLuongNhanVien];

		for (int i = 0; i < soLuongNhanVien; i++) {
			System.out.print("\nNhan vien thu " + (i + 1) + ": ");
			System.out.println("Chon bo phan lam viec: 1. HR    2. Marketing");
			int choose = scanner.nextInt();

			if (choose == 1) {
				countDepartment_HR++;
				emp[i] = new Department_HR();
				emp[i].inputData();
				tongLuongHR += emp[i].getSalary();
			} else {
				countDepartment_Marketing++;
				emp[i] = new Department_Marketing();
				emp[i].inputData();
				tongLuongMarketing += emp[i].getSalary();
			}
		}

		System.out.println("\nThong tin nhan vien: ");

		// in ra nhân viên có mức lương cao hơn mức lương trung bình của cac nv trong
		// cty
		for (int i = 0; i < soLuongNhanVien; i++) {
			tongLuong += emp[i].tinhLuong();
			System.out.println(emp[i].toString());
		}

		System.out.println("\nTong chi phi tra luong cua toan bo Cong ty: " + tongLuong);

	}

}
