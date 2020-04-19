import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	// ***********************
		Scanner cin = new Scanner(System.in);
		int n = Integer.parseInt(cin.nextLine());
		String[] strings = cin.nextLine().split(" ");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) 
			arr[i] = Integer.parseInt(strings[i]);
		Arrays.sort(arr);
		// for (int i = 0; i < n; i++)
		// 	System.out.println(arr[i]);
		long res = 0;
		for (int i = 0; i < n; i++)
			if (i % 3 == 2) continue;
			else res += (long)arr[n-1-i];
		System.out.println(res);
	}
}