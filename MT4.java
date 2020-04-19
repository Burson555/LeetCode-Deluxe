import java.io.*;
import java.util.Scanner;
import java.util.HashSet;

public class Main {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		int n = Integer.parseInt(cin.nextLine());
		String[] temp = cin.nextLine().split(" ");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(temp[i]);
		}
		HashSet<Integer> hs = new HashSet<>();
		int count = 0;
		for (int length = n; length >= 1; length--) {
			for (int i = 0; i <= n - length; i++) {
				if (hs.contains(i) || length == 1) {
					count = (count + 1) % 998244353;
					continue;
				}
				int j = 1;
				for (; j <= length; j++) {
					if (arr[i+j-1] % j != 0) break;
				}
				if (j == length+1) {
					count = (count + 1) % 998244353;
					hs.add(i);
				}
			}
		}
		System.out.println(count);
	}
}