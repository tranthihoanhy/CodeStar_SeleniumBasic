package btvn2;

public class Btvn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 4, 45, 53, 67, 23 };

		int temp;
		int i = 0;
		int a = 0;
		for (; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - 1; j++) {

				if (arr[j] < arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j +1] = temp;

				}
			}
		}
		for (; a < arr.length; a++) {
			System.out.print(arr[a] + " ");
		}
	}

}
