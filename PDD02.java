import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	// ***********************
		Scanner cin = new Scanner(System.in);
		String[] strings = cin.nextLine().split(" ");
		int n = Integer.parseInt(strings[0]);
		int m = Integer.parseInt(strings[1]);
		strings = cin.nextLine().split(" ");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) 
			arr[i] = Integer.parseInt(strings[i])%m;

	// ***********************
		int dp[] = new int[n];
		int res = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				dp[j] += arr[i];
				if (dp[j]%m == 0) res += 1;
			}
		}

	// ***********************
		System.out.println(res);
	}
}