import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	// ***********************
		Scanner cin = new Scanner(System.in);
		String[] strings = cin.nextLine().split(" ");
		int n = Integer.parseInt(strings[0]);
		int k = Integer.parseInt(strings[1]);
		strings = cin.nextLine().split(" ");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) 
			arr[i] = Integer.parseInt(strings[i]);
		Arrays.sort(arr);
		int res = arr[0], count = 1, max_count = 1;
		for (int i = 0; i < n; i++) {
			while (i+1 < n && arr[i+1] == arr[i]) {
				count += 1; i++;
			}
			if (count > max_count) max_count = count;
			count = 1;
		}

	// ***********************
		System.out.println(max_count);
	}
}