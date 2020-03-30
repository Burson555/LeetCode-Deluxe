import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.*;
import java.util.Scanner;

public class Main {
public static void main(String[] args) 
	{
		// INPUT PROCESSING
		Scanner cin = new Scanner(System.in);
		int n = Integer.parseInt(cin.nextLine());
		int lower[] = new int[n]; 
			// the lower bounds of each range l1 l2 ... rn
		int upper[] = new int[n]; 
			// the upper bounds of each range u1 u2 ... un
		String lower_temp = cin.nextLine().split(" ");
		String upper_temp = cin.nextLine().split(" ");
		int size[] = new int[n]; // size of each range
		for (int i = 0; i < n; i++) {
			lower[i] = Integer.parseInt(lower_temp[i]);
			upper[i] = Integer.parseInt(upper_temp[i]);
			size[i] = upper[i] - lower[i] + 1;
		}
		// FIND THE RANGE OF MINIMUMS 
		// inclusive upper bound U of the range: U = min(u1 u2 ... un)
		// inclusive lower bound L of the range: L = min(l1 l2 ... ln)
		int L = lower[0], U = upper[0];
		for (int i = 0; i < n; i++) {
			L = (lower[i] < L) ? lower[i] : L;
			U = (upper[i] < U) ? upper[i] : U;
		}
		// ITERATE THOUGH ALL POSSIBLE MINIMUM
		double res = 0;
		int total = 0, count = 0;
		for (int min = L; min <= U; min++) {
			int count = count(lower, upper, min);
			res += count*min; // count*min <= 4E6
			int numerator[] = new int[n];
			for (int i = 0; i < n; i++)
		}
	}
}