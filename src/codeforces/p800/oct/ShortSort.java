package codeforces.p800.oct;

import java.util.Scanner;

public class ShortSort {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			String str = s.next();
			sol(str);
		}
	}

	private static void sol(String str) {
		System.out.println(str.equals("bca") || str.equals("cab") ? "NO" : "YES");
	}

}
