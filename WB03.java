import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	// *********************** 
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int arr[][] = new int[n][2];
		for (int i = 0; i < n; i++) {
			arr[i][0] = cin.nextInt();
			arr[i][1] = cin.nextInt();
		}
		Arrays.sort(arr, (a, b) -> b[0]-a[0]);
		Arrays.sort(arr, (a, b) -> b[1]-a[1]);
	// *********************** 
		int res = 0, num_draw = 1;
		for (int i = 0; i < n && num_draw > 0; i++) {
			if (arr[i][1] >= 1) {
				res += arr[i][0];
				num_draw += (arr[i][1]-1);
			} else {
				res += arr[i][0];
				num_draw -= 1;
			}
		}
	// ***********************
		System.out.println(res);
	}
}