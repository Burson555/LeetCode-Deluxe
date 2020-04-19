import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	// *********************** 
		Scanner cin = new Scanner(System.in);
		int n = Integer.parseInt(cin.nextLine());
		for (int i = 0; i < n; i++) {
			String s = cin.nextLine();
			int counter[] = new int[26];
			int m = s.length();
			for (int j = 0; j < m; j++) counter[s.charAt(j)-'a'] += 1;
			int num_odd = 0;
			for (int j = 0; j < 26; j++) 
				if (counter[j]%2 == 1)
					num_odd += 1;
			if (num_odd%2 == 0) System.out.println("Eleanore");
			else System.out.println("Cassidy");
		}
	}
}