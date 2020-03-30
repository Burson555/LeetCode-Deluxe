import java.io.*;
import java.lang.StringBuilder;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	// *********************** 
		Scanner cin = new Scanner(System.in);
		int n = Integer.parseInt(cin.nextLine());
		String[] strings = cin.nextLine().split(" ");
		String s1 = strings[0];
		String s2 = strings[1];
		int l1 = s1.length();
		int l2 = s2.length();
	// *********************** count char
		int count_1[] = new int[26];
		int count_2[] = new int[26];
		for (int i = 0; i < l1; i++) count_1[s1.charAt(i)-'a'] += 1;
		for (int i = 0; i < l2; i++) count_2[s2.charAt(i)-'a'] += 1;
	// ***********************
		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < 26; j++) {
			if (count_1[j] == 0 && count_2[j] == 0) continue;
			if (n == 1) sb.append((char)('a'+j)).append(":").append(count_1[j]);
			else if (n == 2) sb.append((char)('a'+j)).append(":").append(count_2[j]);
			else {
				int t1 = count_1[j];
				int t2 = count_2[j];
				for (int i = 3; i < n; i++) {
					t2 = t1 + t2;
					t1 = t2 - t1;
				}
				sb.append((char)('a'+j)).append(":").append(t1+t2);
			}
			if (j != 25) sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}