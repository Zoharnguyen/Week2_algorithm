import java.util.Scanner;

public class Array_2D_Ds {
	public static int totalHourGlass(int [][] a, int i, int j) {
		int total = 0;
		total = a[i][j] + a[i][j+1] + a[i][j+2] + a[i+1][j+1] + a[i+2][j] + a[i+2][j+1] + a[i+2][j+2];
		return total;
	}
	public static void main(String[] args) {
		int n=0,i,j;
		int max=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Press n:");
		n = sc.nextInt();
		int [][] arr = new int [n][n];
		for (i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
				}
			}
		for (i=0;i<n-2;i++) {
			for(j=0;j<n-2;j++) {
				if(max < totalHourGlass(arr,i,j)) {
					max = totalHourGlass(arr,i,j);
				}
			}
		}
		System.out.println("Total of HourGlass max is: " + max);
	}
}
