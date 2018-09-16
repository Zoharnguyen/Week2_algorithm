import java.util.Scanner;

public class Array_Ds {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press array's length: ");
		int n= 0,i;
		n = sc.nextInt();
		int [] arr = new int[n];
		for(i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(i=n-1;i>0;i--) {
			System.out.print(arr[i] + ", ");
		}
	}
}
