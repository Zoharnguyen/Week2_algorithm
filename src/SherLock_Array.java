import java.util.Scanner;

public class SherLock_Array {
	public static void main(String[] args) {
		int i, n = 0;
		int totalRight = 0, totalLeft=0;
		int k=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Press n: ");
		n = sc.nextInt();
		int[] arr = new int[n];
		for(i=0;i<n;i++) {
			arr[i] = sc.nextInt();
			totalRight = totalRight + arr[i];
		}
		totalRight = totalRight - arr[0];
		for(i=1;i<n;i++) {
			if(totalRight == totalLeft) {
				k++;
			}
			totalRight = totalRight - arr[i];
			totalLeft = totalLeft + arr[i-1];
		}
		if(k!=0) System.out.println("YES");
		else System.out.println("NO");
	}
}
