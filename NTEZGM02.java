import java.io.*;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	// *********************** 
		Scanner cin = new Scanner(System.in);
		int n = Integer.parseInt(cin.nextLine());
		int worker[] = new int[n];
		int tasks[] = new int[n];
		String s1[] = cin.nextLine().split(" ");
		String s2[] = cin.nextLine().split(" ");
		for (int i = 0; i < n; i++) {
			worker[i] = Integer.parseInt(s1[i]);
			tasks[i] = Integer.parseInt(s2[i]);
		}
		int m = Integer.parseInt(cin.nextLine());
		Arrays.sort(tasks);
		Arrays.sort(worker);

	// ***********************
		long res = 1;
		int count = 0, j = 1;
		for (int i = 0; i < n; i++) {
			while (j < n && worker[i] >= tasks[j]) j++;
			res *= (j-count);
			res %= m; count += 1;
		}
		System.out.println(res);
	}
}