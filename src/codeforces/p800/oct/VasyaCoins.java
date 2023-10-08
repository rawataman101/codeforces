package codeforces.p800.oct;

import java.util.Scanner;

public class VasyaCoins {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int a = s.nextInt();
			int b = s.nextInt();
			sol(a, b);
		}
	}

	//O(1)
	private static void sol(int a, int b) {
		if (a == 0) {
			System.out.println(1);
		} else {
			System.out.println(a + 2 * b + 1);
		}

	}

}
