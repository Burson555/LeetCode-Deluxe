import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	// *********************** 
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int m = cin.nextInt();
		int a = cin.nextInt();
		int b = cin.nextInt();
		int min_cost = Integer.MAX_VALUE;
		for (int num_rpkt = 0; num_rpkt < n; num_rpkt++) {
			int temp_cost = a*num_rpkt;
			int avg_gift = (m-1)/(n-num_rpkt) + 1;
			int num_gift = avg_gift*(n-num_rpkt) - m;
			temp_cost += b*num_gift;
			if (temp_cost < min_cost) min_cost = temp_cost;
		}
		System.out.println(Integer.min(min_cost, n*a));
	}
}