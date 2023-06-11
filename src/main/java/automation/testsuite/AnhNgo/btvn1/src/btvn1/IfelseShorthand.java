package btvn1;

import java.util.Scanner;

public class IfelseShorthand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Boolean isEven;
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("Nhập vào số bất kỳ : ");
// int number = scanner.nextInt();
// if (number %2 == 0) {
//	 isEven = true;
		// }else {
		// isEven = false;
		// }
// System.out.println(isEven);
// isEven = (number %2==0)?true:false;
		// System.out.println(isEven);

		// for (int i = 0; i <= 100; i++)
		// if (i % 5 == 0) {

		// System.out.println(i);
		int[] arr = { 12, 4, 45, 53, 67, 23 };

		int temp;
		int i=0;
		int a=0;
		for (;i < arr.length - 1; i++) {
			System.out.println("Lan lap thu " + i + " cua toan bo mang ban dau :");
			for (int j = 0; j < arr.length  - 1; j++) {
				System.out.println("Lan lap thu " + j + " de so sanh hai so lien tiep: " + arr[j] + " va " + arr[j + 1]);

				if (arr[j] < arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
		for ( ;a < arr.length; a++) {
			System.out.print(arr[a] + " ");
		}
	}
}
