import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	// ***********************
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		long arr[] = new long[n];
		for (int i = 0; i < n; i++) arr[i] =  cin.nextLong();
		long count = 0;
		while (true) {
			int k = 0;
			for (; k < n; k++) 
				if (arr[k] >= n)
					break;
			if (k == n) break;
			for (int i = 0; i < n; i++) {
				long temp = arr[i]/n;
				arr[i] = arr[i]%n;
				for (int j = 0; j < n; j++) {
					if (j == i) continue;
					arr[j] += temp;
				}
				count += temp;
			}
		}
		System.out.println(count);
	}
}