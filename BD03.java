import java.io.*;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	// *********************** 
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int[] values = new int[n+1];
		for (int i = 1; i <= n; i++) 
			values[i] = cin.nextInt();
		HashMap<Integer, HashSet<Integer>> hm = new HashMap<>();
	// *********************** read edges
		for (int i = 0; i < n-1; i++) {
			int temp1 = cin.nextInt();
			int temp2 = cin.nextInt();
			if (values[temp1] == values[temp2]) {
				continue;
			} else if (values[temp1] < values[temp2]) {
				if (!hm.containsKey(temp1))
					hm.put(temp1, new HashSet<Integer>());
				hm.get(temp1).add(temp2);
			} else {
				if (!hm.containsKey(temp2))
					hm.put(temp2, new HashSet<Integer>());
				hm.get(temp2).add(temp1);
			}
		}
	// *********************** 
		int length = 1;
		if (hm.keySet().isEmpty()) {
			System.out.println(length);
			return;
		} // edge case: all nodes have the same value
		HashSet<Integer> hs = new HashSet<>();
		for (int src : hm.keySet()) {
			for (int dst : hm.get(src)) {
				hs.add(dst);
			}
		}
		length++;
		while (true) {
			HashSet<Integer> temp = new HashSet<>();
			for (int src : hs) {
				if (!hm.containsKey(src)) continue;
				for (int dst : hm.get(src)) {
					temp.add(dst);
				}
			}
			if (temp.isEmpty()) break;
			length++;
			hs = temp;
		}
		System.out.println(length);
	}
}
