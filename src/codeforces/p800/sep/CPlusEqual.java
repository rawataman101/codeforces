package codeforces.p800.sep;

import java.util.Scanner;

public class CPlusEqual {
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

//	The worst-case time complexity is O(log(c)), as the Fibonacci numbers grow exponentially, and it takes approximately log(c) iterations for F_i to exceed c.
	private static void sol(int a, int b, int c) {
		int count = 0;
		while (true) {
			if (a > c || b > c) {
				break;
			}
			int max = Math.max(a, b);
			if (max == a) {
				b += a;
			} else {
				a += b;
			}

			count++;
		}
		System.out.println(count);

	}

}
