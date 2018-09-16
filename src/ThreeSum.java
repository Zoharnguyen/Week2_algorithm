import java.util.Arrays;
import java.util.Scanner;

public class ThreeSum {
	public static void main(String[] args) {
		int i, j, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Press array's length");
		n = sc.nextInt();
		int[] arr = new int[n];
		for (i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				if (Arrays.binarySearch(arr, -arr[i] - arr[j]) > 0) {
					System.out.print(arr[i] + ", " + arr[j] + ", " + arr[Arrays.binarySearch(arr, -arr[i] - arr[j])]);
					System.out.println();
				}
			}
		}
	}
}
