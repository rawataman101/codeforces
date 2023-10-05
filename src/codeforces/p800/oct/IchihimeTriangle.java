package codeforces.p800.oct;

import java.util.Scanner;

//O(1)
public class IchihimeTriangle {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			int d = s.nextInt();
			System.out.printf("%d %d %d", b, c, c);
			System.out.println();
		}

	}

}
