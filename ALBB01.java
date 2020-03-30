import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in);
		String s = cin.nextLine();
		String t = cin.nextLine();
		int n = s.length();
		int char_count[] = new int[26];
		Arrays.fill(char_count, 0);
		int len_prefix = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == t.charAt(len_prefix)) len_prefix++;
			char_count[t.charAt(i)-'a'] += 1;
			char_count[s.charAt(i)-'a'] -= 1;
		}
		for (int i = 0; i < 26; i++) {
			if (char_count[i] != 0) {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(n-len_prefix);
	}
}