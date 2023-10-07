package codeforces.p800.oct;

import java.util.Scanner;

public class Elections {
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
		int aCan = Math.max(0, Math.max(b, c) - a + 1);
		int bCan = Math.max(0, Math.max(a, c) - b + 1);
		int cCan = Math.max(0, Math.max(b, a) - c + 1);
		System.out.println(aCan + " " + bCan + " " + cCan);
	}

}
