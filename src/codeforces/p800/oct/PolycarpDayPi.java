package codeforces.p800.oct;

import java.util.Scanner;

public class PolycarpDayPi {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		final String og = "314159265358979323846264338327";
		while (t-- > 0) {
			String str = s.next();
			sol(str, og);
		}
	}
	//O(1)
	private static void sol(String str, String og) {
		int count = 0;
		if (str.length() == 0 || str == null || str.charAt(0) == '0') {
			System.out.println(0);
		} else {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == og.charAt(i)) {
					count++;
				} else {
					break;
				}
			}
			System.out.println(count);
		}
	}
}
