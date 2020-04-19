import java.io.*;
import java.lang.Math;
import java.lang.StringBuilder;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	// ***********************
		Scanner cin = new Scanner(System.in);
		String[] strings = cin.nextLine().split(" ");
		int n = Integer.parseInt(strings[0]);
		int k = Integer.parseInt(strings[1]);
		String s = cin.nextLine();
		int arr[] = new int[n];
		int i = 0;
		for (char c : s.toCharArray()) arr[i++] = c-'0';

	// ***********************
		int[] res = findNumber(arr, n, k);
		System.out.println(res[1]);

	// ***********************
		System.out.println(reorder(arr, n, k, res[0]));
	}

	private static int[] findNumber(int[] arr, int n, int k) {
		int res = 0, min_sum = Integer.MAX_VALUE;
		for (int curr = 0; curr < 10; curr++) {
			int temp_arr[] = new int[n];
			for (int i = 0; i < n; i++) temp_arr[i] = Math.abs(arr[i] - curr);
			Arrays.sort(temp_arr);
			int temp_sum = 0;
			for (int i = 0; i < k; i++) temp_sum += temp_arr[i];
			if (temp_sum < min_sum) {
				res = curr;
				min_sum = temp_sum;
			}
		}
		return new int[]{res, min_sum};
	}

	private static String reorder(int[] arr, int n, int k, int number) {
		int count = 0;
		for (int i : arr) 
			if (i == number) 
				count += 1;
		for (int diff = 1; diff < 10; diff++) {
			if (count >= k) break;
			int target = number + diff;
			if (target < 10) {
				for (int i = 0; i < n; i++) {
					if (arr[i] == target) {
						arr[i] = number;
						count++;
						if (count == k) break;
					}
				}
			}
			if (count == k) break;
			target = number - diff;
			if (target >= 0) {
				for (int i = n-1; i >= 0; i--) {
					if (arr[i] == target) {
						arr[i] = number;
						count++;
						if (count == k) break;
					}
				}
			}
			if (count == k) break;
		}
		StringBuilder sb = new StringBuilder();
		for (int i : arr) sb.append(i);
		return sb.toString();
	}
}