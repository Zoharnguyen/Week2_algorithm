import java.util.Scanner;

public class Closet_Number {
	public static void main(String[] args) {
		int n = 0, i, k = 0, min;
		Scanner sc = new Scanner(System.in);
		System.out.println("Press n: ");
		n = sc.nextInt();
		int[] arr = new int[n];
		int[] arrCouple = new int[n];
		for (i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		min = Math.abs(arr[1] - arr[0]);
		for (i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (min >= Math.abs(arr[i] - arr[j])) {
					min = Math.abs(arr[i] - arr[j]);
					arrCouple[k] = arr[i];
					arrCouple[k + 1] = arr[j];
					k = k+2 ;
				}
			}
		}
		for (int j=0; j < k; j++) {
			System.out.print(arrCouple[j] + " ");
			if (j % 2 != 0) {
				System.out.println();
			}
		}
	}
}
