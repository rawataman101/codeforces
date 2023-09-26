package codeforces.p800.sep;

import java.util.Scanner;

public class FashionabLee {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			sol(n);
		}
	}

	private static void sol(int n) {
		System.out.println(n % 4 == 0 ? "YES" : "NO");

	}
}
