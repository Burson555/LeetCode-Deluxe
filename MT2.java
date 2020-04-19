import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		int num_circle = Integer.parseInt(cin.nextLine());
		String[] temp = cin.nextLine().split(" ");
		int radiuses[] = new int[num_circle];
		for (int i = 0; i < num_circle; i++) {
			radiuses[i] = Integer.parseInt(temp[i]);
		}
		Arrays.sort(radiuses);
		int modifier = 1;
		double res = 0;
		for (int i = num_circle-1; i >= 0; i--) {
			double radius = (double)radiuses[i];
			res += (double)modifier*radius*radius*Math.PI;
			modifier *= -1;
		}
		System.out.printf("%.5f", res);
	}
}