import java.util.Arrays;
import java.util.Scanner;

public class Closet_Number_Solution2 {
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
		Arrays.sort(arr);
		for (i = 0; i < n-1; i++) {
			if (min >= Math.abs(arr[i + 1] - arr[i])) {
				min = Math.abs(arr[i + 1] - arr[i]);
				arrCouple[k] = arr[i];
				arrCouple[k + 1] = arr[i + 1];
				k = k + 2;
			}
		}
		for (int j = 0; j < k; j++) {
			System.out.print(arrCouple[j] + " ");
			if (j % 2 != 0) {
				System.out.println();
			}
		}
	}
}
