import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
import java.lang.StringBuilder;

public class Main {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		String original = cin.nextLine();
		String[] map = cin.nextLine().split(" ");
		HashMap<String, String> hm = new HashMap<>();
		String temp = "123456789";
		for (int i = 1; i <= 9; i++)
			hm.put(temp.substring(i-1, i), map[i-1]);
		StringBuilder sb = new StringBuilder();
		int i = 0, length = original.length();
		if (original.charAt(i) == '-') {
			sb.append('-');
			i++;
		}
		for (; i < length; i++) {
			sb.append(hm.get(original.substring(i, i+1)));
		}
		System.out.println(sb.toString());
	}
}