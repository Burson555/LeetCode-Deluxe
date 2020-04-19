import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		final int MOD = 1_000_000_007;
		Scanner cin = new Scanner(System.in);
		String[] nk = cin.nextLine().split(" ");
		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);
		String[] temp = cin.nextLine().split(" ");
		int dp[] = new int[n];
		for (int i = 0; i < n; i++) {
			dp[i] = Integer.parseInt(temp[i]);
		} // result of sum[0][n]
		int res = 0;
		for (int i = 1; i <= k; i++) {
			for (int j = 1; j < n; j++) {
				dp[j] = (dp[j-1]+dp[j]) % MOD;
			}
		}
		System.out.println(dp[n-1]);
	}
}