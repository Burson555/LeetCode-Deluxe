import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	// *********************** 
		Scanner cin = new Scanner(System.in);
		long n = cin.nextLong();
		System.out.println(n*(n-1)-1);
	}
}