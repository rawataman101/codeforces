package codeforces.p800.oct;

import java.util.Scanner;

public class WhoOpposite {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			sol(a, b, c);
		}
	}

//O(1)
	private static void sol(int a, int b, int c) {
		int n = 2 * Math.abs(a - b);
		if (a > n || b > n || c > n) {
			System.out.println(-1);
		} else {
			int d = n / 2 + c;
			while (d > n)
				d -= n;
			System.out.println(d);
		}

	}
}
