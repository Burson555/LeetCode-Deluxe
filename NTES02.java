import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) {
		// ***********************
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int t = cin.nextInt();
		int monsters[][] = new int[n][2];
		int max_time = 0;
		for (int i = 0; i < n; i++) {
			monsters[i][0] = cin.nextInt();
			max_time = (monsters[i][0] > max_time) ? monsters[i][0] : max_time;
			monsters[i][1] = cin.nextInt();
		}
		Arrays.sort(monsters, (a,b) -> b[0]-a[0]);
		// ***********************
		PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
		int bound = t*(max_time/t);
		int res = 0, i = 0;
		for (; bound >= 0; bound -= t) {
			while (i < n && monsters[i][0] >= bound)
				pq.offer(monsters[i++][1]);
			if (pq.peek() != null) res += pq.poll();
		}
		System.out.print(res);
	}
}