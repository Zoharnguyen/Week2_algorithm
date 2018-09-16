import java.util.Arrays;
import java.util.Scanner;

public class Paris {
	public static void main(String[] args) {
		int n = 0, i,h=0 , j = 1, k, defference=0, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Press k: ");
		k = sc.nextInt();
		System.out.println("Press n: ");
		n = sc.nextInt();
		int[] arr = new int[n];
		for (i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		i = 0;     
		while (j < n) {
			defference = arr[j] - arr[h];
			if (defference == k) {
				count++;
				j++;
			} else if (defference > k) {
				h++;
			} else {
				j++;
			}
		}
		System.out.println("Total defference 2 number in array == k is: " + count);
	}
}
